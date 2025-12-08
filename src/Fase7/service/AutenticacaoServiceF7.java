package Fase7.service;

import Fase7.model.usuario.UsuarioF7;
import Fase7.repository.BancoDeDadosF7;

import java.util.Optional;

public class AutenticacaoServiceF7 {
    public UsuarioF7 login(String login, String senha) {
        Optional<UsuarioF7> usuarioEncontrado = BancoDeDadosF7.getUsuarios().stream()
                .filter(u -> u.getLogin().equals(login))
                .findFirst();

        if (usuarioEncontrado.isPresent()) {
            UsuarioF7 u = usuarioEncontrado.get();
            if (u.validarSenha(senha)) {
                return u;
            }
        }
        return null;
    }
}
