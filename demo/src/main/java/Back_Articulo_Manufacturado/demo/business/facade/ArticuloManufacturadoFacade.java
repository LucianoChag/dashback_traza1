package Back_Articulo_Manufacturado.demo.business.facade;



import Back_Articulo_Manufacturado.demo.business.facade.Base.BaseFacade;
import Back_Articulo_Manufacturado.demo.domain.dto.ArticuloManufacturado.ArticuloManufacturadoCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.ArticuloManufacturado.ArticuloManufacturadoDto;
import Back_Articulo_Manufacturado.demo.domain.dto.ArticuloManufacturadoDetalle.ArticuloManufacturadoDetalleDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Imagen.ImagenCreate;

import java.util.List;

public interface ArticuloManufacturadoFacade extends BaseFacade<ArticuloManufacturadoDto, ArticuloManufacturadoCreateDto, ArticuloManufacturadoCreateDto, Long> {
    List<ArticuloManufacturadoDetalleDto> findAllDetalles(Long id);
    public void addImagen(ImagenCreate imagen, Long id);
}
