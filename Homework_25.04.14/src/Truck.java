/**
 * Created by Администратор on 4/25/14.
 */
public abstract class Truck extends Car implements Rideable{
    //public int speed;
    public Truck(String color,int id){
        //this.speed=speed;
        super.setColor(color);
        super.setId(id);
    }
    public Truck(){
        //this.speed=speed;
        super.setColor("black");
        super.setId(super.rand.nextInt(5));
    }
    public void ride(boolean ride){
        if(ride==true)
            System.out.println("Car moves");
        else
            System.out.println("Car stands");
    }
    public String toString(){

        String text=super.toString()+"type of car is truck";
        return text;
    }
}
