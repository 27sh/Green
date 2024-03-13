package vo;

public class Product {
	private String pid;
	private String pname;
	private int qty;


	public String getPid() {
		return pid;
	}


	public void setPid(String pid) {
		this.pid = pid;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID : " +pid+ ", 제품명 : " +pname+ ", 양 : " +qty+ "\n";
	}
	
}
