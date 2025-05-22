import java.util.Scanner;

public class CalCalculus {
    public static void main(String[] args) {
        String Al ;
        double ValCarb, ValProt, ValLip,cal1, cal2, cal3, Calorias ;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o Alimento: ");
        Al = teclado.next();
        System.out.println("Qual a quantidade de carboidratos: ");
        ValCarb = teclado.nextDouble();
        System.out.println("Qual a quantidade de proteinas: ");
        ValProt = teclado.nextDouble();
        System.out.println("Qual a quantidade de gorduras: ");
        ValLip = teclado.nextDouble();
        //Contas malditas
        cal1 = ValCarb*4;
        cal2 = ValProt*4;
        cal3 = ValLip*9;
        Calorias = cal1+cal2+cal3;




        System.out.println("O Valor calórico do Alimento: "+Al+". É de: "+Calorias+ " Calorias");
    }
}
