package model;

public class ComputerProduct extends Item{
    protected String manufacturerName;

    public ComputerProduct() {
    }

    public ComputerProduct(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public ComputerProduct(Integer stock, String name, Double price, ProductCategory category, String manufacturerName) {
        super(stock, name, price, category);
        this.manufacturerName = manufacturerName;
    }

    @Override
    public String toString() {
        return super.toString()+
                " manufacturerName='" + manufacturerName;
    }
}
