public class constructor {
    private int maxInt;
    private int minInt;
    private String string;
    private boolean bool = true;

    public constructor (int maxInt, int minInt, String string) {
        this.maxInt = maxInt;
        this.minInt = minInt;
        this.string = string;
    }

    public int getMaxInt () {
        return maxInt;
    }

    public int getMinInt () {
        return minInt;
    }

    public String getString () {
        return string;
    }

    public boolean getBool () {
        return bool;
    }

    public void setMaxInt (int maxint) {
        maxInt = maxint;
    }

    public void setMinInt (int minint) {
        minInt = minint;
    }

    public void setString (String tostring) {
        string = tostring;
    }

    public void setBool (boolean tobool) {
        bool = tobool;
    }
}
