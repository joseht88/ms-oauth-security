package upeu.ms.app.oauth.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import upeu.jbr.app.usuarios.commons.entity.Usuario;

@FeignClient(name="servicio-usuario")
public interface UsuarioFeignClient {

	@GetMapping("/usuario/search/buscar-username")
	public Usuario findByUsername(@RequestParam String username);
	
}
