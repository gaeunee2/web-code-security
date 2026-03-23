// 컴퓨터학과 20220745 김가은
public enum Score {
	WIN, LOSE, EQUAL, ERROR;

    public static String print(Score rslt) {
        switch (rslt) {
            case WIN: 
            	return "당신이 이겼습니다.";
            case LOSE: 
            	return "컴퓨터가 이겼습니다.";
            case EQUAL: 
            	return "비겼습니다.";
            default: 
            	return "입력 오류입니다.";
        }
    }
}
