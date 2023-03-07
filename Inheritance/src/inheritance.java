public class inheritance {
    public static void main(String[] args) {
        parent p1 = new parent(45);

        child ch1 = new child(18, 38);

        System.out.println(p1.getParentnumber());

        System.out.println(ch1.getChildnumber());
        System.out.println(ch1.getParentnumber());
    }
}
