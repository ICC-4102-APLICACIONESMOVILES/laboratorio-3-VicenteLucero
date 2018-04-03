import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by Gamma on 4/3/2018.
 */

@Dao
public interface DaoAccess {

    @Insert
    void insertOnlySingleFormulario (Formularios formularios);
    @Insert
    void insertMultipleFormularios (List<Formularios> moviesList);
    @Query("SELECT * FROM Formularios WHERE Nombre = :Nombre")
    Formularios fetchOneFormulariobyNombre (String Nombre);
    @Update
    void updateFormularios (Formularios formularios);
    @Delete
    void deleteFormularios (Formularios formularios);
}

