package shoppingcart;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Implement Shopping Cart
 * This class will add, remove, and show items
 * LinkedHashMap and try,catch,finally example
 */

public class ShoppingCartImpl implements ShoppingCart {

    private LinkedHashMap<String, String> cart = new LinkedHashMap<>();     //Use to store item number and item name
    private static final Logger LOGGER = Logger.getLogger(ShoppingCartImpl.class.getName());

    @Override
    public void addItem() {
        BufferedReader file = null;
        try{
            //Read Shopping Cart File
            file =  new BufferedReader(new FileReader("/Users/karan/Desktop/Applications/javaproject/src/main/resources/ShoppingCart.txt"));
            String line;

            /**
             * Store items in cart
             */
            while((line=file.readLine())!=null){
                String[] cartItems = line.split(":", 2);
                String itemNumber = cartItems[0];
                String itemName = cartItems[1];
                cart.put(itemNumber, itemName);
            }
        } catch (IOException exception) {
            LOGGER.error(exception.getMessage());
        }finally {
            try {
                if(file!=null)
                    file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void deleteItem(String itemNumber) {
        cart.remove(itemNumber);
    }

    @Override
    public void viewItem() {
        for(Map.Entry entry: cart.entrySet()){
            System.out.println(entry.getKey()+" -> "+ entry.getValue());
        }
    }

    public static void main(String[] args) {
        ShoppingCartImpl shoppingCartImpl = new ShoppingCartImpl();
        shoppingCartImpl.addItem();
        shoppingCartImpl.viewItem();
        shoppingCartImpl.deleteItem("50");
        shoppingCartImpl.viewItem();
    }
}
