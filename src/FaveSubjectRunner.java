
public class FaveSubjectRunner {
public static void main(String[] args) {
	FaveSubject FS1 = new FaveSubject("Alex");
	FaveSubject FS2 = new FaveSubject("Julia");
	FaveSubject FS3 = new FaveSubject("Olivia");
	System.out.println(FS1.getStudent()+" "+FS1.getSubject());
	System.out.println(FS2.getStudent()+" "+FS2.getSubject());
	System.out.println(FS3.getStudent()+" "+FS3.getSubject());
}
}
