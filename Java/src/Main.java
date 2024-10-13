import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String n;

        System.out.print("Qual e o seu Nome? ");
        n = sc.nextLine();

        System.out.println("Ola " + n + ", seja bem vindo!");

    }
}