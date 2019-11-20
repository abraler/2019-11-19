import java.util.Scanner;

public class Main4 {
    public static String[] getGray(int n) {
        String []result=null;
        if(n==1){
            result=new String[]{"0","1"};
        }else{
            String []str=getGray(n-1);
            result=new String[2*str.length];
            for (int i = 0; i <str.length ; i++) {
                result[i]="0"+str[i];
                result[result.length-1-i]="1"+str[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int a=in.nextInt();
            String[]c= getGray(a);
            for(String d:c){
                System.out.println(d);
            }
        }
    }
}
