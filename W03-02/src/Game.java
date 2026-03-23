// 컴퓨터학과 20220745 김가은
public enum Game {
	ROCK(0), PAPER(1), SCISSORS(2), ERROR(-1);

    private final int value;

    // Constructor
    Game(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Game encode(String input) {
        switch (input) {
            case "바위": 
            	return ROCK;
            case "보": 
            	return PAPER;
            case "가위": 
            	return SCISSORS;
            default: 
            	return ERROR;
        }
    }
}
