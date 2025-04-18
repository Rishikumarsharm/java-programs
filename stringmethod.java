public class stringmethod
{
    public static void main(String[] args)
    {
        String name="LOKESH";
        int value=name.length();
        System.out.println(value);

        String name2=name.toLowerCase();
        System.out.println(name2);

        String nonTrimmedString="   lokesh   ";
        System.out.println(nonTrimmedString.trim());

        System.out.println(name.substring(1,5));

        String replace=name.replace("LOKESH","RISHI");
        System.out.println(replace);

        boolean lokesh=name.startsWith("LOK");
        System.out.println(lokesh);
        boolean l=name.endsWith("SH");
        System.out.println(l);

         






    }
}
