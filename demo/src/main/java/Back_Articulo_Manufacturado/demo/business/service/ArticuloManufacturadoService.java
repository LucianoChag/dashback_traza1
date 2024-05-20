package Back_Articulo_Manufacturado.demo.business.service;

import Back_Articulo_Manufacturado.demo.business.service.Base.BaseService;
import Back_Articulo_Manufacturado.demo.domain.entities.ArticuloManufacturado;
import Back_Articulo_Manufacturado.demo.domain.entities.ArticuloManufacturadoDetalle;
import Back_Articulo_Manufacturado.demo.domain.entities.ImagenArticulo;

import java.util.List;

public interface ArticuloManufacturadoService extends BaseService<ArticuloManufacturado, Long> {
    List<ArticuloManufacturadoDetalle> findAllDetalles(Long id);
    public void addImagen(ImagenArticulo imagen, Long id);
}
