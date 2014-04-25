/**
 * Created by Администратор on 4/25/14.
 */
public class Automobile1 extends Automobile {
    public String toString(){

        String text=super.toString()+" number 1";
        return text;
    }
    public void ride(boolean ride){
        System.out.println("automobile");
        super.ride(ride);

    }

}
