package app;
import java.util.Scanner;
public class Fibonacci {
    static void calculoFibonacci(int n){
        int v1 = 0;
        int v2 = 1;
        int vN;
        int cont = 3; //Dando o valor 3 a variavel pois os tres primeiros termos já são padrões 0-1-1
        System.out.print("0 1 ");
        while (cont <= n){
            vN = v1 + v2;
            System.out.printf(vN + " ");
            v1 = v2;
            v2 = vN;
            cont += 1;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos termos da sequencia de fibonacci você quer mostrar?");
        int v = input.nextInt();
        calculoFibonacci(v);
        input.close();
    }

}
