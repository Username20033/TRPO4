public class Sneakers {
    protected String name;
    protected double cost;
    protected String type;
    private Producer producer;
    private class Producer {
        protected String name;
        protected String country;
        protected Producer(String name, String country) {
            this.name = name;
            this.country = country;
        }
        protected String Name() {
            return this.name;
        }
    }
    public Sneakers(String name, double cost, String prodName, String prodCountry) {
        this.cost = cost;
        this.name = name;
        producer = new Producer(prodName, prodCountry);
    }
    public double Cost() {
        return this.cost;
    }
    public String Type() {
        return this.type;
    }
    public String ProducerName() {
        return producer.Name();
    }
}
