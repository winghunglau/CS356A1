public class RightWrong extends Question {
	
	public RightWrong(String question) {
		super(question);
	}

	public String[] getChoices() {
		return new String[] {"Right", "Wrong"};
	} 

	public void recordAnswer(Student student, char answer) {
		record.put(student.getStudentID(), answer);
	}
}
