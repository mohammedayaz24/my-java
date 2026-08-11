public class palindrome {
    public static void main(String[] args) {
        String str = "madam";
        int num = 121;
        String reversed = reverse(str);
        boolean ans = palindrom(str,reversed);
        System.out.print(ans);
    }

    public static String reverse(String str){
        String rev = "";

        for(int i = str.length()-1; i>=0;i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    public static boolean palindrom(String str, String rev){
        if(str.equals(rev)){
            return true;
        }
        return false;
    }
}
