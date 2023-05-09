package suasaude.banco;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class UsuarioEntity {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String username;
    private String password;
    private String nome;

    public UsuarioEntity(){}

    @Ignore
    public UsuarioEntity(String username, String password, String nome) {
        this.username = username;
        this.password = password;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
