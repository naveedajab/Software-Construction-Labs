package lab2;

/**
 *
 * @author fa16-bse-081
 */
public class LabWork{

    public static void main(String[] args) {
       double e=2;
       e=e/0;
       System.out.println(e);
       /////////////////Ex2/////////////////
       String a="zeeb";
       System.out.println(a);
       a=a.toUpperCase();
       String b=a.toUpperCase();
       System.out.println(a);
       System.out.println(b);
       //////////////////Ex3//////////////////
       System.out.println(a.equals(b));
       System.out.println(b.equals(a));
       /////////////////Ex4/////////////////
       String value= null;
       System.out.println(value);
       /////////////////Ex5/////////////////
       LabWork v=new LabWork();
       LabWork k=v;
       String s1="zeeb";
       //v.add(s1);
       
       
       /////////////Ex6////////////////////
       LabWork v2=new LabWork();
       LabWork k2=v2;
       if(v2==k2){
           System.out.println("same");
       }
       else{
                  System.out.println("different");
                   }
       /////////////////Ex7//////////////////
       String s2="zeeb";
       String s3="zeeb";
       if(s2==s3){
           System.out.println("same");
       }
       else{
      System.out.println("different");     
    }
       /////////////Ex8////////////////////
       String c=null;
       //String d=c.toUpperCase(); //Error
       System.out.println(c);
       /////////////Ex9///////////////////
      
       
    }/////main
    
    }/////////class LabWork

    


