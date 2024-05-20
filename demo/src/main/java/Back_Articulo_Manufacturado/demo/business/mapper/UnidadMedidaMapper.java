package Back_Articulo_Manufacturado.demo.business.mapper;


import Back_Articulo_Manufacturado.demo.domain.dto.UnidadMedida.UnidadMedidaCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.UnidadMedida.UnidadMedidaDto;
import Back_Articulo_Manufacturado.demo.domain.entities.UnidadMedida;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UnidadMedidaMapper extends BaseMapper<UnidadMedida, UnidadMedidaDto, UnidadMedidaCreateDto, UnidadMedidaCreateDto> {
}
