/**
 * Created by Администратор on 4/25/14.
 */
public class RacecarFactory {

        public static Car createCar(String carType){
            if (carType.equals("Racecar1"))
                return new Racecar1();
            else if (carType.equals("Racecar2"))
                return new Racecar2();
            else return null;
        }
 }


