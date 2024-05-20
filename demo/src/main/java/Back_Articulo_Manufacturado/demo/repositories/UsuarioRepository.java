package Back_Articulo_Manufacturado.demo.repositories;


import Back_Articulo_Manufacturado.demo.domain.entities.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends BaseRepository<Usuario,Long> {
}
