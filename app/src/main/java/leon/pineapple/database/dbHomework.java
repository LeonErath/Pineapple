package leon.pineapple.database;

import android.util.Log;

import io.realm.Realm;
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

    public dbHomework(Realm realm) {
        //Auto Increment ID
        int primaryKeyValue;
        if (realm.where(dbHomework.class).max("id") != null) {
            primaryKeyValue = realm.where(dbHomework.class).max("id").intValue() + 1;
        } else {
            primaryKeyValue = 0;
        }
        homeworkID = primaryKeyValue;
        Log.d("dbHomework", "New Homework ID created: " + homeworkID);


    }
}
