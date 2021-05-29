import javax.swing.*;
import java.awt.Image;
import java.awt.BorderLayout;

public class View extends JFrame {

    String path;

    //以下のサイトを参照した。
    //https://www.javadrive.jp/tutorial/imageicon/index2.html
    //https://www.it-swarm-ja.com/ja/java/jlabel-imageicon%E3%81%AE%E3%82%B5%E3%82%A4%E3%82%BA%E3%82%92%E5%A4%89%E6%9B%B4%E3%81%99%E3%82%8B%E6%96%B9%E6%B3%95%E3%81%AF%EF%BC%9F/972413489/

    View(String path){

        ImageIcon imageIcon = new ImageIcon(path);
        Image image = imageIcon.getImage(); // transform it
        Image icon = image.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIcon = new ImageIcon(icon);  // transform it back

        JLabel label = new JLabel(imageIcon);

        JPanel p = new JPanel();
        p.add(label);

        getContentPane().add(p, BorderLayout.CENTER);

    }

}
