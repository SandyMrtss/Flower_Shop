package n1exercici1;

public class Flower extends Product{

    private final String colour;
    private final int id;
    private static final Product.Type type = Enum.valueOf(Product.Type.class, "FLOWER");
    public Flower(String name, float price, String colour) {
        super(name, price);
        this.colour = colour;
        this.id = Product.idProd;
    }

    public String getColour() {
        return colour;
    }

    public int getId() {
        return id;
    }
    @Override
    public Product.Type getType(){
        return type;
    }

    @Override
    public String showStock() {
        return "\t{name: " + super.getName() +
                "\n\tcolour: " + getColour() +
                "\n\tprice: " + super.getPrice() + "}\n";
    }

    @Override
    public String toString(){
        return "\t{name: " + super.getName() +
                "\n\tcolour: " + getColour() +
                "\n\tprice: " + super.getPrice() + "}\n";

    }

    @Override
    public boolean equals(Product p) {
        Flower f = (Flower) p;
        return this.name.equalsIgnoreCase(f.getName()) && this.price == f.getPrice() && this.colour.equalsIgnoreCase(f.getColour());
    }

}
