// 컴퓨터학과 20220745 김가은
public class W02_01 {

	public static void calcSum(int... numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        System.out.println(sum);
    }
	
	public static void main(String[] args) {
		calcSum(10, 20);
        calcSum(10, 20, 30);
        calcSum(10, 20, 30, 40, 50);
	}
}
