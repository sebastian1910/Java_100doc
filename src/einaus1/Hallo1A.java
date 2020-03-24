package einaus1;

import javax.swing.JOptionPane;

public class Hallo1A {

	public static void main(String[] args) {
		
		String Name = JOptionPane.showInputDialog("Hallo wer bist Du?");
		String Antwort = JOptionPane.showInputDialog (Name + " wie geht es?");
		
		System.out.println ("Dir geht es also " + Antwort + "!");

	}

}
