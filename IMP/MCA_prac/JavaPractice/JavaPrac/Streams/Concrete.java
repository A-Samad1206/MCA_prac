abstract class User {
    protected abstract String login(String email, String password);

    abstract void meth2();
}

class Conc extends User {
    protected String login(String email, String password) {
        return "Hello";
    }

    void meth2() {

    }
}

class Concrete {
    public static void main(String[] args) {
        Conc c = new Conc();
        c.login("asqasmi@gmail.com", "null");
    }
}