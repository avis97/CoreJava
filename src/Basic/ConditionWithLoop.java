package Basic;
public class ConditionWithLoop{
    public static void main(String[] args){
        // in java have total 3 statement like 1> decision_Making 2> Loop statement 3> jump statement.

        // lets start decision_making statement if or else
        int a=5;
        int b=10;
        if(a<b){
            System.out.println("Bigger is "+b);  // will return this
        }else{
            System.out.println("Bigger is "+b);
        }
        //nested statement
        int num=5;

        if(num==5){
            System.out.println("same with input number");  // will get this
        }else if(num>5){
            System.out.println("its bigger then 5");
        }else{
            System.out.println("its smaller then 5");
        }

        // loop statement for,while,do-while,forEach have total 4 loop in java..

        //for loop
        for(int i=1;i<=5;i++){
            System.out.println("i is-> "+i);// 1,2,3,4,5
        }
        //while loop
        int count=1;
        while(count<=5){
            System.out.print(count+" ");  // 1,2,3,4,5
            count++;
        }
        System.out.println();
        //do-while loop
        count=1;

        do{
            System.out.print(count+" ");// it run first time after check the condition
            count++;
        }while(count<=5);
        System.out.println();

        //for-each loop-->>
        int arr[]={1,2,3,4,5};
        for(int key:arr){
            System.out.print(key+" ");  //this is for-each loop for find element in any kind list in java..
        }
        System.out.println();
        //jump statement in java have 2 statement break or continue.

        //break --> break statement use for break the loop with condition
        int check=3;
        for(int i=1;i<=5;i++){
            if(check==i){
                System.out.println("i reach the check value");
                break;// loop will stop when i get same with check
            }
            System.out.print(i+" ");
        }
        System.out.println();
        //continue -->> continue key is for continue the loop-->

        check=3;
        for(int i=1;i<=5;i++){
            if(check==i){
                //when the ith value will be 3 ,continue key give the control in the start position..
                continue;
            }
            System.out.print(i+" ");
        }
        // this is basic example off condition with loop..
    }
}
