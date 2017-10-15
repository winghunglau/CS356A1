import java.util.*;

public class IVoteService {
	
	private Question question;
	private HashMap<Character, Integer> counts;
	
	public IVoteService(Question q) {
		question = q;
		counts = new HashMap<Character, Integer>();
	}
	
	public Question getQuestion() {
		return question;
	}
	
	public void submitAnswer(Student student, char answer) {
		question.recordAnswer(student, answer);
	}
	
	public void report() {
		List<Character> listOfAnswers = new ArrayList<Character> (question.getRecord().values());
		for(char c : listOfAnswers) {
			int count = counts.getOrDefault(c, 0);
			count++;
			counts.put(c, count);
		}
		Set<Character> keys = counts.keySet();
		for(char key : keys) {
			System.out.println(key + " : " + counts.get(key));	
		}
	}
}