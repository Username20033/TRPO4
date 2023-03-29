import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Ввод массива:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        radixsort(array);
        System.out.println("Отсортированный массив:");
        for (int h : array)
            System.out.print(h + " ");
    }

    public static int[] radixsort(int[] input) {

        List<Integer>[] buckets = new ArrayList[10];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }


        boolean flag = false;
        int tmp = -1, divisor = 1;
        while (!flag) {
            flag = true;

            for (Integer i : input) {
                tmp = i / divisor;
                buckets[tmp % 10].add(i);
                if (flag && tmp > 0) {
                    flag = false;
                }
            }

            int a = 0;
            for (int b = 0; b < 10; b++) {
                for (Integer i : buckets[b]) {
                    input[a++] = i;
                }
                buckets[b].clear();
            }

            divisor *= 10;
        }
        return input;
    }
}