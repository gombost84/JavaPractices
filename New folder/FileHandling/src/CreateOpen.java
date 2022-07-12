import java.io.File;

public class CreateOpen {

    public void doesExist (File filename) {
        if (filename.exists()) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }    
}
