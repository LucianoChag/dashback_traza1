package Back_Articulo_Manufacturado.demo.repositories;


import Back_Articulo_Manufacturado.demo.domain.entities.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends BaseRepository<Cliente,Long> {
}
