package shopping_cart;

import lombok.*;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
    List<Item> items;

    public  void displayCartItems(List<Item> items){
        items.forEach(System.out::println);
    }

    public double getShoppingCartCost(List<Item> items){
        Item item2 = new Item();
        double billPrice=0;
        for (Item item:items) {
            billPrice+=item.getCost()*item.getQuantity();
        }
        System.out.println("Total cost of Items added to the cart: "+billPrice);
        return  billPrice;
    }
}
