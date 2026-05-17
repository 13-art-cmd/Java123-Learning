import java.awt.*;
import java.awt.event.*;

class KeyEvent extends Frame implements KeyListener{
    label l;

    KeyEvent(){
        l = new label();
        l.setBounds(50,80,300,30);
        add(l);
        addKeyListener(this);
        setSize(400,300);
        setLayout(null);
        setVisible(true);
        setFocusable(true);
    }

    @Override
    public void keyPressed(KeyEvent e){
        l.setText("Key Pressed: " + e.getKeyhar());
    }

}