import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        /* либо int array[] = new int[size]
        for (int i = 0; i < size; i++) {
        array[i] = (int)(Math.random() * 100)
         */
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(" " + array[i]);
        }
        System.out.println(" ");
        int iMax = array[1];
        int iMin = array[1];
        int indexMax = 0;
        int indexMin = 0;
        int nyl = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > iMax) {
                iMax = array[i];
                indexMax = i;
            } else if (array[i] < iMin) {
                iMin = array[i];
                indexMin = i;
            }
        }
        System.out.println("Максимальный элемент:" + iMax + ". Находится в массиве под индексом: " + indexMax);
        System.out.println("Минимальный элемент:" + iMin + ". Находится в массиве под индексом: " + indexMin);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                nyl++;
            }
        }
        System.out.println("Количество нулевых элементов в массиве: " + nyl);
        for (int i = 0; i < array.length / 2; i++) {
            int z = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = z;
        }
        System.out.println("После выполнения задания №5, массив выглядит следующим образом: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[i + 1]) {
                System.out.println("Массив не является возрастающим");
            }
            break;
        }
    }
}
