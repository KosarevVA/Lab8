import java.util.ArrayList;

public class FurnitureShop{

    ArrayList<Furniture> arr = new ArrayList<Furniture>();

    public void add_furn(Furniture m){

        arr.add(m);

    }
    public void output(){

        for(Furniture num: arr){
            num.buy();
        }

    }
}