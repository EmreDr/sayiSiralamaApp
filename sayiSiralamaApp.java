import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz");
        a = sc.nextInt();
        System.out.print("2.Sayıyı Giriniz");
        b = sc.nextInt();
        System.out.print("3: sayıyı Giriniz");
        c = sc.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("a>b>c");
            } else {
                System.out.println("a>c>b");
            }
        } else if ((b > a) && (b > c)) {
            if (c > a) {
                System.out.println("b>c>a");
            } else {
                System.out.println("b>a>c");
            }
        } else {
            if (b > a) {
                System.out.println("c>b>a");
            } else {
                System.out.println("c>a>b");
            }

        }


    }
}


