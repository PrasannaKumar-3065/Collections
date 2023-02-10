package pk;

import java.util.HashMap;
import java.util.logging.Logger;
import java .util.*;

public class hash{
  public static final Logger Log = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        HashMap<String,String> hmap = new HashMap<String,String>();

        hmap.put("stu101","prasanna");
        hmap.put("stu102","nixon");
        hmap.put("stu103","jeeva");
        hmap.put("stu104","vignesh");
        String hash = ""+hmap;
        Log.info(hash);
        Log.info("Size: "+hmap.size());
        String key = ""+hmap.keySet();
        Log.info(key);
        String val = ""+hmap.values();
        Log.info(val);
        hmap.remove("emp012");
        hash = ""+hmap;
        Log.info(hash);
        hmap.replace("stu104", "thavasu");
        hash = ""+hmap;
        Log.info(hash);
        Log.info(hmap.get("stu104"));

    }

 
}