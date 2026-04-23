import java.io.*;

public class FileNotFound {
public static void main(String[] args){
try{

BufferedReader br = new BufferedReader(new FileReader("hi.txt"));
}
catch(FileNotFoundException e){
System.out.println("Can't Find the file you are trying to read");
}
}
}