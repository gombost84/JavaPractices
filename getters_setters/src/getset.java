public class GetSet {
    public static void main(String[] args) {
        Constructor c1 = new Constructor(100, 10, "abcdef");

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
