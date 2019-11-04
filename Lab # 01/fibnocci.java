
public class fibnocci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=0;
        int l=0;
        int n=1;
        for(int i=1; i<=5; i++){
             t=l;
             l=n;
             n=t+l;
             System.out.println(t);
           }
    }
    
}
