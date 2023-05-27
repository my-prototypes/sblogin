package br.es.ufpi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.es.ufpi.entity.Usuario;
import br.es.ufpi.service.UsuarioService;

@Controller
public class LoginController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/login")
    public String exibirFormularioLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        //Usuario usuario = usuarioService.findByNomeUsuario(username);
        if (username.equals("admin")){
        //if (usuario != null && usuario.getSenha().equals(password)) {
            //model.addAttribute("usuario", usuario);
            return "dashboard";
        } else {
            model.addAttribute("error", "Credenciais inválidas");
            return "login";
        }
    }
}