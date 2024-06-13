package StackInJava;

public class StackByArray{
    int n;
    int arr[];
    int top;
    StackByArray(int n){
        this.n=n;
        this.arr=new int[5];
        this.top=-1;
    }
    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
    boolean isFull(){
        if(n-1==top){
            return true;
        }
        return false;
    }
    public void push(int val){
        if(!isFull()){
            top++;
            arr[top]=val;
        }else{
            System.out.println("Stack is full of memory!!");
        }
    }

    public int pop(){
        if(!isEmpty()){
            int popElement=top;
            top--;
            return arr[popElement];
        }else{
            System.out.println("Stack is Empty");
            return -1;
        }
    }
    public int peek(){
        if(!isEmpty()){
            return arr[top];
        }else{
            System.out.println("Stack is empty!!");
            return -1;
        }
    }
    public static void main(String[] args) {
        StackByArray array=new StackByArray(5);
        array.push(1);
        array.push(2);
        array.push(3);
        array.push(4);
        array.push(5);
      //  array.push(6);
        array.pop();
    }
}
