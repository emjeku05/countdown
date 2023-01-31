import javax.swing.*;

public class Stage extends JFrame {
    public Stage(){
        Scene scene1 = new Scene();
        setSize(275,110);
        setTitle("Progress Bar");
        setDefaultCloseOperation(3);
        setResizable(false);
        add(scene1);
        setVisible(true);
    }
}