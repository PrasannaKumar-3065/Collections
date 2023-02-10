package pk;
import java.util.*;
import java.util.logging.Logger;

class studentDetails {
    String studentName;
    String studentAddress;
    int id;

    studentDetails(String studentName, String studentAddress, int id) {
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}

public class hashSet {
    public static final Logger Log = Logger.getLogger("InfoLogging");

    public static void main(String[] args) {
        HashSet<studentDetails> set = new HashSet<studentDetails>();
        studentDetails sd1 = new studentDetails("prasanna", "1st street", 101);
        set.add(sd1);
        sd1 = new studentDetails("nixon","2nd Street", 102);
        set.add(sd1);
        sd1 = new studentDetails("vignesh", "3rd Street", 103);
        set.add(sd1);
        String print;

        for (studentDetails s : set) {
            print =s.studentName + " " + s.studentAddress + " " + s.id;
            Log.info(print);
        }

        Log.info("" + set.remove(sd1));
        for (studentDetails s : set) {
            Log.info(s.studentName + " " + s.studentAddress + " " + s.id);
        }
        Log.info("" +Integer.toString(set.size()) );
        Log.info(Integer.toString(sd1.hashCode()));

    }

}
