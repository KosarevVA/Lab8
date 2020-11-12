public class Chair  extends Furniture{
    private int price;
    private String material;

    public Chair(int price, String material) {
        this.price = price;
        this.material = material;
    }

    @Override
    public void buy(){
        System.out.println(price + ", " + material);
    }

}
