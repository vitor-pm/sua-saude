package suasaude.banco;

import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@androidx.room.Dao
public interface Dao {

    @Insert
    void salvar(UsuarioEntity usuario);

    @Query("SELECT * from UsuarioEntity Where username = :username and password = :password")
    UsuarioEntity login(String username, String password);
}