import java.util.HashMap;
import java.util.Map;

public class RegistroDeUsuarios {
    private Map<String, String> usuarios;

    public RegistroDeUsuarios() {
        usuarios = new HashMap<>();
    }

    public void registrarUsuario(String id, String nome) {
        usuarios.put(id, nome);
        System.out.println("Usuário registrado: " + nome);
    }

    public String buscarUsuario(String id) {
        return usuarios.get(id);
    }
}
