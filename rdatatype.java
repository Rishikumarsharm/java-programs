public class rdatatype
{
    public static void main(String[] args)
    {
        byte x=5;
        short y=8;
        int z=x+y;
        int a=45+6;
        float b=6.54f+5;
        System.out.println(a);
        System.out.println(b);
        System.out.println(z);

        //increment or decrement operator
        int k=8;
        System.out.println(++k);//++k increment then use
        System.out.println(k++);//K++ use then increment
        int j=80;
        System.out.println(--j);//--j decrement then use
        System.out.println(j--);//j-- use then decrement
        System.out.println(j);
        int l=7;
        int m=++l*8;
        System.out.println(m);

        char  ch='s';
        System.out.println(++ch);
        char grade='b';
        grade=(char)(grade-8);// type casting
        System.out.println(grade);
    }
}
