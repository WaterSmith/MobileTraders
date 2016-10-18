package watersmith.ua.mobiletraders.data.storage.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by vodakov.s on 17.10.2016.
 */
@Entity(nameInDb = "GOODS", active = true)
public class Good {
    @Id(autoincrement = true)
    long id;

    long databaseId;

}
