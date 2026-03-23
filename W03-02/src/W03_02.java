// 컴퓨터학과 20220745 김가은
import java.util.Scanner;

public class W03_02 {

	private static final Score[][] scoreBoard = {
	        {Score.EQUAL, Score.LOSE, Score.WIN},
	        {Score.WIN, Score.EQUAL, Score.LOSE},
	        {Score.LOSE, Score.WIN, Score.EQUAL}
	    };

	    public static Score whoswin(Game com, Game user) {
	        if (com == Game.ERROR || user == Game.ERROR) {
	            return Score.ERROR;
	        }
	        return scoreBoard[user.getValue()][com.getValue()];
	    }

	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);

	        System.out.print("컴퓨터의 입력 : ");
	        String comInput = s.next();
	        Game com = Game.encode(comInput);

	        System.out.print("당신의 입력 : ");
	        String yourInput = s.next();
	        Game user = Game.encode(yourInput);

	        Score rslt = whoswin(com, user);
	        System.out.println(Score.print(rslt));

	        s.close();
	    }

}
