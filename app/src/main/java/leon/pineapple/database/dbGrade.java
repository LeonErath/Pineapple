package leon.pineapple.database;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Leon Erath on 18.09.2016.
 */
public class dbGrade extends RealmObject {
    private String classSuffix;
    private int gradeID;
    private String lastChange;
    private String name;
    @PrimaryKey
    private int serverID;
}
