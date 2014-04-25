import java.util.Random;

/**
 * Created by Администратор on 4/25/14.
 */
public class AutomobileFactory {

    public static Car createCar(String carType){


        if (carType.equals("Automobile1"))
            return new Automobile1();
        else return null;
    }
}
