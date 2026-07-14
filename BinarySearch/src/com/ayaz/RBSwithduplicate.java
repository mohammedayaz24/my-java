package com.ayaz;

public class RBSwithduplicate {
    public static void main(String[] args) {
        int[] arr = {2,2,9,2,2,2,2};
        System.out.println(findPivot(arr));
    }

    static int search(int[] nums, int target){
        int pivot =  findPivot(nums);
        //if you did nt find pivot array is not pivot
        if(pivot == -1){
            return binarysearch(nums,target,0,nums.length-1);
        }

        //if pivot is found you have 2 asc sorted array
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarysearch(nums,target,0,pivot-1);
        }
        return binarysearch(nums,target,pivot+1,nums.length-1);
    }

    static int binarysearch(int[] arr, int target,int start,int end){
        while(start <= end){
            //find the middle element
            int mid = (start + (end - start) / 2);

            if(target < arr[mid]){
                end = mid-1;
            }else if (target > arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end - start)/2;
            //4 cases
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            //if element is at middle,start,end are eqal then just skip the duplicates
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                //check whthet end is pivot
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(arr[start]<arr[mid] || arr[start]==arr[mid] && arr[mid]> arr[end]) {
                start = mid + 1;
            }else{
                end = end-1;
            }
        }
        return -1;
    }
}


