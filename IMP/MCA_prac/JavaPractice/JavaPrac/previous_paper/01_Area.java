class Area {
    private int len, wdth;

    Area(int _len, int _wdth) {
        len = _len;
        wdth = _wdth;
    }

    int area() {
        return len * wdth;
    }

    // public private protected default
    public static void main(String[] args) {
        Area a1 = new Area(4, 5), a2 = new Area(5, 8);

        System.out.println(a1.area());
        System.out.println(a2.area());
    }
}
