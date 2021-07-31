package calculadora_java;

import java.util.Scanner;

public class Main{
    int NUM_1;
    int NUM_2;
    boolean loop;

    public Main(){
        loop = true;

        while(loop == true){ 
            //Entrada
            Scanner sc = new Scanner(System.in);
            System.out.println("\nIngrese num1:");
            String entrada1 = sc.nextLine();
            System.out.println("\nIngrese num2:");
            String entrada2 = sc.nextLine();
            int NUM_1 = Integer.parseInt(entrada1);
            int NUM_2 = Integer.parseInt(entrada2);

            //Pantalla
            System.out.println("\nSuma:");
            System.out.print(sumar(NUM_1,NUM_2));
            System.out.println("\nResta:");
            System.out.print(restar(NUM_1,NUM_2));
            System.out.println("\nMultiplicacion:");
            System.out.print(multiplicar(NUM_1,NUM_2));
            System.out.println("\nDivision:");
            if(NUM_2 != 0){ 
                System.out.print(dividir(NUM_1,NUM_2));
                System.out.println("\n");
            }else{
                System.out.println("No se puede dividir por 0");
                System.out.println("\n");
            }
            
            //Bucle
            System.out.println("Terminar calculo? (1)");
            String seguirBucle = sc.nextLine();
            int a = Integer.parseInt(seguirBucle);
            if(a == 1){   
                loop = false;
            }
        }
    }   

    public int sumar(int NUM_1, int NUM_2){
        int resultado = NUM_1 + NUM_2;     
        return resultado;
    }

    public int restar(int NUM_1, int NUM_2){
        int resultado = NUM_1 - NUM_2;
        return resultado;
    }

    public int multiplicar(int NUM_1, int NUM_2){
        int resultado = NUM_1 * NUM_2;
        return resultado;
    }

    public float dividir(int NUM_1, int NUM_2){
        float resultado = NUM_1 / NUM_2;
        return resultado;
    }

    public static void main(String[] args){   
        new Main();
    }
}
