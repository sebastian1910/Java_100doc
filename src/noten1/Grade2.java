package noten1;

import javax.swing.*;

public class Grade2 {

	public static void main(String[] args) {
		
		String Note = JOptionPane.showInputDialog("Enter a Grade between 1 and 6: ");
		
		int Wert = Integer.parseInt (Note);
		
		if (Wert == 1) Note = "sehr gut";
		if (Wert == 2) Note = "gut";
		if (Wert == 3) Note = "befriedigend";
		if (Wert == 4) Note = "ausreichend";
		if (Wert == 5) Note = "mangelhaft";
		if (Wert == 6) Note = "ungenügend";
		
		JOptionPane.showMessageDialog (null, "Das ist " + Note);

	}

}
