package Back_Articulo_Manufacturado.demo.repositories;


import Back_Articulo_Manufacturado.demo.domain.entities.Empleado;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends BaseRepository<Empleado,Long> {
}
