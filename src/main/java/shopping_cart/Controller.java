package shopping_cart;
import java.util.ArrayList;
import java.util.List;

public class Controller{
    public static void main(String[] args) {
        Item item1 = new Item("Apple",60,2);
        Item item2 = new Item("NewsPaper",3,1);
        Item item3 = new Item("Milk",21,3);

        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);

        Cart cart1 = new Cart();
        cart1.setItems(itemList);
        cart1.displayCartItems(itemList);
        double shoppingCartCost = cart1.getShoppingCartCost(itemList);

        Offers offers = new Offers();
       offers.checkMilkOffer(cart1);

       WalletPayment walletPayment = new WalletPayment();
       walletPayment.pay(shoppingCartCost);
    }
}
