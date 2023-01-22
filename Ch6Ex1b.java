package ch6ex1b;
import java.util.Scanner;

public class Ch6Ex1b {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int uin,uin2,holder=0;
                
        System.out.println("Enter a number");
            uin=input.nextInt();
        System.out.println("Enter a second larger number");
            uin2=input.nextInt();
            input.close();
            
            while(uin<uin2){
                int check=0;
                    for(int count=2; count<=uin/2; count++){
                        if(uin%count==0){
                            check=1;
                            break;
                        }
                        
                    }
                        if(check==0&&uin!=1&&uin!=0){
                            System.out.println(uin);
                }
                uin++;
            }
        }
    }
