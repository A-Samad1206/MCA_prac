class Tmp {
    void show(int y, int... x) {
        for (int i = 0; i < x.length; i++) {

        }
    }

    public static void main(String[] args) {

        byte b = 10;
        short s = 199;
        int i = 10;
        long l = 10;

        float f = 1.5f;
        double d = 10.2;

        char ch = 'a';

        d = f;
        f = l;

        f = s;

        b = (byte) s;

        i = ch;
        s = 65;

        ch = (char) s;
        ch = (char) f;

        System.out.println(Integer.toBinaryString(b));
    }
}