package leon.pineapple.database;

import io.realm.RealmObject;

/**
 * Created by Leon Erath on 18.09.2016.
 */
public class dbLessonTime extends RealmObject {
    private int day;
    private String end;
    private int index;
    private String lastChange;
    private String start;
    private int timetableRhythm;

}
