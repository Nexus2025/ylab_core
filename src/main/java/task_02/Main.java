package task_02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        test();

        int[] array = new int[]{5, 6, 3, 2, 5, 1, 4, 9};
        sort(array);
        System.out.println(String.format("Result: %s", Arrays.toString(array)));
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];

            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < arr[j]) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }

            arr[j + 1] = value;
        }
    }

    private static void test() {
        int[] expected1 = {1, 2, 3, 4, 5, 5, 6, 9};
        int[] actual1 = {5, 6, 3, 2, 5, 1, 4, 9};
        sort(actual1);
        assert (Arrays.equals(expected1, actual1));

        int[] expected2 = {-5, 2, 3, 4, 5, 5, 9, 1000};
        int[] actual2 = {5, 1000, 3, 2, 5, -5, 4, 9};
        sort(actual2);
        assert (Arrays.equals(expected2, actual2));

        int[] expected3 = {2, 2, 2, 2, 2, 2, 2, 2};
        int[] actual3 = {2, 2, 2, 2, 2, 2, 2, 2};
        sort(actual3);
        assert (Arrays.equals(expected3, actual3));

        int[] expected4 = {0, 2, 2, 2, 7, 7, 7, 99};
        int[] actual4 = {2, 7, 7, 2, 7, 99, 2, 0};
        sort(actual4);
        assert (Arrays.equals(expected4, actual4));
    }
}