package Back_Articulo_Manufacturado.demo.business.mapper;


import Back_Articulo_Manufacturado.demo.domain.dto.Pais.PaisCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Pais.PaisDto;
import Back_Articulo_Manufacturado.demo.domain.entities.Pais;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaisMapper extends BaseMapper<Pais, PaisDto, PaisCreateDto,PaisCreateDto>{
}
