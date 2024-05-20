package Back_Articulo_Manufacturado.demo.repositories;


import Back_Articulo_Manufacturado.demo.domain.entities.Localidad;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocalidadRepository extends BaseRepository<Localidad,Long>{
    List<Localidad> findByProvinciaId(Long id);
}
