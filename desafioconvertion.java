package exercicios;
import java.util.Scanner;

public class desafioconvertion {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String salario1, salario2, salario3;
        double num1, num2, num3, med;

        System.out.println("Coloque o 1º salário: ");
        salario1 = scan.nextLine();

        System.out.println("Coloque o 2º salário: ");
        salario2 = scan.nextLine();

        System.out.println("Coloque o 3º salário: ");
        salario3 = scan.nextLine();

        scan.close();

        if(salario1.contains(",") || salario2.contains(",") || salario3.contains(",")){

            if(salario1.contains(",")){

                int indexOf1 = salario1.indexOf(",", 0);
                String sub1 = salario1.substring(0, indexOf1);
                String sub4 = salario1.substring(indexOf1+1);

                String concat1 = sub1 + "." + sub4;
                num1 = Double.parseDouble(concat1);
            }else{

                num1 = Double.parseDouble(salario1);
            }

            if(salario2.contains(",")){

                int indexOf2 = salario2.indexOf(",", 0);
                String sub2 = salario2.substring(0, indexOf2);
                String sub5 = salario2.substring(indexOf2+1);

                String concat2 = sub2 + "." + sub5;
                num2 = Double.parseDouble(concat2);
            }else{

                num2 = Double.parseDouble(salario2);
            }

            if(salario3.contains(",")){

                int indexOf3 = salario3.indexOf(",", 0);
                String sub3 = salario3.substring(0, indexOf3);
                String sub6 = salario1.substring(indexOf3+1);

                String concat3 = sub3 + "." + sub6;
                num3 = Double.parseDouble(concat3);
            }else{
                
                num3 = Double.parseDouble(salario3);
            }

            med = (num1 + num2 + num3) / 3;

            System.out.println("A média de seus salário é: R$ " + med);
            
        }else{

            num1 = Double.parseDouble(salario1);
            num2 = Double.parseDouble(salario2);
            num3 = Double.parseDouble(salario3);

            med = (num1 + num2 + num3) / 3;

            System.out.println("A média de seus salário é: R$ " + med);
        }
    }
}
