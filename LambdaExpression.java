// Lambda Expression are used only in the presenec of FunctionalInterface

@FunctionalInterface
interface Temp{
    public void show(int i);
}

public class LambdaExpression {
    public static void main(String[] args)
    {
        Temp obj= (i) -> System.out.println("Show " + i);
        obj.show(4);
    }
}
