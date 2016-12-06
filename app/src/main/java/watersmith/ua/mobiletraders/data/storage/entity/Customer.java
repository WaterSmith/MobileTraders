package watersmith.ua.mobiletraders.data.storage.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;

/**
 * Created by vodakov.s on 06.12.2016.
 */

@Entity(nameInDb = "CUSTOMERS", active = true)
public class Customer {
    @Id(autoincrement = false)
    long id;

    @NotNull
    long databaseId;

    String name;
    String indexName;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 1697251196)
    private transient CustomerDao myDao;
    @Generated(hash = 1431341558)
    public Customer(long id, long databaseId, String name, String indexName) {
        this.id = id;
        this.databaseId = databaseId;
        this.name = name;
        this.indexName = indexName;
    }
    @Generated(hash = 60841032)
    public Customer() {
    }
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getDatabaseId() {
        return this.databaseId;
    }
    public void setDatabaseId(long databaseId) {
        this.databaseId = databaseId;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIndexName() {
        return this.indexName;
    }
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }
    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }
    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }
    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }
    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 462117449)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getCustomerDao() : null;
    }
    
}
