package Back_Articulo_Manufacturado.demo.business.mapper;


import Back_Articulo_Manufacturado.demo.business.service.ArticuloInsumoService;
import Back_Articulo_Manufacturado.demo.domain.dto.ArticuloManufacturadoDetalle.ArticuloManufacturadoDetalleCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.ArticuloManufacturadoDetalle.ArticuloManufacturadoDetalleDto;
import Back_Articulo_Manufacturado.demo.domain.entities.ArticuloManufacturadoDetalle;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
// En este caso, se utiliza el componente "spring" para la inyección de dependencias y se especifica
// la clase de servicio que utiliza.
@Mapper(componentModel = "spring", uses = {ArticuloInsumoService.class})
public interface ArticuloManufacturadoDetalleMapper extends BaseMapper<ArticuloManufacturadoDetalle, ArticuloManufacturadoDetalleDto,ArticuloManufacturadoDetalleCreateDto,ArticuloManufacturadoDetalleCreateDto>{
    // Utiliza la anotación @Mapping para especificar el mapeo entre los campos del DTO y la entidad,
    // y utiliza el servicio ArticuloInsumoService para obtener el artículo de insumo a partir del ID.
    @Mapping(target = "articuloInsumo", source = "idArticuloInsumo", qualifiedByName = "getById")
    ArticuloManufacturadoDetalle toEntityCreate(ArticuloManufacturadoDetalleCreateDto source);
}
