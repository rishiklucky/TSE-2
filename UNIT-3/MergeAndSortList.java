import java.util.*;

public class MergeAndSortList {
public static void main(String[] args){

List<Integer> a = new ArrayList<>(Arrays.asList(1,2,3));
List<Integer> b = new ArrayList<>(Arrays.asList(6,5,4));

a.addAll(b);
Collections.sort(a);

System.out.println(a);
}
}