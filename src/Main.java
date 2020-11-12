import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FurnitureShop shop = new FurnitureShop();
        System.out.println("Что хотите купить? 1 - Стул, 2 - Стол, 3 - Все товары");
        int a = in.nextInt();
        switch (a){
            case(1):
                System.out.println("Цена, " + "Материал: ");
                shop.add_furn( new Chair(999,"Ель"));
                shop.output();
                break;
            case(2):
                System.out.println("Цена, " + "Материал: ");
                shop.add_furn(new Table(1999,"Береза"));
                shop.output();
                break;
            case(3):
                System.out.println("Цена, " + "Материал: ");
                shop.add_furn( new Chair(999,"Ель"));
                shop.add_furn(new Table(1999,"Береза"));
                shop.output();
                break;
        }
    }

}
