import javax.swing.JOptionPane;

public class MainD {
    static void PA(){
        int Sn;
        JOptionPane.showMessageDialog(null, "Aqui iremos calcular a Progressão Aritmética", "PA", JOptionPane.WARNING_MESSAGE);
        int nt = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de termos: "));
        int a1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro termo: "));
        int f = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor final: "));
        Sn = (nt*(a1 + f))/2;

        JOptionPane.showMessageDialog(null, Sn, "Resultado:", JOptionPane.INFORMATION_MESSAGE);
    }

    static void PG (){
        int i = 1;
        int j = 1;
        int Sn;
        JOptionPane.showMessageDialog(null, "Aqui iremos calcular a Progressão Geométrica ", "PG", JOptionPane.WARNING_MESSAGE);
        int a1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor inicial: "));
        int t = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de termos: "));
        int r = Integer.parseInt(JOptionPane.showInputDialog("Digite a razão entre eles: "));

        for (i = 0; i < t; i++){
            j = j*r;
        }

        Sn = (a1*(j-1))/(r-1);

        JOptionPane.showMessageDialog(null, Sn, "Resultado!!", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main (String [] args ){
        JOptionPane.showMessageDialog(null, "Calcular Progressão Geométrica e Progressão Aritmética");
        JOptionPane.showMessageDialog(null, "Para fazer os calculos.\nDigite:\nPA para(Progressão Aritmética)\nE\nPG para(Progressão Geométrica)", "PA e PG", JOptionPane.INFORMATION_MESSAGE);
        String op = JOptionPane.showInputDialog(null, "Digite qual você quer calcular: ");
        
        if (op.equals("PA")){
            PA();
        } 
        if (op.equals("PG")){
            PG();
        }
    }
}