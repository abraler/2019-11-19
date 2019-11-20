import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main6{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        while(in.hasNext()){
            String a=in.nextLine();
            String []b=a.split(" ");

            String r="0";
            if(Integer.valueOf(b[0])==0){
                for(int i=1;i<10;i++){
                    for(int j=0;j<Integer.valueOf(b[i]);j++){
                        r+=String.valueOf(i);
                    }
                }
                System.out.println(r.substring(1));
            }else{
                int pro=0;
                for(int i=1;i<10;i++){
                    if(Integer.valueOf(b[i])!=0){
                        pro=i;
                        break;
                    }
                }

            }

        }


    }
}