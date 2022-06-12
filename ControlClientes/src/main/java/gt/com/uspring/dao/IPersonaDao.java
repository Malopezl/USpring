package gt.com.uspring.dao;

import gt.com.uspring.domain.Persona;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author malopez
 */
public interface IPersonaDao extends CrudRepository<Persona, Long> {

}
