/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        int sub = num1 - num2;

        System.out.println("A subtraçao é: " + sub);

    int mult = num1 * num2;
    
    System.out.println("A multiplicaçao é: " + mult);
    
    int div = num1 / num2;
    
    System.out.println("A divisao é: " + div);
        sc.close();
    }
}
