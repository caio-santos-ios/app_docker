package br.com.app_docker.app_docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    
    @GetMapping("/helloWord")
    public String read() {
        return "Hello word.";
    }
}
