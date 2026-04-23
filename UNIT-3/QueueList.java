import java.util.*;

public class QueueList{
public static void main(String[] args){

List<Integer> q = new ArrayList<>();

q.add(10);
q.add(20);
q.add(30);

if(!q.isEmpty()){
q.remove(0);
}

System.out.println(q);
}
}