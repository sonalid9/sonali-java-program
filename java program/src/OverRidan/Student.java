package OverRidan;

public class Student {
int StudentId;

public void Info(int  StudentId)
{
	StudentId=8;
}}
   class Teacher extends Student
   {
	   private int TeacherId;
	   
	   public void Info(int  TeacherId) {
		   System.out.println("enter the techerId:"  +TeacherId);
	   }

   }
   class Principal extends Student
   {
	   private int principalId;
	   public void Info(int  principalId) {
		   System.out.println("enter the principalId:"+principalId);
	   }

   }
   
   class VoicPrincipal extends Student
   {
	   private int voiceprincipalId;
	   public void Info(int  voiceprincipalId) {
		   System.out.println("enter the voiceprincipalId:"+voiceprincipalId);
	   }
   }
   
   
 