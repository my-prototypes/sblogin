package br.es.ufpi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import br.es.ufpi.entity.Usuario;
import br.es.ufpi.repository.UsuarioRepository;

@Controller
public class UsuarioController {
  @Autowired
  private UsuarioRepository usuarioRepository;

  @GetMapping("/")
  public String ola(Model model){
    return "index";
  }

  @GetMapping("/novo")
  public String exibirFormulario(Model model) {
    model.addAttribute("usuario", new Usuario());
    return "formulario";
  }

  @PostMapping("/salvar")
  public String salvarUsuario(Usuario usuario) {
    usuarioRepository.save(usuario);
    return "redirect:/";
  }

  @GetMapping("/listar")
  public String listarUsuarios(Model model) {
    model.addAttribute("usuarios", usuarioRepository.findAll());
    return "listagem";
  }

  @GetMapping("/dashboard")
  public String dashboard(Model model){
    return "dashboard";
  }
}