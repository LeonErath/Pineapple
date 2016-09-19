package leon.pineapple.database;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Leon Erath on 18.09.2016.
 */
public class dbUser extends RealmObject {
    private int appSetup;
    private String email;
    private String firstName;
    private String lastChange;
    private String lastConnectionDate;
    private String lastName;
    private boolean loggedIn;
    private String loginDate;
    private int quizPoints;
    @PrimaryKey
    private int serverID;
    private int sex;
    private String username;

}
