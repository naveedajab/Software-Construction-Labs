/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author fa16-bse-081
 */
public class student {
    public int Num_of_tests=3;
    protected String name;
    protected int test;
    protected String courseGrade;

    public student(){
        System.out.println("No name");
    }
    public student(String studentName){
        name=studentName;
    }
    public String getCourseGrade(){
        return courseGrade;     
    }
    public String getName(){
        return name;   
    }
    public int getTestScore(){
        return test;
    }
    public void setName(String studentName){
        name=studentName;
    }
    public void setTestScore(int tScore){
        test=tScore;    
    }
    public void display(){
     System.out.println("Name:"+name);   
     System.out.println("TestScore:"+test);
     System.out.println("CourseGrade:"+courseGrade);
    }
    /*public class testClass
    {
       int roaster[]=new int[10];
       
       
    }*/
    public static void main(String[] args) {
       student s=new student();
       student gs=new graduateStudent();
       student ugs=new undergraduateStudent();
       s.setName("Rizwan");
       s.setTestScore(70);  
       gs.getCourseGrade();
       ugs.getCourseGrade();
       s.display();
       
       
    }
    
}
