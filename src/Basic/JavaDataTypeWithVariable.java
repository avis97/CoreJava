package Basic;
public class JavaDataTypeWithVariable{
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in).
        // 1>primitive     2>non-primitive --->  datatype type take the value with the variable.
        // variable is name of the memory location..
        //data type can be number,character,String ,numeric value..

        //this is int data type take for number
        int a=5;   // we can take it by sc.nextInt() by user
        int b=6;   //here int is datatype b is variable and 6 is value of the memory location
        int c=a+b;
        System.out.println(c);  //print the value.. int number type.

        //this is long datatype for big integer number
        long ab=688758757576556575L;
        System.out.println(ab);

        //have two more like float and double data type for take point value..
        float ft= 3.4F;
        double dt=3.5;
        System.out.println(ft+" "+dt);
        //this is char data type take for character..
        char ch='a';
        char ch1='b'; // we can take char by sc.next.charAt(0) by user..
        System.out.println(ch+" "+ch1);

        //this is take for String.. String is a non-primitive datatype like object..
        String s="Avishek";  // we can also take by sc=next() for single word for sentence sc.nextLine()
        String t="Sarkar";
        System.out.println(s+" "+t);// print the value
        //in String have some pre-define function for make easy operation.
        String name=s.concat(t);
        String sub=s.substring(2,3);
        String lowerCase=s.toLowerCase();
        System.out.println(name+" "+sub+" "+lowerCase);

        // this take for true or false value by boolean data type..
        boolean flag=true;
        System.out.println(flag);

        // Array also non-primitive data tye..
    }
}
