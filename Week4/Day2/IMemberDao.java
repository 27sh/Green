package db;

import vo.Member;

public interface IMemberDao {
	
	public boolean insert(Member m);
	
	public void selectAll();
	
	public void findByid();
	
	public void findByTitle();
	
	public void update();
	
	public void delete(int mno);
	
	public void seeNote(int mno);
}
