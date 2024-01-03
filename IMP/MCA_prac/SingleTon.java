
class SingleTonEg {
   
    static private SingleTonEg ref = null;
    public static SingleTonEg getInstancSingleTon() {
        if(ref == null) ref = new SingleTonEg();
        return ref;
    }
}
class SingleTon {
    public static void main(String[] args) {
        SingleTonEg si = SingleTonEg.getInstancSingleTon();
    }
}