package n1exercici1;

public class Flower extends Product{

    private final String colour;
    private final int id;
    public Flower(String name, float price, String colour) {
        super(name, price);
        this.colour = colour;
        this.id = Product.idProd;
    }

    public String getColour() {
        return colour;
    }
}
