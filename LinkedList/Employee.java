
public class Employee 
{
	private int id;
	private String name;
	private String Gender;
	private int Salary;
	Employee next;
	
	public Employee(int id,String name,String Gender,int salary)
	{
		this.id=id;
		this.name=name;
		this.Gender=Gender;
		this.Salary=salary;
		this.next=null;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Gender=" + Gender + ", Salary=" + Salary + "]";
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

}
