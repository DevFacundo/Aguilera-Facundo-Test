package service;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class ItemService {
    Item chair1 = new Chair(200,"Desktop Chair",150D,ProductCategory.FURNITURE,true);
    Item table1 = new Table(50,"Office Desktop",200D, ProductCategory.FURNITURE,1.30,1.20);
    Item printer1 = new Printer(300, "3D Printer", 500D,ProductCategory.COMPUTERPRODUCT,"HP", 20);
    Item notebook1 = new Notebook(100,"Legion i5",1000D,ProductCategory.COMPUTERPRODUCT,"Lenovo",512);

    List<Item> inventary = new ArrayList<>();

    public void addItem(List<Item> list, Item item)
    {
        list.add(item);
    }

    public void showInventary(List<Item> list)
    {
        for (Item i : list)
        {
            System.out.println(i.getClass()+"..."+i);
        }
    }

}
