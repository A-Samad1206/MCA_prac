import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class App implements ActionListener {
    App() {
        Window f = new Window(null);
        Button b = new Button("Hello");
        f.add(b);
        b.addActionListener(this);
        f.setVisible(true);
        f.setSize(300, 300);
        System.out.println("From Construct: ");
        System.out.println(b);
    }

    public void actionPerformed(ActionEvent e) {
        e.getSource();
        System.out.println(e.getSource());
    }
}

class AWT_prac {
    public static void main(String[] args) {
        new App();
    }
}
