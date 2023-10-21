package jhon.motos.api.controller;

import jhon.motos.api.model.Usuario;
import jhon.motos.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    private UserRepository repository;
    @GetMapping()
    public List<Usuario> getUser(){
        return repository.findAll();
    }
    public Usuario getOne(@PathVariable("/{username}") String username){
        return  repository.findByUsername(username);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }
    @PostMapping()
    public void postYser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }


}
