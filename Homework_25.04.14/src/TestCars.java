import java.util.Scanner;

/**
 * Created by Администратор on 4/26/14.
 */
public class TestCars {
    public static void main(String[] args) {
        AutomobileSalon salon = new AutomobileSalon();
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        salon.printCars(salon.findCarsById(id));
    }
}
