package contactlist;


import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;


/**
 * Create contact list operations
 * Add contacts
 * Delete Contacts
 * View Contacts
 * TreeMap, ArrayList Example
 */
public class ContactListImpl implements ContactList {

    private TreeMap<String, ArrayList<Integer>> contacts = new TreeMap<>();     //Use to Store contacts in sorted order
    private static final Logger LOGGER = Logger.getLogger(ContactList.class.getName());

    //Store contacts in contact list
    @Override
    public void addContact()  {
        LOGGER.info("Inside add Contact of ContactListImpl");
        BufferedReader file = null;
        try {
            //Read Contact List File
             file =  new BufferedReader(new FileReader("/Users/karan/Desktop/Applications/javaproject/src/main/resources/ContactList.txt"));
            String line;
            while((line = file.readLine())!=null){
                String[] contact = line.split(":",2);
                String name  = contact[0];
                String numbers[] = contact[1].split(",");
                ArrayList<Integer> arrNumber = new ArrayList<>();
                for(int i = 0; i<numbers.length; i++)
                    arrNumber.add(Integer.parseInt(numbers[i]));
                contacts.put(name, arrNumber);

            }
        } catch (IOException exception) {
            LOGGER.error(exception.getMessage());
        } finally {
            try {
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    //Delete Contact from contact list
    @Override
    public void deleteContact(String name) {

        contacts.remove(name);
    }


    //View Contacts from Contact List
    @Override
    public void viewContacts() {
        for(Map.Entry entry: contacts.entrySet()){
            String name = entry.getKey().toString();
            System.out.print(name +"-> ");
            for(Integer number: contacts.get(name)){
                System.out.print(number+", ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        ContactListImpl obj = new ContactListImpl();
        obj.addContact();
        obj.viewContacts();
        obj.deleteContact("Harsh");
        obj.viewContacts();
    }
}
