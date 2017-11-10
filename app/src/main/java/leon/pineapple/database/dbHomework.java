package leon.pineapple.database;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Leon Erath on 18.09.2016.
 */
public class dbHomework extends RealmObject {
    private String completionDate;
    private boolean done;
    private String notes;
    private String task;
    @PrimaryKey
    private int homeworkID;



}
