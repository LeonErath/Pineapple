package leon.pineapple.database;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Leon Erath on 18.09.2016.
 */
public class dbReplacementLesson extends RealmObject {
    private String date;
    private String newLessonDate;
    private String note;
    @PrimaryKey
    private int serverID;
    private int type;
}
