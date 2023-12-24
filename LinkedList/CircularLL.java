import java.util.Scanner;
public class CircularLL 
{
	    Node root,last;
	    
	    void createList()
	    {
	        last=root=null;//root is never created but assigned as per need
	        //the 1st node is called root
	    }
	    
	    void insert_left(int e)
	    {
	        Node n=new Node(e);
	        
	        if(root==null)   
	        {
	        	 root=last=n;
	        	 last.next=root;
	        	
	        }
	        
	        else
	        {
	            n.next=root;//1	            
	            root=n;//2
	            last.next=root;
	        }
	        System.out.println("Inserted");       
	    }
	    void insert_right(int e)
	    {   Node n=new Node(e);
	        if(root==null)    
	        {
	        	 root=last=n;
	        	 last.next=root;
	        }
	        
	        
	        else
	        {
	        	last.next=n;
	        	last=n;
	        	last.next=root;
	           Node t=root;//1
	          
	        }
	        System.out.println("Inserted");       
	    }
	     void delete_left()
	    {
	        if(root==null)
	            System.out.println("Empty List");       
	        else
	        {
	          Node t=root;//1
	         if(root==last)
	         {
	        	 root=last=null;
	         }
	         else
	         {
	        	 root=root.next;
	        	 last.next=root;	        	 
	         }	         
	        }
	    }
	     	     
	    void delete_right()
	    {   if(root==null)
	            System.out.println("Empty List");       
	        else
	        {
	          Node t=root;//1
	          Node t2=t;//1
	          while(t!=last)//2
	          {
	        	  t2=t;
	        	  t=t.next; }
	          if(root==last)//only one node
	              root=last=null;//manual reset
	          else
	          {
	        	  last =t2;
	        	  last.next=root;
	          }
	          System.out.println(t.data+" deleted");       
	         }
	    }
	    
	void print_list()
	{  if(root==null)
	            System.out.println("Empty List");       
	   else
	   {
	       Node t=root;
	       do
	       {
	    	   System.out.println("Data"+t.data);
	    	   t=t.next;
	       }while(t!=root);
	       
	   }   
	}
	
	    

	      
	   public static void main(String args[])
	     {
	         Scanner in=new Scanner(System.in);
	         CircularLL obj=new CircularLL();
	         obj.createList();
	         int ch;
	         do
	         {
	           System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n 5.Print List\n0.Exit\n:");
	           ch=in.nextInt();//read
	           switch(ch)
	           {
	               case 1:
	                       System.out.println("\nEnter a number:");
	                       int e=in.nextInt();
	                       obj.insert_left(e);
	                       break;
	               case 2:
	                       System.out.println("\nEnter a number:");
	                       e=in.nextInt();
	                       obj.insert_right(e);
	                       break;    case 3:
	                      obj.delete_left();
	                      break;
	               case 4:
	                      obj.delete_right();
	                      break;
	               
	               case 5:
	                   System.out.println("\nelements in list:");
	                   obj.print_list();
	                   break;
	               
	               case 0:
	                       System.out.println("Exiting");
	                   break;
	               default:
	                       System.out.println("Wrong Choice");
	                   break;
	           }
	             
	         }while(ch!=0);
	     }
	      
	}


