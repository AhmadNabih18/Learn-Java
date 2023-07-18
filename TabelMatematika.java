import java.util.Scanner;

public class TabelMatematika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0; i<n+1; i++){
            for (int j = 0; j<n; j++){
                if (i==0 || i==n || j==0 || j==n-1)
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
