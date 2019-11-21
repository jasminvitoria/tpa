import java.util.*;
class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int m[][] = new int[5][5];
        int i = 0;

        for (i=0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = entrada.nextInt();
            }
        }
        i = 0;
        for (i=0;i < 5;i++) {
            System.out.print(m[i][i]); 
            System.out.print(" ");
        }
    }
}