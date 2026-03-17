// 컴퓨터학과 20220745 김가은
import java.util.Comparator;

public class SortByNumDesc implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
    	// 내림차순
        return b.getId() - a.getId();
    }
}
