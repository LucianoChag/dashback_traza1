package Back_Articulo_Manufacturado.demo.business.mapper;


import Back_Articulo_Manufacturado.demo.business.service.ArticuloManufacturadoDetalleService;
import Back_Articulo_Manufacturado.demo.business.service.UnidadMedidaService;
import Back_Articulo_Manufacturado.demo.domain.dto.ArticuloManufacturado.ArticuloManufacturadoCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.ArticuloManufacturado.ArticuloManufacturadoDto;
import Back_Articulo_Manufacturado.demo.domain.entities.ArticuloManufacturado;
import Back_Articulo_Manufacturado.demo.domain.entities.ArticuloManufacturadoDetalle;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
// En este caso, se utiliza el componente "spring" para la inyección de dependencias y se especifican
// las clases de servicio y mappers que utiliza
@Mapper(componentModel = "spring", uses = {ArticuloManufacturadoDetalleService.class, UnidadMedidaService.class, ImagenArticuloMapper.class})
public interface ArticuloManufacturadoMapper extends BaseMapper<ArticuloManufacturado, ArticuloManufacturadoDto, ArticuloManufacturadoCreateDto,ArticuloManufacturadoCreateDto> {

    // Esta es una instancia estática de la interfaz, que se utiliza para obtener una instancia del Mapper.
    ArticuloManufacturadoMapper INSTANCE = Mappers.getMapper(ArticuloManufacturadoMapper.class);

    // Este método define la transformación de un ArticuloManufacturadoCreateDto a una entidad ArticuloManufacturado.
    // Utiliza la anotación @Mappings para especificar múltiples mapeos entre los campos del DTO y la entidad.
    @Mappings({
        @Mapping(source = "idsArticuloManufacturadoDetalles", target = "articuloManufacturadoDetalles", qualifiedByName = "getById"),
        @Mapping(target = "unidadMedida", source = "idUnidadMedida",qualifiedByName = "getById")
    })
    // Este método define la transformación de un ArticuloManufacturadoCreateDto a una entidad ArticuloManufacturado.
    public ArticuloManufacturado toEntityCreate(ArticuloManufacturadoCreateDto source);
}
