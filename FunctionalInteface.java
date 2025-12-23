// Functional Interface are those which have only method.


@FunctionalInterface
interface functionInterface{
    abstract public void show();
}

// class Helper implements functionInterface{
//     public void show()
//     {
//         System.out.println("Showing");
//     }
// }

public class FunctionalInteface {
    public static void main(String[] args)
    {
        functionInterface obj=new functionInterface(){
            public void show()
            {
                System.out.println("Showing");
            }
        };
        obj.show();
    }
}
