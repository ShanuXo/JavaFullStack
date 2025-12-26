
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionArrayList {
    public static void main(String[] args)
    {
        //Collection<Integer> nums=new ArrayList<Integer>();
        List<Integer> nums=new ArrayList<Integer>();
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(8);

        for(Integer num : nums)
        {
            System.out.println(num);
        }
    }
}
