import java.util.*;

public class RemoveDup{
public static void main(String[] args){

List<Integer> list = Arrays.asList(1,2,3,3,4,2);
Set<Integer> set = new HashSet<>(list);
System.out.println(set);
}
}