import java.util.*;

public class SimulationDriver {

	public static void main(String[] args) {
		String[] choices = new String[] {"A. Mango", "B. Chocolate", "C. Strawberry", "D. Mint"};
		IVoteService iVote = new IVoteService(new MultipleChoice("What is your favorite flavor of ice-cream?", choices));
		Random rand = new Random();
		int numOfStudents = 30;
		for(int i = 0; i < numOfStudents; i++) {
			Student s = new Student(""+i);
			int randAnswer = rand.nextInt(choices.length); 
			iVote.submitAnswer(s, (char)('A'+randAnswer));
		}
		iVote.report();
		System.out.println();
		
		IVoteService iVote2 = new IVoteService(new RightWrong("1 + 1 = 2."));
		for(int i = 0; i < numOfStudents; i++) {
			Student s = new Student(""+i);
			int randAnswer = rand.nextInt(2); 
			iVote2.submitAnswer(s, (char)('1'+randAnswer));
		}
		iVote2.report();
		
	}
}