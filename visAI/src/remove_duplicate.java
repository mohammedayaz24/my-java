import java.util.HashSet;

public class remove_duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int newarr = removeduplicate(arr);

        for(int i = 0; i< newarr;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int removeduplicate(int[] arr){
        HashSet<Integer> st = new HashSet<>();

        int idx = 0;

        for(int i = 0;i <= arr.length-1;i++){
            if(!st.contains(arr[i])){
                st.add(arr[i]);
                arr[idx++] = arr[i];
            }
        }
        return idx;
    }

}
