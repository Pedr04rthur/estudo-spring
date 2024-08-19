package dio.web_api.repository;


import dio.web_api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository //Determina que essa classe vai ser um componente
public class UserRepository {
    public void save(Usuario usuario){
        if(usuario.getId()==null){
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        }
        else{
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        }
        System.out.println(usuario);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário"));
        System.out.println(id);

    }

    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("pedro","password"));
        usuarios.add(new Usuario("arthur","password"));
        return usuarios;
    }

    public Usuario findBtId(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuario"));
        return new Usuario("pedro","password");


    }

    public Usuario findByUserName(String username){
        System.out.println(String.format("FIND/username - Recebendo o username: %s para encontrar o usuário"));
        return new Usuario("pedro","password");
    }



}
