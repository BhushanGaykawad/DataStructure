package Assignement;
import java.util.*;
public class ReverseStack 
{
	
	int stack[];
	int tos;
	int MaxSize;
	
	void createStack(int size)
	{
		stack=new int[size];
		tos=-1;
		MaxSize=size;
	}
	
	void push(int num)
	{
		tos=tos+1;
		stack[tos]=num;
	}
	int pop()
	{
		int temp=stack[tos];
		tos=tos-1;
		return temp;
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
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of stack:");
		int size=sc.nextInt();

		ReverseStack stack=new ReverseStack();
		ReverseStack RevStack=new ReverseStack();
		int ch;
		
		stack.createStack(size);
		RevStack.createStack(size);
		do 
		{
			System.out.println("1.Push \n 2.Pop \n 3.Print \n 0.exit");
			ch=sc.nextInt();
			switch(ch)

			{
			case 1:
				if(!stack.is_full())
				{
					System.out.println("Enter the number:");
					int num=sc.nextInt();
					stack.push(num);
				}
				else
					System.out.println("Stack is full");
				break;
			case 2:
				if(!stack.is_empty())
				{
					int no=stack.pop();
					RevStack.push(no);			
				}
				else
					System.out.println("Stack is empty..!!");
				break;
			case 3:
				if(!stack.is_empty())
				{
					System.out.println("Printing all stack");
					stack.Print_stack();
				}
				else
					System.out.println("Stack empty");
				if(!RevStack.is_empty())
				{
					System.out.println("Printing all Revstack");
					RevStack.Print_stack();
					
				}
				else
					System.out.println("RevStack is empty..!!");
				break;
			
				
			}
			
		}while(ch!=0);
		
		
	

	}

}
