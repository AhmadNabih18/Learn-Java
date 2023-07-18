import java.util.Scanner;

public class PerkalianTabel {

    public static void main (String[] args){
        Scanner input= new Scanner (System.in);
        int n = input.nextInt();
            for (int i=1; i<=n; i++ ){
                System.out.print(i + " | ");

                for (int j=1; j<=n; j++){
                    System.out.printf("%4d", i*j);
                }
                System.out.println();
            }
    }
}
