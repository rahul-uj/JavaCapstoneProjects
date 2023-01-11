package shopping_cart;

import java.util.List;

public class Offers {

    Offers offer;

    public int getMilkQuantity(Cart cart){
        List<Item> items = cart.getItems();
        int qty =0 ;
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase("milk")){
                qty = item.getQuantity();
            }
        }
        return  qty;
    }

    public void checkMilkOffer(Cart cart) {

        offer = new Offers();
        int milkQuantity = offer.getMilkQuantity(cart);
        System.out.println("Milk Quantity Added to cart is : "+milkQuantity);
        int res = milkQuantity/2;
        if (res >=1){
            System.out.println("Recieve "+res+" extra quantity at the counter");
        }

    }


}
