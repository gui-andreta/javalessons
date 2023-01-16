package exercicios;

import java.util.Scanner;


public class desafioconvertionrefatorado {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String salario1, salario2, salario3;
        double num1, num2, num3, med;
        
        System.out.print("Coloque o 1º salário: ");
        salario1 = scan.next().replace(",", ".");

        System.out.print("Coloque o 2º salário: ");
        salario2 = scan.next().replace(",", ".");

        System.out.print("Coloque o 3º salário: ");
        salario3 = scan.next().replace(",", ".");

        scan.close();

        num1 = Double.parseDouble(salario1);
        num2 = Double.parseDouble(salario2);
        num3 = Double.parseDouble(salario3);

        med = (num1 + num2 + num3) / 3;

        System.out.println("A média de seus salário é: R$ " + med);
    }
}
