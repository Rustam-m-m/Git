/**
 * Created by Администратор on 4/25/14.
 */
public class Racecar2 extends Racecar {

    public String toString(){

        String text=super.toString()+" number 2";
        return text;
    }
    public void ride(boolean ride){
        System.out.println("racecar");
        super.ride(ride);

    }

}
