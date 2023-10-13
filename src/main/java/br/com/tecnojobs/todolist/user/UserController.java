package br.com.tecnojobs.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    /**
     * String (texto)
     * Integar (int) numeros inteiros
     * Double (double) números 0,0000
     * Float (float) Números  0.000
     * char ( A C )
     * Date (Data)
     * void
     * 
     * body
     */
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel) {
        System.out.println(userModel.getUsername());

    }
     
}
