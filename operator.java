public class operator
{
    public static void main(String[] args)
    {
        //arthematic operator
        int a=5;
        int b=6+a;
        System.out.println(b);
        int c=5;
        int d=6-c;
        System.out.println(d);
        int e=5;
        int f=6*e;
        System.out.println(f);
        int g=5;
        float h=6f/g;
        System.out.println(h);
        int i=5;
        int j=6%i;
        System.out.println(j);
        System.out.println("\n");
        //4.8%1.1 ---> return decimal remainder


        // assignment operator
        int k=9;
        k+=3;
        System.out.println(k);
        int l=78;
        l-=45;
        System.out.println(l);
        System.out.println("\n");
        //comparison operator
        int ab=9;
        int bc=8;
        System.out.println(ab>bc);
        System.out.println(ab<bc);
        System.out.println(ab==bc);
        System.out.println(ab>=bc);
        System.out.println(ab<=bc);
        System.out.println("\n");

        //logical operator
        int cd=9;
        int de=10;
        System.out.println(cd>de && cd<de);
        System.out.println(cd>de || cd<de);
        System.out.println(cd!=de);
        System.out.println("\n");

        //bitwise operator
        System.out.println(2&3);



    }
}
