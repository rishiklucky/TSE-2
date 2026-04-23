import java.util.*;

public class FrequencyOfCharacter {
public static void main(String[] args){

String str = "Hello";

for(int i =0; i<str.length();i++){
int count =1;
for(int j=i+1;j<str.length();j++){
if(str.charAt(i) == str.charAt(j)){
count++;
i++;
}
}
System.out.println("Character : "+str.charAt(i)+" Count : "+count); 
}
}
}