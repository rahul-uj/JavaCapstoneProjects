package fruitbowl;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;
@Data
@NoArgsConstructor
public class FruitBowl {
    public List<Fruit> addFruits(){
        ArrayList<Fruit> fruitArrayList = new ArrayList<>();
        fruitArrayList.add(new Fruit("Apple","Red","Medium"));
        fruitArrayList.add(new Fruit("Banana","Yellow","Small"));
        fruitArrayList.add(new Fruit("Orange","Orange","Medium"));
        fruitArrayList.add(new Fruit("Cherry","Red","Small"));
        fruitArrayList.add(new Fruit("Papaya","Yellow","Medium"));
        fruitArrayList.add(new Fruit("MuskMellon","Orange","Big"));
        return fruitArrayList;
    }
}


