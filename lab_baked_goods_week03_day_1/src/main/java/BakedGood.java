public class BakedGood {

    private String name;
    private String baseFlavour;

    private int sellingPrice;

    private int calories;

// constructor
    public BakedGood(String name, String baseFlavour, int sellingPrice, int calories){
        this.name = name;
        this.baseFlavour = baseFlavour;
        this.sellingPrice = sellingPrice;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBaseFlavour() {
        return baseFlavour;
    }

    public void setBaseFlavour(String baseFlavour) {
        this.baseFlavour = baseFlavour;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
