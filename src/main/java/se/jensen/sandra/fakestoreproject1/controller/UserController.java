package se.jensen.sandra.fakestoreproject1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import se.jensen.sandra.fakestoreproject1.model.User;
import se.jensen.sandra.fakestoreproject1.repository.UserRepository;

@Controller
public class UserController {

    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/register")
    public String showRegisterPage(Model model) {

        model.addAttribute("user", new User());

        return "register";
    }

    @PostMapping("/register")
    public String register(User user) {

        repository.save(user);

        return "redirect:/";
    }

    @GetMapping("/users")
    public String showUsers(Model model) {

        model.addAttribute("users",
                repository.findAll());

        return "users";
    }

    @GetMapping("/login")
    public String showLoginPage() {

        return "login";
    }

}