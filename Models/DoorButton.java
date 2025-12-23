package Models;
import java.util.*;
import Interfaces.Button;
import ENUM.DorrAction;

public class DoorButton implements Button{
    public DorrAction doorAction;
    boolean status;

    public DoorButton(){ }
    public DoorButton(DorrAction doorAction boolean status)
    {
        this.doorAction=doorAction;
        this.status=status;
    }
    public DorrAction getDoorAction()
    {
        return doorAction;
    }
    public void setDoorAction(DorrAction doorAction)
    {
        this.doorAction=doorAction;
    }
    public void setSatatus(boolean status)
    {
        this.status=status;
    }

    @Override
    public boolean isPressed()
    {
        return status;
    }
    @Override
    public boolean press()
    {
        status= !status;
        return status;
    }

}
