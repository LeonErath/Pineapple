package leon.pineapple.database;

import io.realm.RealmObject;
import io.realm.annotations.Index;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

/**
 * Created by Leon Erath on 18.09.2016.
 */
public class dbSchool extends RealmObject {

    private String abbreviation;
    private String apiURL;
    private String appServerVersion;
    private String city;
    private String country;
    private String gtcUrl;
    private String loginMessage;
    private String logo;
    private String modifiedDate;
    private String name;
    private int schoolType;
    private String schoolWebsiteURL;
    @PrimaryKey
    private int severID;
    @Index
    private String state;
    private String street;
    private String wordpressApiURL;
    private String zipCode;
}
