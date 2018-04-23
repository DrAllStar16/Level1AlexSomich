import java.util.Random;

public class FaveSubject {
	private String Student;
	private String Subject;
	
	Random r = new Random();

public FaveSubject(String Student){
	this.Student=Student;
	int i=r.nextInt(3);
	if (i==0) {
		Subject="Math";
	}
	else if (i==1) {
		Subject="Science";
		
	}
	else {
		Subject="P.E.";
	}
}
public String getSubject() {
	return Subject;	
}
public String getStudent() {
	return Student;	
}
}
