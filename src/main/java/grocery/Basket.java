package grocery;


/**
 * Expose Grocery operations
 */
public interface Basket {
    public void addGroceryItem();
    public void removeGroceryItem(String productId);
    public void viewGroceryList();
}
