import java.util.Scanner;

public class Switchcase {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

//        int x = in.nextInt();
//        int y = in.nextInt();
//        int z = in.nextInt();
        System.out.print("Masukan Nilai : ");
        int a = in.nextInt();
        switch (a){
            case 1 :
                System.out.println("a");
                break;
            case 2 :
                System.out.println("b");
                break;
            case 3 :
                System.out.println("c");
                break;
            case 4 :
                System.out.println("d");
                break;
        }

    }
}
