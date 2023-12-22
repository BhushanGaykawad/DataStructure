import java.util.*;

public class StackDecTOBinary 
{
	int stack[];
	int tos;
	int MaxSize;
	
	void createStack(int size)
	{
		stack=new int[size];
		MaxSize=size;
		tos=-1;
		
		
	}
	void push(int e)
	{
		tos=tos+1;
		stack[tos]=e;
		
	}
	int pop()
	{
		int temp=stack[tos];
		tos--;
		return (temp);	
	}
	
	boolean is_full()
	{
		if(tos==MaxSize-1)
		{
			return true;
		}
		else
			return false; 
	}
	
	boolean is_empty()
	{
		if(tos==-1)
		{
			return true;
		}
		else
			return false;
	}
	void Print_stack()
	{
		for(int i=tos;i>-1;i--)
		{
			System.out.println(stack[i]);
		}
	}
	
	
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		StackDecTOBinary obj=new StackDecTOBinary();
		System.out.println("Enter Decimal Number:");
		int num=sc.nextInt();
		obj.createStack(8);
		
		while(num>0)
		{
			int rem=num%2;
			num=num/2;
			obj.push(rem);
		}
		
		while(!obj.is_empty())
		{
			
			int res=obj.pop();
			System.out.println(res);
		}
		
		
		
		
		

	}

}
