import java.util.Scanner;
import java.io.File;

public class FileHandling {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Filename:");
        File filename = new File(myObj.nextLine());
        myObj.close();

        CreateOpen checkFile = new CreateOpen();

        checkFile.doesExist(filename);
    }
}
