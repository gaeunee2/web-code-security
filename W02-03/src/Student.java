// 컴퓨터학과 20220745 김가은
public class Student {
    private String dept;
    private int id;
    private String name;

    public Student(String dept, int id, String name) {
        this.dept = dept;
        this.id = id;
        this.name = name;
    }

    public String getDept() { 
    	return dept; 
    }
    
    public int getId() { 
    	return id; 
    }

    @Override
    public String toString() {
        return dept + "/" + id + "/" + name;
    }
}
