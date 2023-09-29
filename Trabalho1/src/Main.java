import planetas.Python;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Python python = new Python("Python");

        Scanner sc = new Scanner(System.in);



        python.exibirPosicao();

        int momento = sc.nextInt();
        python.mover(momento);

        python.exibirPosicao();

    }
}