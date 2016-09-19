package leon.pineapple.database;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Leon Erath on 18.09.2016.
 */
public class dbTeacher extends RealmObject {
    private String abbreviation;
    private String email;
    private String firstName;
    private String lastChange;
    private String lastName;
    @PrimaryKey
    private int serverID;
    private int sex;
    private String title;
    private String writtenName;
}
