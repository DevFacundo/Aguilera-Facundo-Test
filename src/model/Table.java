package model;

public class Table extends Item {
    protected Double high;
    protected Double width;

    public Table() {
    }


    public Table(Double high, Double width) {
        this.high = high;
        this.width = width;
    }

    public Table(Integer stock, String name, Double price, ProductCategory category, Double high, Double width) {
        super(stock, name, price, category);
        this.high = high;
        this.width = width;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return super.toString()+" --Table{" +
                "high=" + high +" mt "+
                ", width=" + width + " mt "+
                '}';
    }

}
