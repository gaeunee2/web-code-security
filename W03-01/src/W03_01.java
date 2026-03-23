// 컴퓨터학과 20220745 김가은
import java.util.Scanner;

public class W03_01 {
	
	public static Game encode(String str) {
		switch (str) {
	        case "바위": 
	        	return Game.ROCK;
	        case "보": 
	        	return Game.PAPER;
	        case "가위": 
	        	return Game.SCISSORS;
	        default: 
	        	return Game.ERROR;
		} 
	}
	
	public static Score whoswin(Game com, Game you) {
		if(com == Game.ERROR || you == Game.ERROR) {
			return Score.ERROR;
		}
        if (com == you) {
        	return Score.EQUAL;
        }

        if ((you == Game.ROCK && com == Game.SCISSORS) ||
            (you == Game.PAPER && com == Game.ROCK) ||
            (you == Game.SCISSORS && com == Game.PAPER)) {
            return Score.WIN;
        }
        else {
        	return Score.LOSE;
        }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("컴퓨터의 입력: ");
        String comStr = sc.next();
        System.out.print("당신의 입력: ");
        String youStr = sc.next();

        Game com = encode(comStr);
        Game you = encode(youStr);
        Score result = whoswin(com, you);

        if (result == Score.WIN) {
            System.out.println("당신이 이겼습니다.");
        } 
        else if (result == Score.LOSE) {
            System.out.println("컴퓨터가 이겼습니다.");
        } 
        else if (result == Score.EQUAL) {
            System.out.println("비겼습니다.");
        } 
        else {
            System.out.println("입력 오류입니다.");
        }

        sc.close();
	}
}
