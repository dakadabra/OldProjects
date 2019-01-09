package Programs;
import javax.swing.JOptionPane;
//import java.text.DecimalFormat;
public class kilometer2mile {
public static void main(String args[ ]) 	{
    // int kilos = (int) .453592; // converts to kg
    int kilometers;
    kilometers= (int)Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your distance in kilometers:"));

     // height = (int)Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your height in centimeters"));

     //double BMI = weight/(height*height);

     double miles = kilometers * 0.621371;

    // DecimalFormat fmt = new DecimalFormat("#.##");

     JOptionPane.showMessageDialog(null, "Your distance is: " + miles + " miles.");
}
}
