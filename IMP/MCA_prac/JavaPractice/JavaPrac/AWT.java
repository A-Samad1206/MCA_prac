import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

class MyFrame extends Frame {
    int count = 0;

    Label l, l1;
    Button b1, b2;
    TextField tf;

    void updateCounter() {
        l.setText("Count: " + count);
    }

    MyFrame(String name) {
        super(name);

        l = new Label("Count:  " + count);
        l1 = new Label("Value:  " + count);
        b1 = new Button("Increment");
        // b1.addActionListener(this);
        b2 = new Button("Decrement");
        // b2.addActionListener(this);

        tf = new TextField("Text Field");
        setLayout(new FlowLayout());
        add(b1);
        add(l);
        add(l1);
        add(b2);
        add(tf);

        // tf.addActionListener(new ActionListener() {
        // public void actionPerformed(ActionEvent ae) {
        // System.out.println("From Action Performed: "+tf.getText());
        // }
        // });

        tf.addTextListener(new TextListener() {
            public void textValueChanged(TextEvent te) {
                // System.out.println("From text listener: " + tf.getText());
                l1.setText("Value: " + tf.getText());
                tf.setEchoChar('*');
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count--;
                updateCounter();
            }
        });

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;
                updateCounter();
            }
        });

        setSize(200, 200);
        setVisible(true);
    }

}

class AWT {
    public static void main(String[] args) {
        new MyFrame("My Frame");
    }
}