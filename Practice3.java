import java.util.*; 

class Practice3{
	public static void main (String[] args){
		
		Student [] students = {
			new Student("Jithe","J001",90,85,75),
			new Student("Jane", "S002", 65, 70, 60),
            new Student("Alice", "S003", 55, 60, 65),
            new Student("Bob", "S004", 45, 50, 55),
            new Student("Chris", "S005", 35, 40, 30),
            new Student("Eva", "S006", 80, 85, 90),
            new Student("David", "S007", 60, 65, 70),
            new Student("Sophia", "S008", 50, 55, 60),
            new Student("Max", "S009", 85, 90, 80),
            new Student("Anna", "S010", 95, 90, 100)
		};
		
		System.out.println("Student Details Before Ranking :");
        for (Student student : students) {
            student.displayInfo();
        } 
        
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].avgMarks < students[j].avgMarks) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        
        System.out.println("\nStudent Details After Ranking:");
        for (int i = 0; i < students.length; i++) {
            System.out.print("Rank " + (i + 1) + ": ");
            students[i].displayInfo();
        }
	}
}

class Student{
	String name;
	String studentID;
	int prfMarks;
	int dbmsMarks;
	int itsMarks;
	int totalMarks;
	double avgMarks;
	char gradePrf,gradeDbms,gradeIts;
	
	
	public Student(String name,String studentID,int prfMarks,int dbmsMarks,int itsMarks){
		
		this.name = name;
		this.studentID = studentID;
		this.prfMarks = prfMarks;
		this.dbmsMarks = dbmsMarks;
		this.itsMarks = itsMarks;
		
		totalMarks = prfMarks + dbmsMarks + itsMarks;
		avgMarks = totalMarks / 3;
		
		assignGradePrf();
		assignGradeDbms();
		assignGradeIts();
	}
	
	public void assignGradePrf(){
		if( prfMarks >= 75){
			gradePrf = 'A';
		}
		else if(prfMarks >= 65){
			gradePrf = 'B';
		}
		else if(prfMarks >= 55){
			gradePrf = 'C';
		}
		else if(prfMarks >= 35){
			gradePrf = 'S';
		}
		else{
			gradePrf = 'F';
		}
	}
	
	public void assignGradeDbms(){
		if( dbmsMarks >= 75){
			gradeDbms = 'A';
		}
		else if(dbmsMarks >= 65){
			gradeDbms = 'B';
		}
		else if(dbmsMarks >= 55){
			gradeDbms = 'C';
		}
		else if(dbmsMarks >= 35){
			gradeDbms = 'S';
		}
		else{
			gradeDbms = 'F';
		}
	}
	
	public void assignGradeIts(){
		if( itsMarks >= 75){
			gradeIts = 'A';
		}
		else if(itsMarks >= 65){
			gradeIts = 'B';
		}
		else if(itsMarks >= 55){
			gradeIts = 'C';
		}
		else if(itsMarks >= 35){
			gradeIts = 'S';
		}
		else{
			gradeIts = 'F';
		}
	}
	public void displayInfo() {
        System.out.println(name + " (ID: " + studentID + ") - Total: " + totalMarks + ", Average: " + avgMarks + ", PRF Grade: " + gradePrf+ ", DBMS Grade: " + gradeDbms+ ", ITS Grade: " + gradeIts);
    }
}

