import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;  
  
@Entity  
@Table(name="student_jpa1")  
public class StudentEntity {  
  
    @Id  
    @Column(name="E_ID")
    private int s_id;  
    @Column(name="E_Name")
    private String s_name;
    @Column(name="E_Age")
    private int s_age;
    @OneToMany(mappedBy = "Address_Id", cascade = CascadeType.ALL, orphanRemoval = true)
    private int id;
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public StudentEntity() {  
        super();  
    }  
  
    public int getS_id() {  
        return s_id;  
    }  
  
    public void setS_id(int s_id) {  
        this.s_id = s_id;  
    }  
  
    public String getS_name() {  
        return s_name;  
    }  
  
    public void setS_name(String s_name) {  
        this.s_name = s_name;  
    }  
  
    public int getS_age() {  
        return s_age;  
    }  
  
    public void setS_age(int s_age) {  
        this.s_age = s_age;  
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + s_age;
		result = prime * result + s_id;
		result = prime * result + ((s_name == null) ? 0 : s_name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentEntity other = (StudentEntity) obj;
		if (s_age != other.s_age)
			return false;
		if (s_id != other.s_id)
			return false;
		if (s_name == null) {
			if (other.s_name != null)
				return false;
		} else if (!s_name.equals(other.s_name))
			return false;
		return true;
	}


	
      
}  