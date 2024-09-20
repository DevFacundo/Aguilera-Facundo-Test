package model;

public class Notebook extends ComputerProduct{
    protected Integer memory;

    public Notebook() {
    }

    public Notebook(Integer memory) {
        this.memory = memory;
    }

    public Notebook(String manufacturerName, Integer memory) {
        super(manufacturerName);
        this.memory = memory;
    }

    public Notebook(Integer stock, String name, Double price, ProductCategory category, String manufacturerName, Integer memory) {
        super(stock, name, price, category, manufacturerName);
        this.memory = memory;
    }

    @Override
    public String toString() {
        return super.toString()+" --Notebook{" +
                "memory=" + memory +" GB"+
                '}';
    }

}
