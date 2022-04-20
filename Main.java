import java.util.Scanner;

public class Main {
    public static void main (String[] args){
    int fat = 1;
    Scanner fatorial = new Scanner(System.in);
    System.out.println("Digite o numero que quer fatorar: ");
    int valor = fatorial.nextInt();

    if (valor > 0){
    for(int i = 2; i <= valor; i++){ 
        fat *= i;
    }
         System.out.println( "O fatorial de " + valor + " é igual a " + fat );
    } else {
        System.out.println("O valor é menor ou igual a 0, portanto inválido.");
        fatorial.close();
} 
}
}