public class CWH_13_Strings {
    public static void main(String[] args) {
//        String name = new String("Arti Sahu");
//        System.out.println(name);
//        System.out.println(name.length());
//        System.out.println(name.toLowerCase());
//        System.out.println(name.toUpperCase());

        String name = "   Arti    Sahu A   ";
//        System.out.println(name.trim());
        System.out.println(name.substring(5));
        System.out.println(name.substring(5, 8));
        System.out.println(name.replace(' ', 'p'));
        System.out.println(name.replace(" ", ""));
        System.out.println(name.startsWith(" "));
        System.out.println(name.endsWith(" "));
        System.out.println(name.charAt(6));
        System.out.println(name.indexOf('A'));
        System.out.println(name.indexOf('A', 5));
        System.out.println(name.lastIndexOf('a'));
        System.out.println(name.equals("Arti"));
        System.out.println(name.equalsIgnoreCase("Arti"));
        System.out.println("My name is Arti Sahu. I am a \"very good girl.\"");
    }
}
