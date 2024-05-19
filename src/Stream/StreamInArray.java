package Stream;
import java.util.*;
import java.util.stream.Collectors;
public class StreamInArray{
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(2,4,5,6,10,9,5,10);

        //1st one
        list.stream()
                .filter(e->e%2==0)
                .map(e->e*2)
                .sorted(Comparator.reverseOrder())
                .forEach(e-> System.out.print(e+" "));
        System.out.println();


        //2st one
       List<Integer> integerList= list.stream()
                .map(e->e*1)
                .sorted(Comparator.reverseOrder())
                .distinct()
                .collect(Collectors.toList());

       System.out.println(integerList);
    }
}
