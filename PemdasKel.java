import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class PemdasKel
{
    public static void main(String[] args)
    {
        int i,j,kali;
        String hasil="";
        String input1 = JOptionPane.showInputDialog(null,"Masukkan baris","Ini buat baris :)",JOptionPane.QUESTION_MESSAGE);
        String input2 = JOptionPane.showInputDialog(null,"Masukkan kolom","Ini buat kolom :)",JOptionPane.QUESTION_MESSAGE);
        int baris = Integer.parseInt(input1);
        int kolom = Integer.parseInt(input2);

        hasil += "\t\t\t";
        for (j=1; j<=kolom; j++)

        {
            hasil += j+"\t|\t";
        }
        hasil += "\n\n";
        for (i=1; i<=baris; i++)
        {
            hasil += "\t"+i+"\t|\t";
            for (j=1; j<=kolom;j++)
            {
                kali = i*j;
                hasil += kali+"\t|\t";
            }
            hasil += "\n\n";
        }
        JTextArea show = new JTextArea(hasil);
        show.setEditable(false);
        show.setOpaque(true);
        show.setTabSize(3);
        JOptionPane.showMessageDialog(null,show,"Tabel Perkalian Anjayyz",JOptionPane.INFORMATION_MESSAGE);
    }
}