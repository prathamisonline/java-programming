import java.util.*;
public class checkForPrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n==2){
            System.out.println("number is prime");
        }else{boolean isPrime=true;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime=false;
            }sc.close();
        }   if(isPrime==true){
            System.out.println("number is prime");
    
        }else{
            System.out.println("number is not prime");
        }}
        
}  
    
}
