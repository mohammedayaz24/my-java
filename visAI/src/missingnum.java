public class missingnum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        int missingnum = missingnumber(arr);
        System.out.println(missingnum);
    }

    public static int missingnumber(int[] arr){
        long n = arr.length + 1;

        int sum = 0;
        for(int i = 0; i <= arr.length-1;i++){
            sum += arr[i];
        }
        long expsum = n * (n + 1)/2;
        return (int)(expsum-sum);
    }

}
