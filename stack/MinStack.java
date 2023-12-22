import java.util.Scanner;

public class MinStack 
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
	int peek()
	{
		return stack[tos];
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
		MinStack stack=new MinStack();
		MinStack min=new MinStack();
		System.out.println("Enter the size of the stack");
		int size=sc.nextInt();
		stack.createStack(size);
		min.createStack(size);
		
		while(!stack.is_full())
		{
			int num=sc.nextInt();
			stack.push(num);
			if(min.is_empty())
				min.push(num);
			else
			{
				if (num<min.peek())
					min.push(num);
			}
		}
		
		stack.Print_stack();
		System.out.println("************************************");
		min.Print_stack();
		
		
		System.out.println("*******************************");
		while(!stack.is_empty())
		{
			if(stack.peek()==min.peek())
			{
				System.out.println("Popped Element from both "+stack.pop()+","+min.pop());
				
			}
			else
				System.out.println("Popped element from stack is"+stack.pop());
		}
		
		
		
		
		
}
}
