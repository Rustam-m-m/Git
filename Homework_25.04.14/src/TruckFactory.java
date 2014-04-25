/**
 * Created by Администратор on 4/25/14.
 */
public class TruckFactory {

        public static Car createCar(String carType){
            if (carType.equals("Truck1"))
                return new Truck1();

            else return null;
        }
    }


