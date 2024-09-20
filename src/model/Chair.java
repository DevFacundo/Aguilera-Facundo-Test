package model;

public class Chair extends Item implements SpecialDiscount{
    protected Boolean wheels;

    public Chair() {
    }


    public Chair(Boolean wheels) {
        this.wheels = wheels;
    }

    public Boolean getWheels() {
        return wheels;
    }

    public void setWheels(Boolean wheels) {
        this.wheels = wheels;
    }

    public Chair(Integer stock, String name, Double price, ProductCategory category, Boolean wheels) {
        super(stock, name, price, category);
        this.wheels = wheels;

    }
    @Override
    public String toString() {
        return super.toString()+"--Chair{" +
                "wheels=" + wheels +
                '}';
    }

    @Override
    public Double applyDiscount(Double percentageDiscount) {
        return price-(price*percentageDiscount/100);
    }
}
