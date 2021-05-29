import javax.swing.*;
import java.awt.BorderLayout;

public class View extends JFrame {

    //以下のサイトを参照した。
    //https://www.javadrive.jp/tutorial/imageicon/index2.html

    View(){
        ImageIcon icon = new ImageIcon("./png/sample1.png");
        JLabel label = new JLabel(icon);

        JPanel p = new JPanel();
        p.add(label);

        getContentPane().add(p, BorderLayout.CENTER);

    }

}
