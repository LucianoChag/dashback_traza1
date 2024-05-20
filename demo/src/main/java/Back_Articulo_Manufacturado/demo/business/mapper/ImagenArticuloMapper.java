package Back_Articulo_Manufacturado.demo.business.mapper;


import Back_Articulo_Manufacturado.demo.domain.dto.Imagen.ImagenCreate;
import Back_Articulo_Manufacturado.demo.domain.dto.Imagen.ImagenDto;
import Back_Articulo_Manufacturado.demo.domain.entities.ImagenArticulo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ImagenArticuloMapper extends BaseMapper<ImagenArticulo, ImagenDto, ImagenCreate, ImagenDto> {

    @Mapping(source = "url", target = "url")
    public ImagenArticulo toEntityCreate(ImagenCreate source);
}
