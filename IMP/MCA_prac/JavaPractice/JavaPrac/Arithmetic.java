class Animal {
    // ...
}

class Dog extends Animal {
    void bark() {
        System.out.println("Woof!");
    }
}

class Arithmetic {
    public static void main(String[] args) {

        // Downcasting
        Dog dog = (Dog) (new Dog()); // Downcasting from Animal to Dog
        dog.bark(); // Accessing a method specific to Dog
        // char c = Character.MAX_VALUE;
        byte b = Byte.MAX_VALUE;

        short s = (short) (b * 0.75);

        byte b1 = (byte) s;
        // (short)(b + 1);

        System.out.println(s);

        System.out.println(b1);

        // for(int i = 0 ; i < c; i++)
        // System.out.println(i+ "=> " + (char)(i));

    }
}