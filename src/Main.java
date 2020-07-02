import java.util.Scanner;

/**
 * Created by KPS on 7/2/2020.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("please enter a number");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("please enter another number");
        int b = scanner.nextInt();
        int produkt = a*b;
        System.out.println("Produkt : "+produkt);
    }
}
