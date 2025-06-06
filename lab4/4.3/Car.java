/**
 *
 * @author khoin
 */
public class Car {

    private String owner;
    private float price;

    public Car() {
    }

    public Car(String owner, float price) {
        this.owner = owner;
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return owner + ", " + price;
    }

}
