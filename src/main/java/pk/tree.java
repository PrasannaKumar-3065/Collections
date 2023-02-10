package pk;

import java.util.TreeSet;
import java.util.logging.Logger;
import java.util.Comparator;

public class tree {
    public static final Logger Log = Logger.getLogger("InfoLogging");
  public static void main(String[] args) {
    TreeSet<String> names = new TreeSet<>();

    names.add("prasanna");
    names.add("nixon");
    names.add("jeeva");
    names.add("jeshinth");
    names.add("thavasu");

    String tree ="TreeSet" + names;
    Log.info(tree);  
    TreeSet<String> sortedNames = new TreeSet<>(new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        return s1.compareTo(s2);
      }
    });
    sortedNames.addAll(names);
    String stree = "ascending order: " + sortedNames;
    Log.info(stree);  
    stree = ""+names.contains("nixon");
    Log.info(stree);
    names.remove("prasanna");
    stree = ""+names;
    Log.info(stree);  
    stree = "First element: " + names.first();
    Log.info(stree); 
    stree = "Last element: " + names.last();
    Log.info(stree);  
    String size = "Length: " + names.size();
    Log.info(size);  
    names.clear();
  }
}
