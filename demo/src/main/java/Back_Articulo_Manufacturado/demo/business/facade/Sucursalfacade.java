package Back_Articulo_Manufacturado.demo.business.facade;


import Back_Articulo_Manufacturado.demo.business.facade.Base.BaseFacade;
import Back_Articulo_Manufacturado.demo.domain.dto.Categoria.CategoriaDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Sucursal.SucursalCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Sucursal.SucursalDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Sucursal.SucursalEditDto;

import java.util.List;

public interface Sucursalfacade extends BaseFacade<SucursalDto, SucursalCreateDto, SucursalEditDto, Long> {
    public List<CategoriaDto> findAllCategoriasByIdSucursal(Long idSucursal);
}
