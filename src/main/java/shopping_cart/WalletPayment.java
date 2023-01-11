package shopping_cart;
public class WalletPayment implements Payment {
    @Override
    public void pay(double amt) {
        double discounted_Price = 0;
        if (amt>=100){
            discounted_Price = amt*0.05;
            System.out.println("Original amount : "+amt);
            System.out.println("Discounted Price: "+discounted_Price);
            amt-=discounted_Price;
            System.out.println("Bill: "+amt);
        }
        else {
            System.out.println("Please pay : Rs" + amt);
        }
    }
}
