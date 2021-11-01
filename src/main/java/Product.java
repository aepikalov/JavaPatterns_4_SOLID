public abstract class Product {
    private String name;
    private int price;
    private int count;

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public int getCount() {
        return count;
    }

    public Product setCount(int count) {
        this.count += count;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Product setPrice(int price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return name;
    }
}
