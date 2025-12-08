package FaseFinal.service;

import FaseFinal.model.usuario.Usuario;
import FaseFinal.repository.BancoDeDados;

import java.util.Optional;

public class AutenticacaoService {

    public Usuario login(String login, String senha) {
        Optional<Usuario> usuarioEncontrado = BancoDeDados.getUsuarios().stream()
                .filter(u -> u.getLogin().equals(login))
                .findFirst();

        if (usuarioEncontrado.isPresent()) {
            Usuario u = usuarioEncontrado.get();
            if (u.validarSenha(senha)) {
                return u;
            }
        }
        return null;
    }
}