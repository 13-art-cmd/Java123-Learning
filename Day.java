import java.awt.*;
import java.awt.event.*;

class NinjaCalc extends Frame implements ActionListener {
    TextField t = new TextField();
    Button b = new Button("+");

    NinjaCalc() {
        setLayout(new FlowLayout());
        add(t);
        add(b);
        b.addActionListener(this);
        setSize(200,200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        t.setText("Ninja clicked +");
    }

    public static void main(String[] args) {
        new NinjaCalc();
    }
}
