package Back_Articulo_Manufacturado.demo.repositories;



import Back_Articulo_Manufacturado.demo.domain.entities.Articulo;
import Back_Articulo_Manufacturado.demo.domain.entities.UnidadMedida;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticuloRepository  extends BaseRepository<Articulo, Long> {
    // Método para buscar artículos por unidad de medida.
    List<Articulo> findByUnidadMedida(UnidadMedida unidadMedida);
}
