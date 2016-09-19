package leon.pineapple.database;


import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Leon Erath on 18.09.2016.
 */
public class dbRoom extends RealmObject {
    private boolean beamer;
    private int capacity;
    private boolean computer;
    private String floor;
    private String lastChange;
    private String name;
    private String note;
    @PrimaryKey
    private int serverID;
    private boolean speaker;
    private String use;

}
