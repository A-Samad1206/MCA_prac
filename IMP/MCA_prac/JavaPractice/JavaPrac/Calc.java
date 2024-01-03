import java.awt.*;
import java.awt.event.*;

class App {
    Frame f;
    GridLayout g;
    TextField t1, t2, t3;

    App() {
        f = new Frame("Calculator");
        f.setLayout(new FlowLayout());
        t1 = new TextField(20);
        f.add(t1);
        t2 = new TextField(20);
        f.add(t2);
        t3 = new TextField(20);
        f.add(t3);

        f.setSize(200, 180);
        f.setVisible(true);
        f.setBackground(Color.LIGHT_GRAY);

    }
}

class Calc {
    public static void main(String[] args) {
        App a = new App();
    }
}