public class MainB {
    public static void main(String[] args){
        int limite = 1000;
        int soma = 0;
        while(limite>0){
            if(limite%3 == 0 || limite%5 == 0){
                soma = soma+limite;
            }
            limite = limite-1;
            }
            System.out.println("O valor é:" + soma);
    }
}
