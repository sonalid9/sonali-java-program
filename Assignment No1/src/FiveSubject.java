import java.util.Scanner;
public class FiveSubject {

  public static void main(String[] args) {
  Scanner cs=new Scanner(System.in);
      double sub1,sub2,sub3,sub4,sub5,total_marks,avg,percentage;

       System.out.println("Enter marks of 5 subjects out of 100:");
      sub1=cs.nextDouble();
      sub2=cs.nextDouble();
      sub3=cs.nextDouble();
      sub4=cs.nextDouble();
      sub5=cs.nextDouble();

       total_marks=sub1+sub2+sub3+sub4+sub5;
      avg=total_marks/5.0;
      percentage=(total_marks/500)*100;

       System.out.println("Total Marks: "+total_marks);
      System.out.println("Average: "+avg);
      System.out.println("Percentage: "+percentage+"%");
         cs.close(); 
 }
}