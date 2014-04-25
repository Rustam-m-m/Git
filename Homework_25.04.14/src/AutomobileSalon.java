import java.util.ArrayList;
import java.util.List;

/**
 * Created by Администратор on 4/25/14.
 */
public class AutomobileSalon {
    ArrayList<Car> racecar1 = new ArrayList<Car>();
    ArrayList<Car> racecar2 = new ArrayList<Car>();
    ArrayList<Car> automobile = new ArrayList<Car>();
    ArrayList<Car> truck = new ArrayList<Car>();
    ArrayList<Car> allcars = new ArrayList<Car>();

    public AutomobileSalon(){
        for(int i=0;i<5;i++){
          racecar1.add(RacecarFactory.createCar("Racecar1"));
          racecar2.add(RacecarFactory.createCar("Racecar2"));
          automobile.add(AutomobileFactory.createCar("Automobile1"));
          truck.add(TruckFactory.createCar("Truck1"));
        }

    }
    public ArrayList<Car> findCarsById(int id){
    ArrayList<Car> car = new ArrayList<Car>();
    allcars.addAll(racecar1);
    allcars.addAll(racecar2);
    allcars.addAll(automobile);
    allcars.addAll(truck);
        for (int i=0;i<allcars.size();i++){
            if(allcars.get(i).getId()==id){
                car.add(allcars.get(i));
            }
        }

        return car;
    }

    public void printCars(ArrayList<Car> car){
        for(int i=0;i<car.size();i++){
        System.out.println(car.get(i));
}
    }
}
