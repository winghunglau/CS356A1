import java.util.*;

public abstract class Question {
	
	private String question;
	protected HashMap<String,Character> record;
	
	public Question(String quesiton) {
		this.question = question;
		record = new HashMap<String, Character>();
	}
	
	public String getQuestion() {
		return question;
	}
	
	public HashMap<String,Character> getRecord() {
		return record;
	}
	
	public abstract String[] getChoices();
	public abstract void recordAnswer(Student student, char answer);

}
