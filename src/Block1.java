import java.util.Scanner;

public class Block1 {

    public static void main(String[] args) {
        Hello();
        VivodPoFormyle();
    }
    static void Hello(){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter name");
                System.out.println("Hello " + scanner.nextLine());

    }

    static  void VivodPoFormyle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter b and c: ");
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double a = 4*(b+c-1) / 3;
        System.out.println("a equal: " + a);
    }

}
