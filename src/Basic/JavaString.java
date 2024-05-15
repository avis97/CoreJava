package Basic;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaString{
    public static void main(String[] args){
        // String is a non-primitive data type in java its like a class. we create a string object by help of
        // new keyword and literal like String a="avi" this is literal.
        // String is immutable object means we cant chang the string with out creating an new string variable.
        // bu StringBuffer And StringBuilder help to create mutable String.

        String a="Avishek";   // make String object by literal
        String b="AVISHEK";
        String c=new String("Avishek");  // make String object by new keyword

        if(a.equalsIgnoreCase(b)){
            System.out.println("Ok");   //this print ok hare
        }else{
            System.out.println("Not");
        }

        if(a==c){
            System.out.println("Ok");
        }else{
            System.out.println("Not");  // this print Not here because its compare with reference variable.
        }
        a.concat(b);   //concat use for join two string
        String z=String.join("",a,b);
        System.out.println(a+" "+z);

        StringBuffer x=new StringBuffer("Avi");
        x.append("shek");
        System.out.println(x);
        String y="Avi"+23;
        System.out.println(y);
        int num=45;
        String st=String.valueOf(num);
        String newSt=st;
        System.out.println(newSt);
    }
}
