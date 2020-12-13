package shoppingcart;

/**
 * Expose Shopping Cart operations
 */

public interface ShoppingCart {

    //add item in shopping cart
    public void addItem();

    //Remove item from shopping cart
    public void deleteItem(String itemNumber);

    //View items from shopping cart
    public void viewItem();

}
