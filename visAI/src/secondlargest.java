public class secondlargest {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 89, 23, 56};

        int sl = secondlargest(numbers);
        System.out.println(sl);
    }

    public static int secondlargest(int[] numbers){
        int max = numbers[0];
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] > max) {
                smax = max;
                max = numbers[i];
            } else if (numbers[i] < max && numbers[i] > smax) {
                smax = numbers[i];
            }
        }
        return smax;
    }
}
