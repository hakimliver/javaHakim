
package basic;
import java.util.Scanner;
public class procticeIfCondition {
    public static void main(String[] args) {



        Scanner vv=new Scanner(System.in);
        System.out.println("how many goals barca scored? ");
        int barca= vv.nextInt();


        System.out.println("how many goals madrid scored");
        int madrid=vv.nextInt();

    if (barca==madrid){
        System.out.println(" no one win !!! ");
    }
      else if (barca>madrid){
        System.out.println("barca win !!");
    }
        else if(barca<madrid) {
        System.out.println("madrid win !!");
    }



    }






}
