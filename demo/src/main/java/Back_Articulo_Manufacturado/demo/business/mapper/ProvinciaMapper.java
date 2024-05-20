package Back_Articulo_Manufacturado.demo.business.mapper;


import Back_Articulo_Manufacturado.demo.business.service.PaisService;
import Back_Articulo_Manufacturado.demo.domain.dto.Provincia.ProvinciaCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Provincia.ProvinciaDto;
import Back_Articulo_Manufacturado.demo.domain.entities.Provincia;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {PaisService.class})
public interface ProvinciaMapper extends BaseMapper<Provincia,ProvinciaDto, ProvinciaCreateDto,ProvinciaCreateDto>{
    @Mapping(target = "pais", source = "idPais",qualifiedByName = "getById")
    Provincia toEntityCreate(ProvinciaCreateDto source);
}
