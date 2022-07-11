package upeu.ms.app.oauth.service;

import upeu.jbr.app.usuarios.commons.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
