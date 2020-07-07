import java.util.Scanner;

public class Diamante {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("¿De cuántos pisos quieres el diamante?");
        int filasDiamante=sc.nextInt();

        for(int i=0;i<=filasDiamante;i++){
            for (int k=filasDiamante-i;k>0;k--){
                System.out.print(" ");
            }
            for (int k=0;k<i;k++){
                System.out.print(" *");
            }
            System.out.println("");
        }
        for(int i=0;i<=filasDiamante;i++){
            for(int k=0;k<=i;k++){
                System.out.print(" ");
            }
            for(int k=filasDiamante-i-1;k>0;k--){
                System.out.print(" *");
            }
            System.out.println("");
        }

    }
}
