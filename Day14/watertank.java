package Day14;
import java .util.Scanner;
public class watertank {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int I =sc.nextInt();
        int tot ;
        while (true) {
            int i = 1;
            tot = (C-i);
            if (tot==0){
            return i;
            }
            tot+=I;
            if (tot>C){
                tot = C;

            }
            i++;
            
        }
        sc.close();
     }
    
}
