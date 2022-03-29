package mx.edu.utez.panapo.user.controller;


import mx.edu.utez.panapo.user.model.User;
import mx.edu.utez.panapo.utils.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = {"*"})
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping("/")
    public ResponseEntity<Message> getAll(){
        return  userService.findAll();
    }

    @GetMapping("/{id}")
    public  ResponseEntity<Message> getById(@PathVariable("id") long id){
        return  userService.findById(id);
    }

    @PostMapping("/")
    public  ResponseEntity<Message> saveUsersave(@RequestBody UserDTO userDTO){
        return  userService.save(new User(passwordEncoder.encode(userDTO.getPassword()),userDTO.getPerson(),userDTO.getAuthorities(),userDTO.getStatus()));
    }

    @PutMapping("/")
    public ResponseEntity<Message> update( @RequestBody UserDTO userDTO){
        return userService.update(new User(userDTO.getPassword(),userDTO.getPerson(),userDTO.getAuthorities(),userDTO.getStatus()));
    }


}
