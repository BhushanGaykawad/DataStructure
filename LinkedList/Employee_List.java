import java.nio.file.spi.FileSystemProvider;
import java.util.*;

public class Employee_List 
{
	Employee root;
	
	void createList()
	{
		root=null;
	}
	
	void insert_left(Employee e)
	{
		Employee n=e;
		if(root==null)
		{
			root=n;
		}
		else
		{
			n.next=root;
			root= n;
		}
		System.out.println("Object Inserted");
		
	}
	
	void insert_right(Employee e)
	{
		Employee n=e;
		if(root==null)
		{
			root=n;
		}
		else
		{
			Employee t=root;
			while(t.next!=null)
			{
				t=t.next;
			}
			t.next=n;
			System.out.println("Inserted");
			
		}
			
		
		
	}
	
	void delete_left()
	{
		
		if(root==null)
		{
			System.out.println("List empty..!!");
		}
		else
		{
			Employee t;
			t=root;
			root=root.next;
			System.out.println(t+"Deleted");
			
			
			
		}
		
	}
	void delete_right()
	{
		if(root==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Employee t=root;
			Employee t2=root;
			while(t.next!=null)
			{
				t2=t;
				t=t.next;
			}
			if(root==t)
			{
				root=null;
			}
			else
			{
				t2.next=null;
			}
			
		}
	}
	void search(int id)
	{
		if(root==null)
		{
			System.out.println("Empty list");
		}
		else
		{
			Employee t=root;
			while(t!=null)
			{
				int num=t.getId();
				if(id==num)
				{
					System.out.println("Details Found"+t);
				}
				else
				{
					t=t.next;
				}
				break;
				
			}
			if(t==null)
			{
				System.out.println("Details not found");
			}
		}
	}
	void delete(int id)
	{
		if(root==null) //empty
		{
			System.out.println("Empty List");
		}
		else //not empty
		{
			Employee t=root;
			Employee t2=root;
			int eid=t.getId();
			
			while(t!=null && id!=eid )
			{
				t2=t;
				t=t.next;
				
			}
			if(t==null) //not found
			{
				System.out.println("Not found");
			}
			else //found
			{
				if(t==root) //leftmost case
				{
					root=root.next;
				}
				else if(t.next==null)//rightmost condition
				{
					t2.next=null;
				}
				else 
				{
					t2.next=t.next;
					
				}	
				System.out.println(t+"Deleted");
			}		
		}
			
	}
	private void update_Details(int id, Employee t)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice : 1.Update Name \n 2.Update Salary 3.Update Gender");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter Name to update");
			t.setName(sc.next());
			break;
		case 2:
			System.out.println("Enter salary to update");
			t.setSalary(sc.nextInt());
			break;
		case 3:
			System.out.println("Enter Gender to update:");
			t.setGender(sc.next());
			break;
		default:
			System.out.println("Invalid choice");
		}		
	}
	
	void update(int id)
	{
		if(root==null)
		{
			System.out.println("Empty list");
		}
		else
		{
			Employee t=root;
			while(t!=null)
			{
				int num=t.getId();
				if(id==num)
				{
					System.out.println("Details Found"+t);
					
				}
				else
				{
					t=t.next;
				}
				break;
				
			}
			if(t==null)
			{
				System.out.println("Details not found");
			}
			else
				update_Details(id, t);
		}
		
	}
	
	void print_list()
	{
		if(root==null)
			System.out.println("Empty List..!!");
		else
		{
			Employee t=root;
			
			while(t!=null)
			{
				System.out.println("Data"+t);
				t=t.next;
			}
			
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		Employee_List obj=new Employee_List();
		obj.createList();
		int ch;
		do
		{
			System.out.println("Enter the choice: \n 1.Register \n 2.Search \n 3.Delete \n 4.Print_List \n 5.Update");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				
				System.out.println("Enter the data to register");
				System.out.println("enter name");
				String name=sc.next();
				System.out.println("enter id");
				int id=sc.nextInt();
				System.out.println("enter gender");
				String Gender=sc.next();
				System.out.println("Enter Salary");
				int Salary=sc.nextInt();
				Employee e= new Employee(id,name,Gender,Salary);
				obj.insert_left(e);
				break;
			case 2:
				System.out.println("Enter id to search");
				int id1=sc.nextInt();
				obj.search(id1);
				break;
			case 3:
				System.out.println("Enter Id to delete");
				int del=sc.nextInt();
				obj.delete(del);
				break;
			case 4:
				System.out.println("Printing Employee List");
				obj.print_list();
				break;
			case 5:
				System.out.println("Enter Id to Update records");
				int id2=sc.nextInt();
				obj.update(id2);
				break;
			default:
				System.out.println("Out of Scope choice");			
			}
			
		}while(ch!=0);
	}
	

}
