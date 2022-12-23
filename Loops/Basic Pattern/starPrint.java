/*


*
**
***
****

Rules for printing stars pattern
1.outer loop will decide how many lines we want .means how many times our loop will run to print no of lines

2.inner loop will decide how many stars we want in our each lines. 

3.what to print.



 */
public class starPrint {
    public static void main(String[] args) {
        // one line
        for(int line=1;line<=4;line++){
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
