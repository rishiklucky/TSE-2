import java.util.*;

public class SecondLargest{
public static void main(String[] args){

int[] arr = {10,23,56,77,889,54};

Arrays.sort(arr);

System.out.println("Second Largest Element From Array is : " + arr[arr.length-2]);
}
}