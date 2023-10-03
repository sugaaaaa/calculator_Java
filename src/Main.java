import javax.swing.*;
public class Main {
    public static void main(String[]args){
        ITECalculator iteCalculator = new ITECalculator();

        iteCalculator.setTitle("ITE Calculator");
        iteCalculator.setSize(500,500);
        iteCalculator.setVisible(true);
        iteCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}