package pk;

import java.util.HashMap;
import java.util.logging.Logger;

public class Hmap{
  public static final Logger Log = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        HashMap<String,String> hmap = new HashMap<String,String>();

        hmap.put("stu101","prasanna");
        hmap.put("stu102","nixon");
        hmap.put("stu103","jeeva");
        hmap.put("stu104","vignesh");
        String s = ""+hmap;
        Log.info(s);
        s = "Size: "+hmap.size();
        Log.info(s);
        String key = ""+hmap.keySet();
        Log.info(key);
        String val = ""+hmap.values();
        Log.info(val);
        hmap.remove("emp012");
        s = ""+hmap;
        Log.info(s);
        hmap.replace("stu103", "thavasu");
        s = ""+hmap;
        Log.info(s);
        Log.info(hmap.get("stu101"));

    }

 
}
