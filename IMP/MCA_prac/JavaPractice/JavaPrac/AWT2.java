import java.awt.*;

class AWTFirst {
    AWTFirst() {
        Frame f = new Frame();
        f.setSize(200,200);

        Button b = new Button("Submit");
        b.setBounds(100,100,80,50);
        f.add(b);

        f.setLayout(null);
        f.setVisible(false);
    
    }
}

class AWT2 {
    public static void main(String[] args) {
        AWTFirst a = new AWTFirst(); 
    }
}