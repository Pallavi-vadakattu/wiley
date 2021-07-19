package wiley;
public class PriorityQmain {
public static void main(String[] args) {
	PriorityQ PQ = new PriorityQ();
	PQ.enqueu(9, 0);
	PQ.enqueu(7, 5);
	PQ.display();
	PQ.enqueu(3, 4);
	PQ.enqueu(7, 2);
	PQ.display();
	PQ.dequeue();
	PQ.display();
}
}
class PriorityQ{
	int Q[];
//	array to store priorities
	int P[];
	int front;
	int rear;
	PriorityQ()
	{
		P=new int[20];
		Q=new int[20];
		front=-1;
		rear=-1;
	}
	void enqueu(int a,int p)
	{
		if(front==-1)
		{
			Q[++front]=a;
			P[front]=p;
			rear++;
		}
		else
		{
			int i=front;
			while(P[i]>p && i!=rear)
			{
				i++;
			}
			int temp=P[i];
			for(int j=rear+1;j>i;j--)
			{
				P[j]=P[j-1];
				Q[j]=Q[j-1];
			}
			Q[i]=a;
			P[i]=p;
			rear++;
			
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
			int pri=P[front];
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
			System.out.println("The dequed element is "+val+" of priority "+ pri);
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
				System.out.print(("("+Q[i]+"--"+P[i]+")")+" ");
			}
			System.out.println("");
		}
	}
}
