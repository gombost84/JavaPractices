public class getset {
    public static void main(String[] args) {
        constructor c1 = new constructor(100, 10, "abcdef");

        System.out.println(c1.getMaxInt());
        System.out.println(c1.getMinInt());
        System.out.println(c1.getString());
        System.out.println(c1.getBool());

        c1.setMaxInt(150);
        c1.setMinInt(30);
        c1.setString("fedcba");
        c1.setBool(false);
        
        System.out.println(c1.getMaxInt());
        System.out.println(c1.getMinInt());
        System.out.println(c1.getString());
        System.out.println(c1.getBool());
    }
}
