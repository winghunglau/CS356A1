public class MultipleChoice extends Question {
	
	private String[] choices;
	
	public MultipleChoice(String question, String[] choices) {
		super(question);
		this.choices = choices;
	}
	
	public String[] getChoices() {
		return choices;
	}
	
	public void recordAnswer(Student student, char answer) {
		record.put(student.getStudentID(), answer);
	}
}

