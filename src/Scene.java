import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Scene extends JPanel implements ActionListener {

    Balken[] balkenliste = new Balken[10];
    Button button1;
    Timer t = new Timer(500, this);
    int zahl = 0;

    public Scene(){
        setPreferredSize(new Dimension(250,730));

        setBackground(new Color(0xFFFFFF));

        for(int i = 0; i < 10; i++){
            balkenliste[i] = new Balken();
            add(balkenliste[i]);
        }

        button1 = new Button("Click Me ...");
        add(button1);
        button1.addActionListener(this);


    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource()==button1) {
                for(int i = 0; i < 10; i++){
                    t.start();
                }
        }

        if(e.getSource()==t){
            balkenliste[zahl].setBackground(new Color(0xFF0000));
            zahl = zahl + 1;
        }
    }
}