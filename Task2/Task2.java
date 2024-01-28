import java.util.*;
class Operations
{
    public float getAverage(int subject, int marks)
    {
        float avg = (float)(marks/subject);
        return avg;
    }
    public void getGrade(float average)
    {
        if(average >= 90 && average <=100)
            {
            System.out.println("Grade : O");
            }
        else if(average>=70&& average<90)
            {
                System.out.println("Grade : A+");
            }
        else if(average>=55&& average<70)
            {
                System.out.println("Grade :  B");
            }
        else if(average>=35&& average<55)
            {
                System.out.println("Grade : C");
            }
            else
            {
                System.out.println("Grade : F");
            }
    }
}
public class Task2 {
    public static void main(String[] args)
    {
        Operations obj = new Operations();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the number of subjects : ");
        int sub=sc.nextInt();
        int[] marks=new int[sub];
        int Tmarks=0;
        System.out.println("Enter Marks for each subject:");
        for(int i=0;i<sub;i++)
        {
            System.out.println("Please enter for subject "+(i+1));
            marks[i]=sc.nextInt();
            Tmarks+=marks[i];
        }
        float Average = obj.getAverage(sub, Tmarks);
        System.out.println("========Result=============");
        System.out.println("Total Marks : "+Tmarks);
        System.out.println("Average of the Subjects :"+Average);
        obj.getGrade(Average);



    }
}
