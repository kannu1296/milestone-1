package data_manipulation.immutabilty;

/**
 * Program to demonstrate the use of immutable class
 */
public final class Currency {

    private final String value;

    public Currency(String currencyValue) {
        value = currencyValue;
    }

    public String getValue() {
        return value;
    }
}
