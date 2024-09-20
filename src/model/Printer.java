package model;

public class Printer extends ComputerProduct implements SpecialDiscount{
    protected Integer minutePrint;

    public Printer() {
    }

    public Printer(Integer minutePrint) {
        this.minutePrint = minutePrint;
    }

    public Printer(String manufacturerName, Integer minutePrint) {
        super(manufacturerName);
        this.minutePrint = minutePrint;
    }

    public Printer(Integer stock, String name, Double price, ProductCategory category, String manufacturerName, Integer minutePrint) {
        super(stock, name, price, category, manufacturerName);
        this.minutePrint = minutePrint;
    }

    public Integer getMinutePrint() {
        return minutePrint;
    }

    public void setMinutePrint(Integer minutePrint) {
        this.minutePrint = minutePrint;
    }

    @Override
    public String toString() {
        return super.toString()+" --Printer{" +
                "minutePrint=" + minutePrint + " copies"+
                '}';
    }


    @Override
    public Double applyDiscount(Double percentageDiscount) {
        return price-(price*percentageDiscount/100);
    }
}
