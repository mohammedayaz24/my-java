import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans=sum3(10,20);//function call
        System.out.println("The sum is: " + ans);
    }

    static void sum() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number 1:");
        int num1 = in.nextInt();

        System.out.println("Enter the number 2:");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is :" +sum);
    }

    static int sum2() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number 1:");
        int num1 = in.nextInt();

        System.out.println("Enter the number 2:");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        return sum;
    }


    //pass the value of numbers when you are calling the method in main()
    static int sum3(int a,int b) {
        int sum = a + b;
        return sum;

    }
}
