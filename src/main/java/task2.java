import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int array[] = new int[m];
        System.out.println("Введите значения элементов массива");
        for(int i=0; i<m; i++) {
            array[i] = sc.nextInt();
        }
        reverse(array);
        for (int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }


    }
    public static void reverse(int a[]) {
        int k=0;
        int temp;
        for (int i=0; i<a.length/2; i++){
            temp = a[((a.length -1) - k)];
            a[((a.length - 1) - k)] = a[i];
            a[i] = temp;
            k++;
        }
    }
}
