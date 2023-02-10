package pk;

import java.util.HashMap;
import java.util.logging.Logger;

public class Hmap{
  public static final Logger Log = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        HashMap<String,String> hash = new HashMap<String,String>();
        hash.put("stu101","prasanna");
        hash.put("stu102","nixon");
        hash.put("stu103","jeeva");
        hash.put("stu104","vignesh");
        String s = ""+hash;
        Log.info(s);
        s = "Size: "+hash.size();
        Log.info(s);
        String key = ""+hash.keySet();
        Log.info(key);
        String val = ""+hash.values();
        Log.info(val);
        hash.remove("emp012");
        s = ""+hash;
        Log.info(s);
        hash.replace("stu103", "thavasu");
        s = ""+hash;
        Log.info(s);
        s = ""+hash.get("stu101");
        Log.info(s);

    }

 
}
