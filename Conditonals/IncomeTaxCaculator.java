import java.util.*;
public class IncomeTaxCaculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int income=sc.nextInt();
        if(income<=500000){
            System.out.println("Noo tax");
        }else if(income>500000&&income<=1000000){
            int tax=(income*20)/100;
            System.out.println(tax);
        }else{
            int tax=(income*23)/100;
            System.out.println(tax);

        }
        sc.close();
    }
    
}
