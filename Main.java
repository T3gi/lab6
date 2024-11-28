import lab6.*;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Button button1 = new Button("Button1");
        Button button2 = new Button("Button2");
        Button button3 = new Button("Button3");
        Button button4 = new Button("Button4");
        Panel panel1 = new Panel("Panel1");
        Panel panel2 = new Panel("Panel2");

        panel1.addComponent(button1);
        panel1.addComponent(button2);
        panel1.addComponent(panel2);
        panel2.addComponent(button3);
        panel2.addComponent(button4);
        panel1.name();

        ObjectManager manager = new ObjectManager();
        manager.addComponent(panel1);
        manager.addComponent(panel2);
        manager.addComponent(button1);
        manager.addComponent(button2);
        manager.addComponent(button3);
        manager.addComponent(button4);

        manager.count(counter);
        System.out.println("\n" + counter.getCount());


    }
}