interface IUser {
    void signin();
    void signup();
    void logout();
    void placeorder();
    void cancelOrder();
    void send_pref();
}

class ABC {
    void hello() {

    }
}



// India product manager
abstract class User_abs implements IUser {
    protected void connect_to_db() {
        // connect to db
        System.out.println("DB connected");
    }
}


// 
//  
class User extends User_abs {
    public void signin() {}
    public void signup(){
        connect_to_db();
    }
    public void logout(){

    }
    public void placeorder(){

    }
    public void cancelOrder(){

    }
    public void send_pref(){

    }
    private int amount;
    int amount() {
        return amount;
    }

    void amount(int amt) {
        amount=amt;
    }
}

/**
 * InnerTC
 */
 interface InnerTC {
    void xyz();
    
}

class TC extends User implements InnerTC  {
    public void xyz() {

    }
    
    public void hello() {
        connect_to_db();
    }

    public static void main(String[] args) {
        System.out.println(sol() * 2);
    }
    
    public static int sol() {
        int value = -2147483648,div = 2;

        
        int q = 0;
        /*
         * a.) dividend and divisor both +ve
         * b.) divident -ve and divisor +ve
         * c.) dividend +ve and divisor -ve
         * d.) divident -ve and divisor -ve
         */
        
        if(div == value) return 1;
        if(value == Integer.MIN_VALUE && div == -1) return Integer.MAX_VALUE;
        if(value == Integer.MIN_VALUE) { value = value / 2;  q++; }

        boolean flag = value < 0 ^ div < 0;

        if(value < 0 && div < 0){
            value = value * -1;
            div = div * -1;
        }
        else if(value < 0){
            value = value * -1;}
        else if(div < 0)
            div = div * -1;
            
        while(value >= div) {

            q++;
            value = value - div;
        }
        if(flag) q = q * -1;
        
        return q;
    }

}