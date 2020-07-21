import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][m];
        System.out.println("Введите значения для элементов");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println("array[" + i + "][" + j + "] = ");
                array[i][j] = sc.nextInt();
            }
        }
        toLeft(array);


        }
        public static void toLeft(int array[][]) {
        int i;
        int j;
            for (i = 0; i < array.length; i++) {
                System.out.println("\n");
                for (j = 0; j < array.length - 1; j++) {
                    array[i][j] = array[i][j + 1];
                    System.out.print("[" + i + "][" + j + "] = " + array[i][j] + " ");
                }
                array[i][array.length - 1] = 0;
                System.out.println("[" + i + "][" + j + "] = " + array[i][array.length - 1] + " ");
            }

        }
    }
