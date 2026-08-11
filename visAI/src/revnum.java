public class revnum {
    public static void main(String[] args) {
        int num = 123;
        System.out.println(revnum(num));
    }

    public static int revnum(int num){
        int rev = 0;
        int rem;

        while(num > 0){
            rem = num % 10;
            rev = (rev*10)+rem;
            num = num/10;
        }
        return rev;
    }
}
