public class CostForShipping {
private double kgCost;
private int kmCost;

    public CostForShipping(double kgCost, int kmCost) {
        this.kgCost = kgCost;
        this.kmCost = kmCost;
    }
public double calcCost(Box box, int km){
        return (box.getWeight()*kgCost +kmCost*km);
}
}
