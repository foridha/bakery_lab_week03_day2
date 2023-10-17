import java.util.ArrayList;
import java.util.HashSet;

public class Cupcake extends BakedGood {

    private boolean hasSprinkles;

    public Cupcake(String name, String baseFlavour, int sellingPrice, int calories, boolean hasSprinkles) {
        super(name, baseFlavour, sellingPrice, calories); // super is calling BakedGood constructor ^
        this.hasSprinkles = hasSprinkles;
//    Already initiated in BakedGood
    }

    public String addIcing() {

        return "That will be an additional 50 pence";
    }

    public boolean getHasSprinkles() {
        return hasSprinkles;
    }

    public void setHasSprinkles(boolean hasSprinkles){
        this.hasSprinkles = hasSprinkles;
    }

}