import java.util.Scanner;
public class Main{
    public static void main (String[]args) {
        Scanner in= new Scanner(System.in);
        int[][]m=new int[3][3];
        boolean isPrimo= true;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m.length;j++){
                System.out.println("inserisci un valore");
                m[i][j]=in.nextInt();
            }

        }
        System.out.println(isDiagonale(m,isPrimo));

    }
    private static boolean isDiagonale(int [][]m,boolean isPrimo){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(m[i][j]!=m[j][i]){
                    isPrimo=false;
                    break;
                }
            }
        }
        return isPrimo;
    }
}