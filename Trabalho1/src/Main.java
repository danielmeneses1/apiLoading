import planetas.Python;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Python python = new Python("Python");

        Scanner sc = new Scanner(System.in);



        System.out.println(python.getPosicaoX());
        System.out.println(python.getPosicaoY());

        int momento = sc.nextInt();
        python.mover(momento);


        System.out.println(python.getPosicaoX());
        System.out.println(python.getPosicaoY());
    }
}