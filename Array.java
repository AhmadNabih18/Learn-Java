import java.util.*;

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int jumlah = sc.nextInt();
        int[] arr = new int[jumlah];

        for(i = 0; i < jumlah; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(i = 0; i < jumlah; i++) {
            if (arr[i] > max){
                max = arr[i];
            } else if(arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println("Hater terbesar memiliki follower sebanyak "+max);
        System.out.println("Hater terkecil memiliki follower sebanyak "+min);
    }
}