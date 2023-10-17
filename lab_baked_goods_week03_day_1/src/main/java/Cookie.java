public class Cookie extends BakedGood {

    private boolean healthy;

    public Cookie(String name, String baseFlavour, int sellingPrice, int calories, boolean healthy) {
        super(name, baseFlavour, sellingPrice, calories);
        this.healthy = healthy;

    }

    public String reduceSugar(){
        if (healthy) return "This cupcake is healthy";
        else {
             return "Cupcake is not healthy";
        }
    }

//    Getter and setter

    public void setHealthy(boolean healthy) {

        this.healthy = healthy;
    }

    public boolean getHealthyStatus() {
        return this.healthy;
    }
}
