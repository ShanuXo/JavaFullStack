@FunctionalInterface
interface Temp{
    public int add(int a,int b);
}


public class LambdaExpressionWIthReturn {
    public static void main(String[] args)
    {
        Temp obj=(a,b)-> a+b;
        int ans=obj.add(5, 4);
        System.out.println(ans);
    }
}
