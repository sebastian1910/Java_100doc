package einaus1;

import javax.swing.*;

public class Hallo2 {

	public static void main(String[] args) {
		
		String Name = JOptionPane.showInputDialog ("Halle wer bist Du?");
		String Antwort = JOptionPane.showInputDialog (Name + " wie geht es Dir?");
		
		if (Antwort.equals ("gut"))
			System.out.println ("Das freut mich!");
		if (Antwort.equals ("schlecht"))
			System.out.println ("Das tut mir leid!");

	}

}
