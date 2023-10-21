package jhon.motos.api.repository;

import jhon.motos.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(Usuario usuario){
        if(usuario.getId()==null)
            System.out.println("SAVE - Recebendo a moto na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo a moto na camada de repositório");

        System.out.println(usuario);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> findAll(){
        System.out.println("LIST - Listando as motos do sistema");
        List<Usuario> motos = new ArrayList<>();
        motos.add(new Usuario("Jhon","CBR500", "Branca", 2015));
        motos.add(new Usuario("Luciane","Burgman400", "Azul", 2005));
        return motos;
    }
    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("Jhon","CBR500", "Branca", 2015);
    }
    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o usernamae: %s para localizar um usuário", username));
        return new Usuario("Jhon","CBR500", "Branca", 2015);
    }
}
