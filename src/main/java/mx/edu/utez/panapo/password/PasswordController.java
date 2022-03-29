package mx.edu.utez.panapo.password;

import mx.edu.utez.panapo.utils.EmailService;
import mx.edu.utez.panapo.utils.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = {"*"})
public class PasswordController {
    @Autowired
    EmailService emailService;

    @PostMapping("/")
    public ResponseEntity<Message> sendMailContact(@RequestBody EmailDTO emailDTO,
                                                   BindingResult result){
        if(result.hasErrors())
            return new ResponseEntity<>(new Message("Verifique los datos", true, null),
                    HttpStatus.BAD_REQUEST);
        if(emailService.sendEmail(emailDTO)){
            return  new ResponseEntity<>(new Message("Correo enviado correctamente", false, emailDTO),
                    HttpStatus.OK);
        }else{
            return new ResponseEntity<>(new Message("Error al enviar el correo", true, emailDTO),
                    HttpStatus.BAD_REQUEST);
        }
    }
}
