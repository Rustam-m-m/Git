import java.util.Random;

/**
 * Created by Администратор on 4/25/14.
 */
public abstract class Car implements Rideable {
    private String color;
    private int id;
    Random rand = new Random();
    public String getColor(){
        return this.color;
    }
    public int getId(){
        return this.id;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setId(int id){
        this.id=id;
    }
    public String toString(Car car){
        String text = "I'car.Mycolor- "+car.getColor()+"My id- "+car.getId();
        return text;
    }
}
