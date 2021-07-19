package wiley;
class Queue{
	int Q[];
	int front;
	int rear;
	Queue()
	{
		Q=new int[20];
		front =-1;
		rear=-1;
		
	}
	void enqueue(int a)
	{
		if(rear==19)
		{
			System.out.println("Queue is full");
		}
		else {
			Q[++rear]=a;
			if(front==-1)
			{
				front++;
			}
			
		}
		
	}
	void dequeue()
	{
		if(front==-1)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			int val=Q[front];
			if(rear==0)
			{
				front=-1;
			}
			else
			{
				for(int i=front;i<rear;i++)
				{
					Q[i]=Q[i+1];
				}
				
			}
			rear--;
			System.out.println("The dequed element is "+val);
		}
	}
	void display()
	{
		if(front==-1)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			for(int i=front;i<=rear;i++)
			{
				System.out.print(Q[i]+" ");
			}
			System.out.println("");
		}
	}
void front()
{
	if(front == -1)
	{
		System.out.println("Q is empty");
	}
	else
	{
		System.out.println("front ="+Q[front]);
	}
}
void rear()
{
	if(rear == -1)
	{
		System.out.println("Q is empty");
	}
	else
	{
		System.out.println("Rear= "+Q[rear]);
	}
}
}

public class Qmain {
public static void main(String[] args) {
	Queue Q = new Queue();
	Q.enqueue(1);
	Q.enqueue(2);
	Q.enqueue(3);
	Q.display();
	Q.dequeue();
	Q.front();
	Q.rear();
}
}
