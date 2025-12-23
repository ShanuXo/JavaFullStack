package Models;

import ENUM.DorrAction;

public class Door {
    private DorrAction doorAction;

    public Door()
    {

    }
    public Door(DorrAction doorAction)
    {
        this.doorAction=doorAction;
    }

    public void openDoor()
    {
        doorAction=DorrAction.OPEN;
    }
    public void closeDoor()
    {
        doorAction=DorrAction.CLOSE;
    }
}
