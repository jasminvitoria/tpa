import java.util.*;
class Exercicio5{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int matriz[][] = new int [5][5];
        int i = 0 ;
        int j = 0 ; 
        for(i=0; i<5; i++){
            for (int j=0;j<5;j++ ) {
                matriz[i][j] = leia.nextInt();
            }
        }
       
        for(i=0;i<5;i++){
            System.out.print(matriz[i][i]+" ");
            i++;
        }
    }
}