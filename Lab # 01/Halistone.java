
public class Halistone {
    public static void main(String args[]){
        int n=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer");
        n=input.nextInt();
        while(n>1){
            if(n%2==0){
                n=n/2;
                System.out.print(n+",");
        }
            else{
                n=(3*n)+1;
                System.out.print(n+",");
            }
    }
}
}
