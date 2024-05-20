package Back_Articulo_Manufacturado.demo.repositories;

import Back_Articulo_Manufacturado.demo.domain.entities.Persona;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {
}
