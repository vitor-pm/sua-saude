package suasaude.banco;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {UsuarioEntity.class}, version = 1, exportSchema = false)
public abstract class DatabaseConf extends RoomDatabase {
    public abstract Dao getLoginDao();
}
