import java.util.Arrays;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {

        System.out.println("     Задание 1");

        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int element : arr) {
            sum = sum + element;
        }
        System.out.println("Сумма трат за месяц составила - " + sum + " рублей. ");

        System.out.println("     Задание 2");

        int min = arr[0];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Минимальная сумма затрат за день составила - " + min + " рублей.");
        System.out.println("Максимальная сумма затрат за день составила - " + max + " рублей.");

        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Минимальная сумма затрат за день составила - " + min + " рублей.");
        System.out.println("Максимальная сумма затрат за день составила - " + max + " рублей.");

        Arrays.sort(arr);
        min = arr[0];
        max = arr[arr.length - 1];
        System.out.println("Минимальная сумма затрат за день составила - " + min + " рублей.");
        System.out.println("Максимальная сумма затрат за день составила - " + max + " рублей.");

        System.out.println("     Задание 3");

        double sum1 = 0;
        for (int i : arr) {
            sum1 += i;
        }
        int days = arr.length;
        double average = sum1 / days;
        System.out.println("Средняя сумма трат за месяц составила - " + average + " рублей.");

        System.out.println("     Задание 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}