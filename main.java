import javax.swing.*;
import java.awt.BorderLayout;

public class Main{
   public static void main(String[] args){
    View frame = new View("./png/sample1.png");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(20, 20, 1080, 1920);
    frame.setTitle("自動販売機");
    frame.setVisible(true);

    }
}
