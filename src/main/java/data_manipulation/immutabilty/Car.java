package data_manipulation.immutabilty;

/**
 * Immutable class
 * Once car is created, it's brand and model
 * can not be change. If we want to change
 * the model then we should return new object
 */
public final class Car {
    private final String brand;
    private final String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    /**
     * changing model to newModel for the same brand
     * @param newModel
     * @return
     */
    public Car withModel(String newModel){
        return new Car(this.brand, newModel);
    }

}
