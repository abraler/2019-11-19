import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String b=in.nextLine();
        StringBuffer c=new StringBuffer(a);
        StringBuffer d=new StringBuffer(b);
        StringBuffer e=new StringBuffer(c.length()+1);
        if(c.length()==d.length()){
            for (int i = c.length()-1; i >=0 ; i--) {
                int s=Integer.valueOf(c.charAt(i))+Integer.valueOf(d.charAt(i));
                if(s>9){
                  //  c.setCharAt(i-1,);
                }
            }

        }
    }
}
