import model.*;
import service.ItemService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // CREATE OBJECTS
        Chair chair1 = new Chair(200,"Desktop Chair",150D, ProductCategory.FURNITURE,true);
        Table table1 = new Table(50,"Office Desktop",200D, ProductCategory.FURNITURE,1.30,1.20);
        Printer printer1 = new Printer(300, "3D Printer", 500D,ProductCategory.COMPUTERPRODUCT,"HP", 20);
        Notebook notebook1 = new Notebook(100,"Legion i5",1000D,ProductCategory.COMPUTERPRODUCT,"Lenovo",512);

        // CREATE ARRAY LIST
        List<Item> inventary = new ArrayList<>();

        // CREATE OBJECT OF THE SERVICE
        ItemService service= new ItemService();



        //ADD ITEMS TO ARRAY LIST
        service.addItem(inventary, chair1);
        service.addItem(inventary, table1);
        service.addItem(inventary, printer1);
        service.addItem(inventary, notebook1);

        service.showInventary(inventary);

        //POINT 4 APPLY SPECIAL DISCOUNTS TO CHAIRS AND PRINTERS
        Double newPriceChairs=chair1.applyDiscount(10D);
        Double newPricePrinters=printer1.applyDiscount(20D);

        System.out.println("The new price of the chair with discount is "+newPriceChairs+" dollars");
        System.out.println("The new price of the Printer with discount is "+ newPricePrinters+" dollars");

        //POINT 5 UPLOAD THE PRICES OF THE ARRAY
        System.out.println("\n\nOld Prices");
        for (Item i:inventary)
        {
            System.out.println(i.getName()+" "+i.getPrice());
        }
        System.out.println("\n\n New Prices");
        for (Item i:inventary)
        {
            Double percentage=0D;
            if (i instanceof Chair) { percentage = 5D;}
            if (i instanceof Table) { percentage = 10D;}
            if (i instanceof Printer) { percentage = 15D;}
            if (i instanceof Notebook) {  percentage = 20D;}

            System.out.println(i.getName()+" "+(i.getPrice()+i.getPrice()*percentage/100));
        }
    }
}