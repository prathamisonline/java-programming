import java.util.*;
public class print1Ton {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        while (count<=n){
            System.out.println("counter: "+ count);
            count++;
        }
        sc.close();
    }
    
}
