package leon.pineapple.database;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Leon Erath on 18.09.2016.
 */
public class dbLesson extends RealmObject {
    private int blockNumber;
    @PrimaryKey
    private int serverID;

}
