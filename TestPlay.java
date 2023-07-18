import java.util.Scanner;
public class TestPlay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j;
        int n= input.nextInt();
        for (i=1; i<=n; i++) {
            for (j=1; j<=i; j++) {
    /*
    untuk mencetak bintang tanpa baris baru kita
    gunakan print bukan println
     */
                System.out.print("*");
            }
            System.out.println();
            //ini untuk menciptakan line baru
        }
    }
}
