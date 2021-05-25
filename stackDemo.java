import java.util.*;

class Stack 
{
int arr[];
int top;

Stack(int size){
arr=new int[size];
top=-1;
}

public void push(int x){
System.out.println("Inserting " + x);
arr[++top] = x;
}

public int pop(){
return arr[top--];
}

public void display() {
for (int i = 0; i <= top; i++) {
System.out.print(arr[i] + ", ");
}
}


public static void main(String[] args) {
Stack stack = new Stack(10);

stack.push(1);
stack.push(2);
stack.push(3);
stack.push(4);
stack.push(5);
stack.push(6);
stack.push(7);
stack.push(8);
stack.push(9);
stack.push(10);

stack.display();
stack.pop();
System.out.println("\n After popping out");
stack.display();

}
}