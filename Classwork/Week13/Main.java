package Week13;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        // System.out.println(cars);
        // for (int i = 0; i < cars.size(); i++) {
        // System.out.println(cars.get(i));
        // }
        Iterator<String> it;
        it = cars.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
