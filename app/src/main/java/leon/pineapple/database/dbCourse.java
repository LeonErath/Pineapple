package leon.pineapple.database;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Leon Erath on 18.09.2016.
 */
public class dbCourse extends RealmObject {
    private boolean defaultWrittenExam;
    private String fullName;
    private String lastChange;
    private boolean selected;
    @PrimaryKey
    private int serverID;
    private String stringID;
    private boolean writtenExam;
}
