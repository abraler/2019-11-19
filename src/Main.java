public class Main {
    public static StringBuffer AddLongInteger(String addend,String augend){
        StringBuffer a=new StringBuffer(addend);
        StringBuffer b=new StringBuffer(augend);
        String c=null;

        if(a.length()>b.length())
        c="0"+addend;
        else {
            c="0"+augend;
        }

        StringBuffer d=new StringBuffer(c);
        System.out.println(d);
        int t=0;
        for (int i =(a.length()>b.length()?a.length():b.length())-1 ; i >=(a.length()>b.length()?b.length():a.length()); i--) {
            char k=a.charAt(i);
            String n=String.valueOf(k);
            int g=Integer.valueOf(n);


            char kn=b.charAt(i);
            String nn=String.valueOf(kn);
            int gn=Integer.valueOf(nn);

             t=g+gn;
             if(t>9){
                 int s=t%10;
                 System.out.println(s);
                 String o=String.valueOf(s);
                 char e=o.charAt(0);
                 d.setCharAt(i+1,e);
                 e=d.charAt(i);
                 o=String.valueOf(e);
                 s=Integer.valueOf(o);
                 s=s+1;
                 o=String.valueOf(s);
                 e=o.charAt(0);
                 d.setCharAt(i,e);
                 System.out.println(d);
             }
             else{
                 String o=String.valueOf(t);
                 d.setCharAt(i+1,o.charAt(0));
             }
        }
        return d;
    }

    public static void main(String[] args) {
        StringBuffer a= AddLongInteger("111111111111","111111");
        System.out.println(a);
    }
}
