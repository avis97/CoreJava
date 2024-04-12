package Basic;

public class JavaOperator{
    public static void main(String[] args) {
        // operator basically help perform operation easy way like submission,subtract,multiple,divide.

        //unary operator used for increment and decrement the value by one like a=a+1 is also write by unary operator a++,a--
        int a=5;
        a++;  //post-increment by one
        System.out.println(a);
        System.out.println(++a); // pre-increment by one

        int b=10;
        System.out.println(b--);  // post-decrement work on next line not same line
        System.out.println(--b);  // pre-decrement work on the same line...

        // Arithmetic operator is +,-,*,/,%  use for Math type operation for example
        int f1=10;
        int f2=5;
        int c1=f1+f2;
        int c2=f1*f2;
        int c3=f1-f2;
        int c4=f1/f2;
        int c5=f1%f2;
        System.out.println(c1+" "+c2+" "+c3+" "+c4+" "+c5);

        //Relational Operator is ==,!=,<=,>=,<,> use for compare and equal case like

        int check=5;
        int check2=20;

        if(check2==check){
            System.out.println("True");
        }else{
            System.out.println("False");  // get this
        }


        if(check2>=check){
            System.out.println("True");  // get this
        }else{
            System.out.println("False");
        }

        // Logical Operator (&&) and operator and (||)or Operator

        // check && operator-> && operator will return true if all condition are true..like
        String s="Avi";
        String h="Avi";
        if(s.equals("Avi") && h.equals("Avi")){
            System.out.println("True"); //get this
        }else{
            System.out.println("False");
        }

        // check || Operator -> || operator will return true is any one condition is true..like
        System.out.println(!s.equals("Avi"));

        if(s.equals("avi") || h.equals("Avi")){
            System.out.println("false");
        }else{
                System.out.println("true");
        }

        // ternary operator ?,: this also can call a condition base operator...
        int age=19;
        int checkAge=15;
        String ans=(checkAge>age) ? "Ok You Can Go":"Sorry You Cant go";  // we can take some condition by
        System.out.println(ans); // 1st one

        //Assignment Operator-- +=,-=,*=,-=,=,%=  make easy operation...
        int as=5;
        int bs=10;
        as+=bs;  // as=as+bs
        System.out.println(as); // return 15...

        // the same think happened with all assignment operator...

    }
}
