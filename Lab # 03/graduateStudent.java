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
public class graduateStudent extends student {
    public String getCourseGrade(){
        int total=0;
       for(int i=0; i<Num_of_tests; i++){ 
           total=total+Num_of_tests;
           if(total/Num_of_tests>=80){
            System.out.println("Pass");
           }
           else{
            System.out.println("Fail");
           }
           
    }
       return courseGrade;
}
}