/**
 * Created by Администратор on 4/25/14.
 */
public abstract class Automobile extends Car implements Rideable{
    //public int speed;
    public Automobile(String color,int id){
        //this.speed=speed;
        super.setColor(color);
        super.setId(id);
    }
    public Automobile(){
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

        String text=super.toString()+"type of car is automobile";
        return text;
    }
}
