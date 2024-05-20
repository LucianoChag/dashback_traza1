package Back_Articulo_Manufacturado.demo.business.service;

import Back_Articulo_Manufacturado.demo.business.service.Base.BaseService;
import Back_Articulo_Manufacturado.demo.domain.entities.Categoria;
import Back_Articulo_Manufacturado.demo.domain.entities.Sucursal;

import java.util.List;

public interface SucursalService  extends BaseService<Sucursal, Long> {
    public List<Categoria> findCategoriasBySucursalId(Long idSucursal);
}

