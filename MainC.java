import java.util.Scanner;

public class MainC {
    public static void main(String[] args){
        Scanner valores = new Scanner(System.in);
        System.out.println("Digite o Número de Termos(n): ");
        int vTermo = valores.nextInt();
        System.out.println("Digite o Valor Inicial(a1): ");
        int vInicial = valores.nextInt();
        System.out.println("Digite o Valor Final(an): ");
        int vFinal = valores.nextInt();
        valores.close();

        int resultado = (vTermo * (vInicial + vFinal)) / 2;
        
        System.out.println("o resultado final é: " + resultado);
    }
}

