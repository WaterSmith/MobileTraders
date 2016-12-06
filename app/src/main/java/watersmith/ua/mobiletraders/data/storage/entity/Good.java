package watersmith.ua.mobiletraders.data.storage.entity;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.ToOne;

/**
 * Created by vodakov.s on 17.10.2016.
 */
@Entity(nameInDb = "GOODS", active = true)
public class Good{
    @Id(autoincrement = false)
    long id;

    //@Unique
    @NotNull
    long databaseId;

    @ToOne(joinProperty = "id")
    Good parent;

    String name;
    String indexName;
    boolean isFolder;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated(hash = 1249866486)
    private transient GoodDao myDao;

    @Generated(hash = 1293412156)
    private transient Long parent__resolvedKey;

    @Generated(hash = 353400637)
    public Good(long id, long databaseId, String name, String indexName, boolean isFolder) {
        this.id = id;
        this.databaseId = databaseId;
        this.name = name;
        this.indexName = indexName;
        this.isFolder = isFolder;
    }

    @Generated(hash = 2016981037)
    public Good() {
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
        return name;
    }

    public void setName(String name) {
        this.name = name;
        setIndexName();
    }

    public String getIndexName() {
        return indexName;
    }

    private void setIndexName() {
        this.indexName = name.toUpperCase();
    }

    public boolean isFolder() {
        return isFolder;
    }

    public void setFolder(boolean folder) {
        isFolder = folder;
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

    public boolean getIsFolder() {
        return this.isFolder;
    }

    public void setIsFolder(boolean isFolder) {
        this.isFolder = isFolder;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /** To-one relationship, resolved on first access. */
    @Generated(hash = 730681845)
    public Good getParent() {
        long __key = this.id;
        if (parent__resolvedKey == null || !parent__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            GoodDao targetDao = daoSession.getGoodDao();
            Good parentNew = targetDao.load(__key);
            synchronized (this) {
                parent = parentNew;
                parent__resolvedKey = __key;
            }
        }
        return parent;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 542933560)
    public void setParent(@NotNull Good parent) {
        if (parent == null) {
            throw new DaoException(
                    "To-one property 'id' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.parent = parent;
            id = parent.getId();
            parent__resolvedKey = id;
        }
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1127442251)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getGoodDao() : null;
    }

}
