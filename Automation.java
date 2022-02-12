package week3.day1.Assignment5;

public class Automation extends MultipleLanguage implements Language,TestTool{
	static String sl = "selenium";
public void selenium() {
		System.out.println("selenium is API");
		super.python();
		
	}
	

	public void java() {
		System.out.println("java is case sensitive");
		super.ruby();
		this.python();
	}
public static void main(String[] args) {
	Automation at = new Automation();
	at.java();
	at.selenium();
	
}


}