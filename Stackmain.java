package wiley;

public class Stackmain {
public static void main(String[] args) {
	Stack st=new Stack();
	st.push(1);
	st.push(2);
	st.peek();
	st.display();
	System.out.println("Poped element is "+st.pop());
	st.display();
	
}

}
class Stack{
	int stack[];
	int top;
	Stack()
	{
		top=-1;
		stack = new int[20];
	}
	void push(int a)
	{
		if(top>19)
		{
			System.out.println("Stack is full");
		}
		else
		{
			stack[++top]=a;
		}
		
	}
	int pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is full");
			return -1;
		}
		else
		{
			return stack[top--];
		}
	}
	void peek()
	{
		if(top==-1)
		{
			System.out.println("Stack is full");
			
		}
		else
		{
			System.out.println("The top element is "+stack[top]);
		}
	}
	void display()
	{
		if(top==-1)
		{
			System.out.println("The stack is empty");
		}
		else
		{
			for(int i=0;i<=top;i++)
			{
				System.out.print(stack[i]+" ");
			}
			System.out.println("");
		}
	}
}
