import java.util.OptionalDouble;

public class TieredCake extends BakedGood{

    private int numberOfTiers;

    public TieredCake(String name, String baseFlavour, int sellingPrice, int calories, int numberOfTiers){
            super(name, baseFlavour, sellingPrice, calories);
            this.numberOfTiers = numberOfTiers;
    }

    public int addTier(int number){
        return this.numberOfTiers += number;
    }

//    Getter and setter
    public int getNumberOfTiers() {
        return numberOfTiers;
    }

    public void setNumberOfTiers(int numberOfTiers) {
        this.numberOfTiers = numberOfTiers;
    }
}
