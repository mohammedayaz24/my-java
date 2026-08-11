import java.util.HashSet;

public class duplicate {
    public static void main(String[] args) {
        int[] arr= {1, 3, 4, 2, 2};
        int dp = findduplicate(arr);
        System.out.println(dp);
    }

    public static int findduplicate(int[] arr){
        HashSet st = new HashSet<>();

        for(int i = 0; i <= arr.length-1;i++){
            if(st.contains(arr[i])){
                return arr[i];
            }
            else{
                st.add(arr[i]);
            }
        }
        return -1;
    }
}
