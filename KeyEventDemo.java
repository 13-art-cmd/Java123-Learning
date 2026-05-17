import java.awt.*;
import java.awt.event.*;

public class KeyEventDemo extends Frame implements KeyListener{
    Label l;

    KeyEventDemo(){
        Label l = new Label();

        l.setBounds(50,50,100,10);
        add(l);
        addKeyListener(this);
        setSize(400,300);
        setLayout(null);
        setVisible(true);
        setFocusable(true);
    }

    @Override
    public void keyPressed(KeyEvent2 e){
        l.setText("Key Pressed :" + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent2 e){
        l.setText("Key Released: " + e.getKeyChar());
    }

    @Override
    public void keyTyped(KeyEvent2 e){
        l.setText("Key Types: " + e.getKeyChar());

    }

    public static void main(String[] args) {
         new KeyEventDemo();
    }
}