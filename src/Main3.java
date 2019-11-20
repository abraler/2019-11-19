import java.util.Scanner;

public class Main3 {
    public static String AddLongInteger(String addend, String augend) {
        StringBuffer a = new StringBuffer(addend);
        StringBuffer b = new StringBuffer(augend);
        String c="0";

        if (a.length() > b.length()) {
            for (int i = 0; i < a.length() - b.length(); i++) {
                c += "0";
            }
            c=c+augend;
            b=new StringBuffer(c);
            addend ="0"+addend;
            a=new StringBuffer(addend);

        } else if (a.length() < b.length()) {
            for (int i = 0; i < b.length() - a.length(); i++) {
                c += "0";
            }
            c=c+addend;
            a=new StringBuffer(c);
            augend="0"+augend;
            b=new StringBuffer(augend);
        }else{
            addend ="0"+addend;
            augend="0"+augend;
            a=new StringBuffer(addend);
            b=new StringBuffer(augend);
        }
        for (int i=c.length()-1;i>=0; i--) {

            char k=a.charAt(i);
            String n=String.valueOf(k);
            int g=Integer.valueOf(n);

            char kn=b.charAt(i);
            String nn=String.valueOf(kn);
            int gn=Integer.valueOf(nn);

            int t=g+gn;
            if(t>9){
                int s=t%10;
                String o=String.valueOf(s);
                char e=o.charAt(0);
                b.setCharAt(i,e);
                e=b.charAt(i-1);
                o=String.valueOf(e);
                s=Integer.valueOf(o);
                s=s+1;
                if(s>0){

                }
                o=String.valueOf(s);
                e=o.charAt(0);
                b.setCharAt(i-1,e);

            }
            else{
                String o=String.valueOf(t);
                b.setCharAt(i,o.charAt(0));
            }
        }
        int r= Integer.valueOf(String.valueOf(b.charAt(0)));

        if(r==0){
               String f=b.substring(1);
               return f;
        }else{

                String f=b.substring(0);
                return f;
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
        String a=in.nextLine();
        String b=in.nextLine();
        String c= AddLongInteger(a,b);
        System.out.println(c);
        }
    }

}
