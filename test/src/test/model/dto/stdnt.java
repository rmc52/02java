package test.model.dto;

public class stdnt {
	
	private String name;
	
	
	public stdnt(String name, int score) {
		super();
		this.name = name;
		this.score = score;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	private int score;
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name +" 학생의 점수 : " +score+"점";
		
		
		
	}
	
}
