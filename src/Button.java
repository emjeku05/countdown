import javax.swing.*;
import java.awt.*;

public class Button extends JButton {
    public Button(String st1){
        setText(st1);
        setSize(70,25);
        setBackground(new Color(0xF3F3F3));
        setPreferredSize(new Dimension(95,25));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setEnabled(true);
    }
}