import java.util.Scanner;

public class Block2 {
    public static void main(String[] args) {
        SymmaDvyhZnachnogoChisla();
        SymmaTrehZnachnogoChisla();
        OkryglenieDoBlizaishegoCelogoChisla();
          RezyltatDeleniaSOstatkom();
    }

    static void SymmaDvyhZnachnogoChisla(){

        int n = 12;
        int sum = 0;
        while(n != 0){
            sum += (n % 10);
            n/=10;
        }
        System.out.println(sum);


    }

    static void SymmaTrehZnachnogoChisla() {

        int n = 123;
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        System.out.println(sum);
    }

    static void OkryglenieDoBlizaishegoCelogoChisla() {

        double n = 12.3;

        System.out.println(Math.round(n));
    }

    static void RezyltatDeleniaSOstatkom() {

        int q=21,w=8;
        int a = q/w;
        int b = q%w;

        System.out.println("21/8 = " + a + " и " + b + " в остатке.");
    }

}
