import java.util.Scanner;

class AssignmentQ7{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name - ");
		String name = sc.next();
		
		System.out.print("Enter your age - ");
		int age = sc.nextInt();
		
		if(age>18&& age<19){
			System.out.print("Uncertainty about Career Path");
			System.out.print("Problem: Many 18-year-olds feel unsure about which career path to pursue, facing pressure to choose a major or start a job without a clear direction.\nSolution: Engage in exploratory activities like internships, job shadowing, or volunteering in different fields. This helps gain insights and clarify interests. Seeking advice from career counselors or mentors can also provide guidance.");
			System.out.print("Financial Independence and Management");
			System.out.print("Problem: Learning to manage personal finances and achieving financial independence can be challenging. Many 18-year-olds are new to budgeting, saving, and handling expenses.\nSolution: Educate yourself on basic financial literacy through courses, workshops, or books. Creating a budget, setting financial goals, and opening a savings account can help establish good financial habits early.");
			System.out.print("Transition to Adulthood and Independence");
			System.out.print("Problem: The transition from high school to adulthood involves significant changes, such as moving out, starting college, or working full-time. This can lead to stress and anxiety.\nSolution: Develop time management and organizational skills to handle new responsibilities. Building a support network of friends, family, or counselors can provide emotional support and practical advice during this transition.");
			}
		else if ( age>19 && age<22){
			System.out.print("Balancing Work/Study and Social Life");
			System.out.print("Problem: Juggling academic or work commitments with maintaining a social life can be difficult, leading to burnout or feeling overwhelmed.\nSolution: Prioritize tasks and use time management techniques like scheduling and setting boundaries. Make time for relaxation and hobbies to maintain a healthy balance.");
			System.out.print("Building Professional Skills");
			System.out.print("Problem: Developing skills that are attractive to employers can be challenging without real-world experience.\nSolution: Engage in internships, part-time jobs, or volunteer work related to your field of interest. Seek out workshops, online courses, or certifications to build and showcase your skills.");
			System.out.print("Mental Health and Well-being");
			System.out.print("Problem: Navigating the pressures of young adulthood can lead to stress, anxiety, or depression.\nSolution: Prioritize self-care practices like exercise, healthy eating, and adequate sleep. Don't hesitate to seek professional help from therapists or counselors if needed.");
			}
		else if ( age>22 && age<25){
			System.out.print("Career Advancement and Job Stability");
			System.out.print("Problem: Establishing a stable and fulfilling career can be challenging, with competition and evolving job markets.\nSolution: Continue to build your professional network and seek mentorship. Stay adaptable and open to learning new skills or considering different career paths if needed.");
			System.out.print("Long-term Financial Planning");
			System.out.print("Problem: Planning for long-term financial goals like buying a house or saving for retirement can seem daunting.\nSolution: Develop a financial plan that includes budgeting, saving, and investing. Consider seeking advice from financial planners or using financial management tools.");
			System.out.print("Maintaining Work-Life Balance");
			System.out.print("Problem: As career responsibilities increase, maintaining a healthy work-life balance can become more challenging.\nSolution: Set clear boundaries between work and personal time. Practice effective time management and prioritize activities that promote well-being and personal fulfillment.");
			}
		else{
			System.out.print("Invalid age entered");
			}
	}
}
