import java.util.Scanner;
import javax.swing.JOptionPane;
public class Kriptoloji {
	static void sifrele() {
		String password = JOptionPane.showInputDialog("�ifrelenecek kelime : ");
		char sifreleme[] = password.toCharArray();
		String new_password = "";
		for(int i = 0;i<sifreleme.length;i++) {
			new_password+=(char)(sifreleme[i]+1);
		}
		JOptionPane.showMessageDialog(null, "�ifrelenecek kelime : "+password+"\n�ifrelenmi� hali : "+new_password);
	}
	static void coz() {
		String password = JOptionPane.showInputDialog("�ifresi ��z�lecek kelime : ");
		char sifreleme[] = password.toCharArray();
		String new_password = "";
		for(int i = 0;i<sifreleme.length;i++) {
			new_password += (char)(sifreleme[i]-1);}
		JOptionPane.showMessageDialog(null, "�ifrelenmi� kelime : "+password+"�ifresi ��z�mlenmi� hali :"+new_password);
	}
	public static void main(String args[]) {
		String cumle = JOptionPane.showInputDialog("�ifreleme i�in S - �ifre ��zme icin C ye bas");
		if(cumle.equals("S")) {
			sifrele();
		}
		else if(cumle.equals("C")) {
			coz();
		}		
		else {
			JOptionPane.showMessageDialog(null, "Senin �ifrelenmi� halin : GER�ZEKALI");
		}
	}
}
