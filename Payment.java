public class Payment {
    public static void main(String[] args) {
        Payments upi = new UPI();
        Payments creditCard = new CreditCard();
        upi.pay(1000);
        creditCard.pay(2000);
        
    }
}


abstract class Payments {
    abstract void pay(double amount);    
}

class UPI extends Payments {
    @Override
    void pay(double amount) {
        System.out.println("Paid via UPI" + amount);
    }
}

class CreditCard extends Payments {
    @Override
    void pay(double amount) {
        System.out.println("Paid via CreditCard" + amount);
    }
}