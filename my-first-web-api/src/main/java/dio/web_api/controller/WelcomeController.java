package dio.web_api.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//Para que esse componente tenha características de um componente REST preciso denominar o @RestController
@RestController
//É UM CURSO HTTP DO TIPO GET
public class WelcomeController {
    @GetMapping
    public String welcome(){
        return "Welcome to my spring booy web API";
    }
}
