import javax.swing.*;
import java.awt.BorderLayout;

public class View extends JFrame {

    String path;

    //以下のサイトを参照した。
    //https://www.javadrive.jp/tutorial/imageicon/index2.html

    View(String path){
        ImageIcon icon = new ImageIcon(path);
        JLabel label = new JLabel(icon);

        JPanel p = new JPanel();
        p.add(label);

        getContentPane().add(p, BorderLayout.CENTER);

    }

}
