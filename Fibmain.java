package wileyproject;
import java.util.ArrayList;
public class Fibmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> f = new ArrayList<Integer>();
		fibo F = new fibo(f);
		display D=new display(f);
		Thread T1=new Thread(F,"t1");
		T1.run();
		Thread T2=new Thread(D,"t2");
		T2.run();
		

	}
	
}
class fibo implements Runnable
{
	private ArrayList<Integer> f;
	public fibo(ArrayList<Integer> f)
	{
		this.f=f;
		f.add(1);
		f.add(1);
	}
	public synchronized void run()
	{
		
		int sum=2;
		for(int i=0;i<5;i++)
		{
			int val=f.get(i)+f.get(i+1);
//			System.out.println(f.get(i)+" + "+f.get(i+1)+" = "+val);
			sum+=val;
			f.add(val);
		}
		System.out.println("The Sum of the fibonacci series = "+sum);
		notify();
	}
}
class display implements Runnable
{
	private ArrayList<Integer> f;
	int val=0;
	public display(ArrayList<Integer> f)
	{
		this.f=f;
	}
	@Override
	public synchronized void  run() {
		// TODO Auto-generated method stub
		while(f.size()!=0)
		{			
			System.out.println(val+" + "+f.get(0)+" = "+(f.get(0)+val));
			val+=f.get(0);
			f.remove(0);
		}
		
	}
	
}


