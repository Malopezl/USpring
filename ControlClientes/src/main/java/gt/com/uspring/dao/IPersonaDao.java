package gt.com.uspring.dao;

import gt.com.uspring.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author malopez
 */
public interface IPersonaDao extends JpaRepository<Persona, Long> {

}
