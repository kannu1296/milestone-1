package smssender;

/**
 * Abstract Class Example
 */
abstract public class SmsSender {
    abstract public void establishConnectionWithTower();

    public void sendSMS(){
      /**
       * eastablishConnectionWithTower();
       * checkForDND();
       * checkForTelecomRules();
       * sending SMS to numbers...numbers.
       */
    }

    abstract public void destroyConnectionWithTower();

    public void checkForDND(){
        //check for number present in DND.
    }
    public void checkForTelecomRules(){
        //Check for telecom rules
    }
}
