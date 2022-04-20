import java.util.Scanner;

public class MainE {
    public static void main(String[] args){
        Scanner valores = new Scanner(System.in);
        System.out.println("Digite a Velocidade Inicial(V0): ");
        int vInicial = valores.nextInt();
        System.out.println("Digite o Espaço Inicial(S0): ");
        int vEspaco = valores.nextInt();
        System.out.println("Digite o Valor da Aceleração(a): ");
        int vAceleracao = valores.nextInt();
        System.out.println("Digite o Valor do Tempo/Instante(t): ");
        int vTempo = valores.nextInt();
        valores.close();

        int Vot = vInicial * vTempo;
        int At = vAceleracao * vTempo;
        int resultado = vEspaco + Vot + ((At * At) / 2);
        
        System.out.println("O valor de S é: " + resultado);
    }
}

