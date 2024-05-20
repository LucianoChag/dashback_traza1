package Back_Articulo_Manufacturado.demo.business.mapper;


import Back_Articulo_Manufacturado.demo.business.service.LocalidadService;
import Back_Articulo_Manufacturado.demo.domain.dto.Domicilio.DomicilioCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Domicilio.DomicilioDto;
import Back_Articulo_Manufacturado.demo.domain.entities.Domicilio;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {LocalidadService.class})
public interface DomicilioMapper extends BaseMapper<Domicilio, DomicilioDto, DomicilioCreateDto,DomicilioCreateDto> {
    @Mapping(target = "localidad", source = "idLocalidad",qualifiedByName = "getById")
    Domicilio toEntityCreate(DomicilioCreateDto source);
}
