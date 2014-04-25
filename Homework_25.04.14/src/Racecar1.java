/**
 * Created by Администратор on 4/25/14.
 */
public class Racecar1 extends Racecar {



    public String toString(){

        String text=super.toString()+" number 1";
        return text;
    }

    public void ride(boolean ride){
        System.out.println("racecar");
       super.ride(ride);

    }
}
