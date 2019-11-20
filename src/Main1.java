import java.util.Scanner;
public class Main1{
    public static void menu(int q,int t,String s){
        for(int a=0;a<t;a++){
            if(a==0||a==t-1){
                for(int g=0;g<q;g++){
                    System.out.print(s);
                }
                System.out.println();
            }else{
                System.out.print(s);
                    System.out.print(" ");
                System.out.print(s);
                System.out.println();
            }

        }
    }
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
            String f=in.nextLine();
            String []c=f.split(" ");
            int a=Integer.valueOf(c[0]);
            String b=c[1];
            int t=0;
            if(a%2==1){
                t=a/2+1;
            }else{
                t=a/2;
            }
            menu(a,t,b);
        }
    }