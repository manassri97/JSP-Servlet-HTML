import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_jpql")
public class Employee {

		@Id
		@Column(name="E_Id")
		@GeneratedValue
		private int eid;	
		
		@Column(name="Name")
		private String name;
		
		@Column(name="Salary")
		private int salary;
		
		@Column(name="Dept")
		private String dept;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getEid() {
			return eid;
		}

		public void setEid(int eid) {
			this.eid = eid;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		public String getDept() {
			return dept;
		}

		public void setDept(String dept) {
			this.dept = dept;
		}
		
}