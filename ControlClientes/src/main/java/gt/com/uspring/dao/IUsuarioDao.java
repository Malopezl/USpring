package gt.com.uspring.dao;

import gt.com.uspring.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author malopezl
 */
public interface IUsuarioDao extends JpaRepository<Usuario, Long> {

    Usuario findByUsername(String username);

}
