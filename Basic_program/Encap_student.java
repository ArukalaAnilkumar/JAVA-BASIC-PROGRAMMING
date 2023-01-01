package Basic_program;
// encapsulation
public class Encap_student {
	private String name;
	private String rollnum;
	private String phonenum;
	private String dateofbirth;
	
	
	public Encap_student(String name, String rollnum, String phonenum, String dateofbirth) {
	//	super();
		this.name = name;
		this.rollnum = rollnum;
		this.phonenum = phonenum;
		this.dateofbirth = dateofbirth;
	}
	
	public Encap_student() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollnum() {
		return rollnum;
	}
	public void setRollnum(String rollnum) {
		this.rollnum = rollnum;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	

}
