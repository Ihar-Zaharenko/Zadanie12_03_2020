import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[]arqs){
        List<Car> cars = new ArrayList<>();
        Car ferrari=new Car("Ferrari",100,00,1000);
        Car honda=new Car("Honda",110,10,1000);
        Car mazda=new Car("Mazda",80,20,1000);
        ferrari.vremia();
        honda.vremia();
        mazda.vremia();
        cars.add(ferrari);
        cars.add(honda);
        cars.add(mazda);
        for (Car i : cars){
            System.out.println(""+i);
        }

        Collections.sort(cars);
        System.out.println(""+cars);
    }
}
