import java.util.Scanner;

public class Block3 {
    public static void main(String[] args) {
        ChetnieChisla();
        NeChetnieChisla();
        DeliatsiaNaTriIliDeviat();
        DeliatsiaNa5I9();

    }

    static void ChetnieChisla(){

        Scanner input = new Scanner(System.in);

        int[] array = new int[7];

        System.out.println("Введите 7 целых чисел");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.print ("Введенные числа: ");

        for (int i = 0; i < array.length; i++) {
            System.out.println (" " + array[i]);
        }

        System.out.println("Четные числа из введенных Вами: ");
        for (int i = 0; i <array.length ; i++) {
            if (array[i]%2==0)
            System.out.print(" " +array[i]);

        }


    }

    static void NeChetnieChisla(){

        Scanner input = new Scanner(System.in);

        int[] array = new int[7];

        System.out.println("Введите 7 целых чисел");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.print ("Введенные числа: ");

        for (int i = 0; i < array.length; i++) {
            System.out.println (" " + array[i]);
        }

        System.out.println("Нечетные числа из введенных Вами: ");
        for (int i = 0; i <array.length ; i++) {
            if (array[i]%2!=0)
                System.out.print(" " +array[i]);

        }

    }

    static void DeliatsiaNaTriIliDeviat(){

        Scanner input = new Scanner(System.in);

        int[] array = new int[7];

        System.out.println("Введите 7 целых чисел");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.print ("Введенные числа: ");

        for (int i = 0; i < array.length; i++) {
            System.out.println (" " + array[i]);
        }

        System.out.println("Нечетные числа из введенных Вами: ");
        for (int i = 0; i <array.length ; i++) {
            if (array[i]%3==0 || array[i]%9==0)
                System.out.print(" " +array[i]);

        }

    }

    static void DeliatsiaNa5I9(){

        Scanner input = new Scanner(System.in);

        int[] array = new int[7];

        System.out.println("Введите 7 целых чисел");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.print ("Введенные числа: ");

        for (int i = 0; i < array.length; i++) {
            System.out.println (" " + array[i]);
        }

        System.out.println("Нечетные числа из введенных Вами: ");
        for (int i = 0; i <array.length ; i++) {
            if (array[i]%5==0 && array[i]%7==0)
                System.out.print(" " +array[i]);

        }

    }

}
