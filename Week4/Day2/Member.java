package vo;

public class Member {
	private String title;
	private String id;
	private String write;

	
	public Member(String title, String write){
		this.title = title;
		this.write = write;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getWrite() {
		return write;
	}


	public void setWrite(String write) {
		this.write = write;
	}


}
