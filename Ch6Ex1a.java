package ch6ex1a;
import java.util.Scanner;

public class Ch6Ex1a {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int uin,holder=0,check=0;
                
        System.out.println("Enter a number");
            uin=input.nextInt();
            input.close();
        holder=uin/2;
        //System.out.println(holder); debug
        if(uin==0||uin==1){
            System.out.println("Your number: "+uin+" is not a prime number");
        }
        else{
            for(int count=2;count<=holder;count++){
                //System.out.println("Count: "+count); debug
                if(holder%count==0){
                    System.out.println("Your number: "+uin+" is not a prime number");
                    check=1;
                    break;
                }
            }
            if(check==0){
                System.out.println("Your number: "+uin+" is a prime number");
            }
        }
    }
    
}
