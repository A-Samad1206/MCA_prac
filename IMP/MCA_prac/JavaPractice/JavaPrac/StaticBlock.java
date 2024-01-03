class StaticBlock {

    public static void main(String[] args) {
        Hello h = new Hello();
        h.pt = 10;
    }
}

class Hello {
    private int pvt = 10;
    public int pub = 11;
    protected int pt = 12;
    int def = 13;

    Hello() {
        pvt = 100;
    }

}