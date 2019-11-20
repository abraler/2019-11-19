import java.util.Scanner;
public class Main5{
    public static String GetSequeOddNum(int num){
        int s=num;
        int q=0;
        if(num==1){
            q=1;
        }else{
            for (int i = s-1; i>0 ; i--) {
                q+=i;
            }
            q+=1;
        }
        int p=1;
        while(q>1){
            p+=2;
            q--;
        }
        String o=String.valueOf(p);
        for (int i = 0; i <num-1 ; i++) {
            p=p+2;
            o=o+"+"+String.valueOf(p);
        }
        return o;
    }
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int a=in.nextInt();
            String s= GetSequeOddNum(a);
            System.out.println(s);
        }
    }
}