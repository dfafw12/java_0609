package Day12;

public class Test01_2 {

	public String id;
	private String 성명;
	String 연락처; // 생략시 default 
	protected String 성별;
	
	// private 필드에 접근 방법
	public void 필드접근(String 성명) {
		this.성명 = 성명;
	}
	
}
