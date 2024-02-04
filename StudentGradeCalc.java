/*Task-2: STUDENT GRADE CALCULATOR USING JAVA*/
import java.util.Scanner;

public class StudentGradeCalc {
    public static void main(String[] args)
	{
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number of subjects:");
        int numSubjects=scanner.nextInt();

        // Input marks in each subject
        int totalMarks=0;
        for (int i=1;i<=numSubjects;i++)
		{
            System.out.print("Enter marks for Subject "+i+" (out of 100): ");
            int marks=scanner.nextInt();
			if(marks>100)
			{
				System.out.println("Please Enter properly");
				i--;
				continue;
			}
            totalMarks+=marks;
        }

        //Calculate total marks
        double averagePercentage=(double)totalMarks/numSubjects;

        //Calculate average percentage
        char grade=calculateGrade(averagePercentage);

        //Assign grades based on the average percentage achieved

        //Display results
        System.out.println("\nResults:");
        System.out.println("Total Marks: "+totalMarks);
        System.out.println("Average Percentage: "+averagePercentage+"%");
        System.out.println("Grade: "+grade);
    }

    //Method to calculate the grade based on average percentage
    private static char calculateGrade(double averagePercentage) {
        if (averagePercentage>=90)
		{
            return 'A';
        } 
		else if (averagePercentage>=80)
		{
            return 'B';
        }
		else if (averagePercentage>=70) 
		{
            return 'C';
        }
		else if (averagePercentage>=60) 
		{
            return 'D';
        } 
		else
		{
            return 'F';
        }
    }
}
		