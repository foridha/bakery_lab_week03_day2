import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bakery {
    private ArrayList<BakedGood> stock;

    public Bakery() {

        this.stock = new ArrayList<>();
    }

    public int countBakedGood() {

        return this.stock.size(); // size is a package that counts
    }

    public void removeFromStock(BakedGood bakedGood){

        this.stock.remove(bakedGood);
    }

    public void addToStock(BakedGood bakedGood){

        this.stock.add(bakedGood);
    }
//    test by count function in test
}
