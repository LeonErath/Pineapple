package leon.pineapple.database;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Leon Erath on 18.09.2016.
 */
public class dbBreakTime extends RealmObject {
    private int day;
    private String end;
    private boolean everyday;
    private String lastChange;
    private String name;
    @PrimaryKey
    private int serverID;
    private String start;
    private int timetableRhythm;

}
