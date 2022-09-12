package task_01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = getRandomInt();
            }
        }

        System.out.println("Array: ");
        Arrays.stream(array).map(Arrays::toString).forEach(System.out::println);
        printMinMaxAvg(array);
    }

    private static void printMinMaxAvg(int[][] array) {
        int max = array[0][0];
        int min = array[0][0];
        float sum = 0.0f;
        float count = 0.0f;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] >= max) {
                    max = array[i][j];
                }

                if (array[i][j] <= min) {
                    min = array[i][j];
                }

                sum += array[i][j];
                count++;
            }
        }

        System.out.println(String.format("\nMin value: %d \nMax value: %d \nAvg: %.2f", min, max, sum / count));
    }

    private static int getRandomInt() {
        try {
            Thread.sleep(9);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int x = (int) System.currentTimeMillis() % 1000;
        if (x % 2 == 0) {
            x *= -1;
        }
        return x / 10;
    }
}