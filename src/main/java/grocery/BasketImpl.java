package grocery;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Implement Grocery basket
 * This class will add, remove, and display grocery items
 * HashMap and try,catch,finally,Logger example
 */
public class BasketImpl implements Basket {
    private HashMap<Product, Integer> groceryBasket = new HashMap<>();  //use to store product and cost
    private static final Logger LOGGER = Logger.getLogger(BasketImpl.class.getName());

    @Override
    public void addGroceryItem() {
        try(BufferedReader file = new BufferedReader(new FileReader("/Users/karan/Desktop/Applications/javaproject/src/main/resources/GroceryBasket.txt"))) {
            String line;
            /**
             * Store Groceries and their price in groceryBasket
             */
            while ((line = file.readLine()) != null) {
                String[] groceryItems = line.split(":", 2);
                String item = groceryItems[0];
                int price = Integer.parseInt(groceryItems[1]);
                groceryBasket.put(new Product("Pid1", item), price);

            }
        } catch (IOException exception) {
            LOGGER.error(exception.getMessage());
        }
    }

    /**
     * Remove
     * @param productId
     */
    @Override
    public void removeGroceryItem(String productId) {
        try{
            int flag = 0;
            Set<Product> setProduct = groceryBasket.keySet();
            for(Product product: setProduct ){
                if(product.equals(productId)){
                    groceryBasket.remove(product);
                    flag = 1;
                    break;
                }

            }
            if(flag == 0)
                throw new ProductNotExist(productId + " Not Exist!");
        }catch (ProductNotExist exception){
            LOGGER.error(exception.getMessage());
        }


    }

    /**
     * Display grocery list and their price
     */
    @Override
    public void viewGroceryList() {
        for(Map.Entry entry: groceryBasket.entrySet()){
            System.out.println(entry.getKey().toString()+" -> "+entry.getValue());
        }
    }

    public static void main(String[] args) {
        BasketImpl basketImpl = new BasketImpl();
        basketImpl.addGroceryItem();
        basketImpl.viewGroceryList();
        basketImpl.removeGroceryItem("Tomato");
        basketImpl.viewGroceryList();
    }
}
