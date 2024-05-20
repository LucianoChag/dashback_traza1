package Back_Articulo_Manufacturado.demo.business.mapper;


import Back_Articulo_Manufacturado.demo.business.service.ProvinciaService;
import Back_Articulo_Manufacturado.demo.domain.dto.Localidad.LocalidadCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Localidad.LocalidadDto;
import Back_Articulo_Manufacturado.demo.domain.entities.Localidad;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {ProvinciaService.class})
public interface LocalidadMapper extends BaseMapper<Localidad, LocalidadDto, LocalidadCreateDto,LocalidadCreateDto>{
    @Mapping(target = "provincia", source = "idProvincia",qualifiedByName = "getById")
    Localidad toEntityCreate(LocalidadCreateDto source);
}
