import java.util.Scanner;

class Marks {
	static int roll_no = 1;
	String name;
	double marks;
	
	double calcTotal(double py, double ch, double mt){
		double total = py + ch + mt;
		return total;
	}
	
	double calcAvg(double tt) {
		double avg = tt /3.0;
		return avg;
	}
	
}

class Physics extends Marks{
	double pymarks;
	double setPyMarks() {
		Scanner scan = new Scanner(System.in);
		pymarks = scan.nextInt();
		return pymarks;
	}
}

class Chemistry extends Marks{
	double chmarks;
	double setChMarks() {
		Scanner scan = new Scanner(System.in);
		chmarks = scan.nextInt();
		return chmarks;
	}
}


class Mathematics extends Marks{
	double mtmarks;
	double setMtMarks() {
		Scanner scan = new Scanner(System.in);
		mtmarks = scan.nextInt();
		return mtmarks;
	}
}

public class Student {
	
	public static void main(String[] args) {
		double average;
		double total_average = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of students: ");
		int n = scan.nextInt();
		int[] ar = new int[n];
		
		for (int i = 0; i < ar.length; i++) {
			
			System.out.println("Roll no is: "+Marks.roll_no);
			
			System.out.println("Enter the name of student: ");
			String name = scan.nextLine();
			scan.next();
			
			Physics phy = new Physics();
			System.out.println("Physics marks: ");
			double p_marks = phy.setPyMarks();
			
			Chemistry ch = new Chemistry();
			System.out.println("Chemistry marks: ");
			double c_marks = ch.setChMarks();
			
			Mathematics mt = new Mathematics();
			System.out.println("Mathematics marks: ");
			double m_marks = mt.setMtMarks();
			
			Marks mk = new Marks();
			double total_marks = mk.calcTotal(p_marks, c_marks, m_marks);
			System.out.println("Total Marks: "+total_marks);
			average = mk.calcAvg(total_marks);
			System.out.println("Average is: "+average);
			
			Marks.roll_no++;
			
			total_average = total_average + average;
		}
		
		System.out.println("Total average of class is: "+total_average);
	}
}


