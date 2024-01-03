interface IDisplay {
    void display(String str);
}

class Lambda {
    int value = 10;
    Lambda(String str) {
        System.out.println(str);
    }

    Lambda() {}

    void my_display(String str) {
        System.out.println(str);
    }

    public static void stat_display(String str) {
        System.out.println(str);
    }
    public static void main(String[] args) {
        IDisplay print_ref = System.out::println;
        print_ref.display("Hello  world");
        
        IDisplay const_ref = Lambda::new;
        const_ref.display("From constructor");
    
        Lambda l = new Lambda();
        IDisplay inst_meth_ref = l::my_display;
        inst_meth_ref.display("Hello from isnt");

        IDisplay stat_meth_ref = Lambda::stat_display;
        stat_meth_ref.display("From static method");
    }
}