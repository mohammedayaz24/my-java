public class smallestelement {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 89, 7, 34, 23};
        int ln = findsmallest(numbers);

        System.out.println(ln);
    }

    public static int findsmallest(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] < min) {
                min = numbers[i];

            }
        }
        return min;
    }
}

