package Programs;
import javax.swing.JOptionPane;
//import java.text.DecimalFormat;
public class pound2kilo {
public static void main(String args[ ]) 	{
    // int kilos = (int) .453592; // converts to kg
    int pounds = (int) 2.54; // converts to centimeters
    pounds= (int)Double.parseDouble(JOptionPane.showInputDialog(null,"pound"));

     // height = (int)Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your height in centimeters"));

     //double BMI = weight/(height*height);

     double kilos = pounds * 0.45359;

    // DecimalFormat fmt = new DecimalFormat("#.##");

     JOptionPane.showMessageDialog(null, "Your Body Mass Index is: " + kilos + ".");
}
}
