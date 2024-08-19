package dio.web_api.controller;


import dio.web_api.model.Usuario;
import dio.web_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {
    //Vai me direcionar para outra classe onde estão as regras de negócios;
    @Autowired
    private UserRepository repository;
    @GetMapping() //para acessar só colocar "/users após o localhost8080 na url"
    public List<Usuario>getUsers(){
        return repository.findAll();
    }
    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return repository.findByUserName(username);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }
    @PostMapping("/{id}")
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
}
