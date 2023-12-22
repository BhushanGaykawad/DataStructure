import java.util.Scanner;

public class StackBalanced 
{
	char stack[];
	int tos,MaxSize;
	
	void creatStack(int size)
	{
		stack=new char[size];
		MaxSize=size;
		tos=-1;
	}
	void push(char e)
	{
		tos=tos+1;
		stack[tos]=e;
	}
	char pop()
	{
		char temp=stack[tos];
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
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter sequence to test");
		String line=sc.nextLine();
		System.out.println("Entered"+line);
		
		StackBalanced obj=new StackBalanced();
		obj.creatStack(line.length());
		boolean flag=true;
		for(int i=0;i<line.length();i++)
		{
			char c=line.charAt(i);
			if(c=='{')
			{
				obj.push(c);
				
				
			}
			else if(c=='}')
			{
				if (!obj.is_empty())
				{
					char temp=obj.pop();
					
				}
				else
				{
					System.out.println("Error: } unexpected");
					flag=false;
				}
			}
		}
		if(!obj.is_empty())
		{
			System.out.println("Error:} is expected");
		}
		else if(flag==true)
			System.out.println("Balanced");
		
	}

}
