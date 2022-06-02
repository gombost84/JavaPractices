public class child extends parent {
    private int childNumber;

    public child(int childNumber, int parentNumber) {
        super(parentNumber);
        this.childNumber = childNumber;
    }

    public void setChildnumber(int number) {
        this.childNumber = number;
    }

    public int getChildnumber() {
        return childNumber;
    }
    
}
