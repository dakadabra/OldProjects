package Programs;
import javax.swing.JOptionPane;
//import java.text.DecimalFormat;
public class DayGreetings {
public static void main(String args[ ]) 	{
    int time;
    time= (int)Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the (army) time:"));




     if ((time < 1) || (time > 24)){
    	 JOptionPane.showMessageDialog(null, "Please enter a time from 1 to 24.");
     }


     if ((time >= 1) && (time <= 2)){
    	 JOptionPane.showMessageDialog(null, "It's the middle of he night!");
     }


     if ((time >= 3) && (time <= 5)){
    	 JOptionPane.showMessageDialog(null, "Good early morning! (Also you might want to get more rest!)");
     }


     if ((time >= 6) && (time <= 11)){
    	 JOptionPane.showMessageDialog(null, "Good morning!");
     }


     if (time == 12){
    	 JOptionPane.showMessageDialog(null, "Good noon!");
     }


     if ((time >= 13) && (time <= 18)){
    	 JOptionPane.showMessageDialog(null, "Good afternoon!");
     }


     if ((time >= 19) && (time <= 21)){
    	 JOptionPane.showMessageDialog(null, "Good evening!");
     }


     if ((time >= 22) && (time <= 23)){
    	 JOptionPane.showMessageDialog(null, "Good night!");
     }


     if (time == 24){
    	 JOptionPane.showMessageDialog(null, "It is midnight!");
     }
}
}
