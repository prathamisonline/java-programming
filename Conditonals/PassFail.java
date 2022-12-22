public class PassFail {
    public static void main(String[] args) {
        int marks=40;
        // if(marks<33){
        //     System.out.println("fail");
        // }else if(marks>=33){
        //     System.out.println("pass");
        // }
        // Using Ternery operator
        
        String reportCard=marks>=33?"Pass":"Fail";
        System.err.println(reportCard);
    }
    
}
