import java.awt.*;

class Tmp {
    Tmp() {
        Frame f = new Frame("Hello");
        f.setSize(200, 100);
        Label l = new Label("HelloX");
        l.setBounds(10, 20, 100, 30);
        f.add(l);

        f.setLayout(null);
        f.setVisible(true);
    }
}

class JWT_tmp {
    public static void main(String[] args) {
        new Tmp();
    }
}