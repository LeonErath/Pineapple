package leon.pineapple.database;

import io.realm.RealmObject;

/**
 * Created by Leon Erath on 18.09.2016.
 */
public class dbExam extends RealmObject {
    private double average;
    private String date;
    private String end;
    private boolean indexInSchoolYear;
    private String name;
    private String note;
    private String start;
}
