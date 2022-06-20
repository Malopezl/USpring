package gt.com.uspring.servicio;

import gt.com.uspring.domain.Persona;
import java.util.List;

/**
 *
 * @author malopez
 */
public interface PersonaService {

    public List<Persona> listarPersonas();

    public void guardar(Persona persona);

    public void eliminar(Persona persona);

    public Persona encontrarPersona(Persona persona);

}
