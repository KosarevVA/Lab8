public class Table extends Furniture{
    private int price;
    private String matherial;

    public Table(int price, String matherial) {
        this.price = price;
        this.matherial = matherial;
    }
    public void buy(){
        System.out.println(price + ", " + matherial);
    }
}
