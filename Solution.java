import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte jarak = in.nextByte();
        int kayu = in.nextInt();
        in.nextLine();
        int hp = 10,jml;
        String jumlah ="";
        String arr[] = new String[jarak];
        for (int i=0;i<jarak;i++)
        {
            arr[i] = in.nextLine().toLowerCase();
            if (arr[i].contains("perbaiki"))
            {
                jumlah = arr[i].substring(9);
                jml = Integer.parseInt(jumlah);
                if (kayu >= 0)
                {
                    kayu -= jml;
                    if (hp <= 100)
                    {
                        hp = hp + jml;
                        if(hp >= 100)
                        {
                            hp = 100;
                        }
                    }else
                    {
                        hp += 0;
                    }
                }else
                {
                    System.out.println("Stock kayu habis!!");
                    hp += 0;
                }
            } else if (arr[i].contains("ombak"))
            {
                jumlah = arr[i].substring(6);
                jml = Integer.parseInt(jumlah);
                kayu -= jml;
                hp = hp - 20;
                if (hp <=0)
                {
                    System.out.println("Tidak Kapal Tenggelam!!!");
                    break;
                }
            }else
            {
                System.out.printf("Kapal sampai tujuan dengan hitpoint %d/100",hp);
                break;
            }
        }
    }
}