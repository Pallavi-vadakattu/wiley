package wiley;
class Node {
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        next=null;
    }
}
class LinkedList{
    Node head;
    LinkedList()
    {
    	head=null;
    }
    void insert(int a)
    {
        Node newnode = new Node(a);
        Node temp=head;
        if(temp ==null)
        {
        	head=newnode;
        }
        else
        {
        	while(temp.next != null)
        	{
        		temp=temp.next;
        	}
        	temp.next=newnode;
        }
    }
    void insert(int a,int index)
    {
    	if(head==null)
    	{
    		System.out.println("The list is empty");
    	}
    	else
    	{
    		Node temp=head;
    		if(index==0)
    		{
    			Node n=new Node(a);
    			n.next=head;
    			head=n;
    		}
    		else
    		{
    			boolean check=false;
    			for(int i=1;i<index;i++)
    			{
    				if(temp.next==null)
    				{
    					System.out.println("Invalid index");
    					check=true;
    					break;
    				}
    				else
    				{
    					temp=temp.next;
    				}
    			}
    			if(!check)
				{
					Node n=new Node(a);
					n.next=temp.next;
					temp.next=n;
					
				}
    			
    		}
    	}
    }
    void delete()
    {
    	int val=0;
    	if(head==null)
    	{
    		System.out.println("List is empty");
    		
    	}
    	else
    	{
    		Node temp = head;
    		if(temp.next==null)
    		{
    			val=temp.data;
    			head = null;
    			System.out.println("The deleted value is"+val);
    		}
    		else
    		{
    			while(temp.next.next!=null)
    			{
    				temp=temp.next;
    			}
    			val=temp.next.data;
				temp.next=null;
				System.out.println("The deleted value is "+val);
    		}
    		
    		
    	}
    	
    }
    void delete(int index)
    {
    	int val;
    	Node temp=head;
    	if(head==null)
    	{
    		System.out.println("The list is empty");
    	}
    	else
    	{
    		if(index==0)
    		{
    			val=head.data;
    			head=head.next;
    			System.out.println("The deleted value is "+val);
    			
    		}
    		else
    		{
    			boolean check = false;
    			for(int i=0;i<index;i++)
    			{
    				temp=temp.next;
    				if(temp==null)
    				{
    					System.out.println("Invalid index");
    					check = true;
    					break;
    				}
    			}
    			if(!check)
    			{
    				val=temp.data;
    				temp=temp.next;
    				System.out.println("The deleted value is "+val);
    			}
    			
    		}
    	}
    }
    void display()
    {
    	if(head==null)
    	{
    		System.out.println("List is empty");
    		
    	}
    	else
    	{
    		Node temp= head;
    		while(temp!=null)
    		{
    			System.out.print(temp.data+"  ");
    			temp=temp.next;
    		}
    		System.out.println("");
    	}
    }
}
public class LLmain {
public static void main(String[] args) {
	LinkedList LL=new LinkedList();
	LL.insert(1);
	LL.insert(2);
	LL.display();
	LL.insert(5,0);
	LL.delete(0);
	LL.display();
	LL.insert(2);
	
}
}
