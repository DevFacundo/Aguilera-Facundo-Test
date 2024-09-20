package model;

public abstract class Item {
    protected Integer id;
    private static Integer nextId=1;
    protected ProductCategory category;
    protected Integer Stock;
    protected String name;
    protected Double price;

    public Item() {
    }

    public Item(Integer stock, String name, Double price, ProductCategory category) {
        this.id=nextId++;
        Stock = stock;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public Integer getStock() {
        return Stock;
    }

    public void setStock(Integer stock) {
        Stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", category=" + category +
                ", Stock=" + Stock +
                ", name='" + name + '\'' +
                ", price=" + price;
    }
}
