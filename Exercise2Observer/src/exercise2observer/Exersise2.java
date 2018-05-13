package exercise2observer;

/**
 *
 * @author alex kourtis
 */
public class Exersise2 {
     public static void main(String[] args) {
        Person arpitPerson = new Person("Kostas");
        Person johnPerson = new Person("Spiros");

        Product samsungMobile = new Product("Samsung", "Mobile", "Not available");

        
        samsungMobile.registerObserver(arpitPerson);
        samsungMobile.registerObserver(johnPerson);

        samsungMobile.setAvailability("Available");
    }
}
