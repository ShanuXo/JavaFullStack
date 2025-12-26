
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    String name;
    int age;

    public Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("name=").append(name);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
    public int compareTo(Student that)
    {
        return this.age > that.age ? 1 : -1;
    }
}

public class ComparatorVsComparable {
    public static void main(String[] args) {
        // Comparator<Student> com=new Comparator<Student>() {
        //     @Override
        //     public int compare(Student i, Student j) {
        //         if(i.age > j.age) return 1;
        //         else return -1;
        //     }
        // };
        // Using Lambda
         Comparator<Student> com= (i,j) -> {
                return i.age > j.age? 1 : -1;
        };

        List<Student> lists=new ArrayList<>();
        lists.add(new Student("Anand", 25));
        lists.add(new Student("Prem", 26));
        lists.add(new Student("Shanu", 24));
        
        // Using comparator
        //Collections.sort(lists,com);
        Collections.sort(lists);
        for(Student st : lists)
        {
            System.out.println(st);
        }
        
    }
}
