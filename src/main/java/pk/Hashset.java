package pk;
import java.util.*;
import java.util.logging.Logger;

class Studentdetails {
    String studentName;
    String studentAddress;
    int id;

    Studentdetails(String studentName, String studentAddress, int id) {
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}

public class Hashset{
    public static final Logger Log = Logger.getLogger("InfoLogging");

    public static void main(String[] args) {
        HashSet<Studentdetails> set = new HashSet<Studentdetails>();
        Studentdetails sd1 = new Studentdetails("prasanna", "1st street", 101);
        set.add(sd1);
        sd1 = new Studentdetails("nixon","2nd Street", 102);
        set.add(sd1);
        sd1 = new Studentdetails("vignesh", "3rd Street", 103);
        set.add(sd1);
        String s1;

        for (Studentdetails s : set) {
            s1 =s.studentName + " " + s.studentAddress + " " + s.id;
            Log.info(s1);
        }
        s1 = "" + set.remove(sd1);
        Log.info(s1);
        for (Studentdetails s : set) {
            s1 = s.studentName + " " + s.studentAddress + " " + s.id;
            Log.info(s1);
        }
        s1 = ""+set.size();
        Log.info(s1);
        s1 = ""+sd1.hashCode();
        Log.info(s1);

    }
}
