package sample.tablebuilder;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MySettings {
    private static final Logger log = Logger.getLogger ( MySettings.class );
    private static Map<String,List<ColumnUserObject>> map=new HashMap<> ();
    public static List<ColumnUserObject> getColumnUserObjects ( String tableName ){
        if(map.containsKey(tableName)==false){
            List<ColumnUserObject> objectList=new ArrayList<> ();
            map.put(tableName,objectList);
        }
        return map.get(tableName);
    }
}
