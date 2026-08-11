public class reverse {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        reverse(numbers);

        for (int num : numbers) {
            System.out.println(num);
        }
    }
    public static void reverse(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
    }
}