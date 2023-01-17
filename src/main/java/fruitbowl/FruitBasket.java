package fruitbowl;

import java.util.List;
import java.util.stream.Collectors;

public class FruitBasket extends FruitSorter{
    private String layer;
    FruitBasket(){}

    public FruitBasket(String layer) {
        this.layer = layer;
    }

    public String getLayer(){
        return layer;
    }



    public List getDistinctColors(List<Fruit> list){
        List<String> collect = list.stream().map(Fruit::getColor).distinct().collect(Collectors.toList());
        return  collect;
    }

    public List<String> getDistinctSize(List<Fruit> list){
        List<String> collect = list.stream().map(Fruit::getSize).distinct().collect(Collectors.toList());
        return  collect;
    }

}
