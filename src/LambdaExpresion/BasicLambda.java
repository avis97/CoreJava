package LambdaExpresion;

@FunctionalInterface
interface Print{
    public void display();
}
//class Print2 implements Print{
//    @Override
//    public void display(){
//        System.out.println("Ok You can learn with lambda expression..");
//    }
//}
public class BasicLambda{
    public static void main(String[] args) {
        // call the display function by create the Print object at first with implement class
//        Print print=new Print2();
//        print.display();

        // but after lambda you can create with out implement class..
        Print print=
                ()->System.out.println
                        ("Ok You can learn with lambda expression..");
        print.display();
    }
}
