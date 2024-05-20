package Back_Articulo_Manufacturado.demo.business.service;

import Back_Articulo_Manufacturado.demo.business.service.Base.BaseService;
import Back_Articulo_Manufacturado.demo.domain.entities.Provincia;
import java.util.List;

public interface ProvinciaService extends BaseService<Provincia, Long> {
    List<Provincia> findByPaisId(Long id);
}
