package rechnen;

import javax.swing.*;

public class Mathe1 {

	public static void main(String[] args) {
		
		float Result = 0;
		String Text = "The result is: ";
		
		try 
		{
			
		//Eingabe der Zahlen und des Operators über ein Eingabefeld als String
		String Input1 = JOptionPane.showInputDialog("Please enter a number: ");
		String Input2 = JOptionPane.showInputDialog("Please enter another number: ");
		String Operator = JOptionPane.showInputDialog("Please enter an Operator: ");
		
		float Number1 = Float.parseFloat(Input1);			//Umwandeln (parsen) des Strings "Input1" in ein Integer "Number1"
		float Number2 = Float.parseFloat(Input2);			//Umwandeln (parsen) des Strings "Input2" in ein Integer "Number2"
		
		//If-Abfrage welcher Operator und entsprechendes berechnen der Zahlen.
		if (Operator.equals ("+"))
			Result = Number1 + Number2;
		if (Operator.equals ("-"))
			Result = Number1 - Number2;
		if (Operator.equals ("*"))
			Result = Number1 * Number2;
		if (Operator.equals ("/"))
			if (Number2 != 0) Result = Number1 / Number2;
			else JOptionPane.showMessageDialog (null, "Division by Zero will kill the whole world!");
		}
		catch (Exception x)
		{
			Text = "Doesn't compute!";
		}
		//Ausgabe des Ergebnisses.
		if (Text.equals("The result is: "))
			Text = Text + Result;
		JOptionPane.showMessageDialog (null, Text);

	}

}
