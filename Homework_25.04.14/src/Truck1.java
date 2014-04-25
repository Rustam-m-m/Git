/**
 * Created by Администратор on 4/25/14.
 */
public class Truck1 extends Truck {
    public void ride(boolean ride){
        System.out.println("truck");
        super.ride(ride);

    }
    public String toString(){

        String text=super.toString()+" number 1";
        return text;
    }
}
