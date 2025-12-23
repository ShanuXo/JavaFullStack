package Models;
import ENUM.FloorNumber;
import ENUM.Direction;

public class Display {
    private FloorNumber floorNo;
    private Direction dir;
    private int weight;

    public Display(){

    }
    public Display(FloorNumber floorNo,Direction dir,int weight)
    {
        this.floorNo=floorNo;
        this.dir=dir;
        this.weight=weight;
    }

    public FloorNumber getFloorNumber()
    {
        return floorNo;
    }
    public void setFloorNumber(FloorNumber floorNo)
    {
        this.floorNo=floorNo;
    }

    public Direction getDirection()
    {
        return dir;
    }
    public void setDirection(Direction dir)
    {
        this.dir=dir;
    }

    public int getWeight()
    {
        return weight;
    }
    public void setWeight(int weight)
    {
        this.weight=weight;
    }
}
