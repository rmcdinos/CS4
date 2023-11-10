package exercise.pkg5;
import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    this.name = name;
    this.earnings = 0;
    this.itemList = new ArrayList<Item>();
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    if (index<itemList.size()){
        itemList.get(index);
        System.out.println("You purchased " + itemList.get(index).getName() + ".");
    }
    else {
        System.out.println("There are only " + itemList.size() + " items left in the store.");
    }
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
    boolean inList = false;
    for (Item womp : itemList){
        if(womp.getName().equals(name)){
            
            earnings += womp.getCost();
            System.out.println("You purchased " + womp.getName() + ".");
            inList = true;
        }
        if (inList == false){
            System.out.println("This store does not sell " + name + ".");
        }
    }
  }
  public void sellItem(Item i){
    boolean inList = false;
    for (Item wump : itemList){
        if(wump == i){
            
            earnings += i.getCost();
            System.out.println("You bought" + i.getName() + ".");
            inList = true;
        }
        if (inList == false){
            System.out.println("This store does not sell " + i.getName() + ".");
        }
    }
  }
  public void addItem(Item i){
    this.itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    for (Item i:itemList){
        if (i.getType()== type){
            System.out.println (getName());
        }
    }
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    for (Item i:itemList){
        if (i.getCost()<= maxCost){
            System.out.println (getName());
        }
    }
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    for (Item i:itemList){
        if (i.getCost() >= minCost){
            System.out.println (getName());
        }
    }
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java
    for (Store i:storeList){
        System.out.println(i.name + " earned " + i.earnings + "!!!!");
    }
  }
}
