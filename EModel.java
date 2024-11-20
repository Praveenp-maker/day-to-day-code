package List;

public class EModel {

	private int num;
	private String name;
	private String company;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "EModel [num=" + num + ", name=" + name + ", company=" + company + "]";
	}
	public EModel(int num, String name, String company) {
		super();
		this.num = num;
		this.name = name;
		this.company = company;
	}
	
}
