import java.util.Arrays;

class ArraysDemo {

    public static void main(String[] args) {

        int[] numbers = {5, 2, 9, 1, 7};
        display("Original array:", numbers);
        Arrays.fill(numbers, 8);
        display("Array after filling with 8:", numbers);
        numbers[1] = 3;
        numbers[3] = 12;
        display("Array after changing two elements:", numbers);
        Arrays.sort(numbers);
        display("Array after sorting:", numbers);
    }

    public static void display(String message, int array[]) {
        System.out.print(message + " ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println(); 
    }
}