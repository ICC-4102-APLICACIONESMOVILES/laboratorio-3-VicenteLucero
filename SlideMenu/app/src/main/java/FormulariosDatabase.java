import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by Gamma on 4/3/2018.
 */

@Database(entities = {Formularios.class}, version = 1, exportSchema = false)
public abstract class FormulariosDatabase extends RoomDatabase {
    public abstract DaoAccess daoAccess() ;
}
