import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalHexa {
    public static void main(String[] args) {
        boolean finalizar = true;
        while(finalizar){
            System.out.println("N° Inteiro: ");
            Scanner scanner = new Scanner(System.in);
            int dec = scanner.nextInt();
            int restoDiv;
            Boolean valorNegativo = dec < 0;

            if(dec == 0){
                System.err.println("Não é possível calcular com o zero!");
                return;
            }
            dec = dec < 0 ? -dec: dec;
            Stack<Integer> stack = new Stack<Integer>();

            while(true){
                restoDiv = dec % 16;
                stack.push(restoDiv);
                dec = dec / 16;

                if(dec < 16){
                    if(dec != 0)
                        stack.push(dec);
                    break;
                }
            }
            if(valorNegativo){
                System.out.print("-");
            }

            do{
                int topo = stack.pop();
                if(topo >= 10 && topo < 16){
                    char[] letras = new char[]{'a','b','c','d','e','f'};
                    char hex = letras[topo - 10];
                    System.out.print(hex);
                }

                else{
                    System.out.print(topo);
                }

            }while(!stack.isEmpty());

            System.out.println("Quer continuar? [Sim = 0/Não = 1]");
            Scanner scanner2 = new Scanner(System.in);
            int resposta = scanner2.nextInt();
            if (resposta == 1) {
                finalizar = false;
            }
        }
    }
}