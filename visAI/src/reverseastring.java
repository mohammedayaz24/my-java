public class reverseastring {
    public static void main(String[] args) {
        String str = "hello";
        String reversed = reverse(str);
        System.out.print(reversed);
    }

    public static String reverse(String str){
        String rev = "";

        for(int i = str.length()-1; i>=0;i--){
            rev += str.charAt(i);
        }
        return rev;
    }
}
