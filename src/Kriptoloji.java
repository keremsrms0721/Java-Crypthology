import java.util.Scanner;
import javax.swing.JOptionPane;
public class Kriptoloji {
	static void sifrele() {
		String password = JOptionPane.showInputDialog("Þifrelenecek kelime : ");
		char sifreleme[] = password.toCharArray();
		String new_password = "";
		for(int i = 0;i<sifreleme.length;i++) {
			new_password+=(char)(sifreleme[i]+1);
		}
		JOptionPane.showMessageDialog(null, "Þifrelenecek kelime : "+password+"\nÞifrelenmiþ hali : "+new_password);
	}
	static void coz() {
		String password = JOptionPane.showInputDialog("Þifresi çözülecek kelime : ");
		char sifreleme[] = password.toCharArray();
		String new_password = "";
		for(int i = 0;i<sifreleme.length;i++) {
			new_password += (char)(sifreleme[i]-1);}
		JOptionPane.showMessageDialog(null, "Þifrelenmiþ kelime : "+password+"Þifresi çözümlenmiþ hali :"+new_password);
	}
	public static void main(String args[]) {
		String cumle = JOptionPane.showInputDialog("Þifreleme için S - Þifre çözme icin C ye bas");
		if(cumle.equals("S")) {
			sifrele();
		}
		else if(cumle.equals("C")) {
			coz();
		}		
		else {
			JOptionPane.showMessageDialog(null, "Senin þifrelenmiþ halin : GERÝZEKALI");
		}
	}
}
