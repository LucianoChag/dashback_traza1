package Back_Articulo_Manufacturado.demo.business.mapper;


import Back_Articulo_Manufacturado.demo.business.service.SucursalService;
import Back_Articulo_Manufacturado.demo.domain.dto.ArticuloManufacturado.ArticuloManufacturadoDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Categoria.CategoriaCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Categoria.CategoriaDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Categoria.CategoriaEditDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Insumo.ArticuloInsumoDto;
import Back_Articulo_Manufacturado.demo.domain.entities.ArticuloInsumo;
import Back_Articulo_Manufacturado.demo.domain.entities.ArticuloManufacturado;
import Back_Articulo_Manufacturado.demo.domain.entities.Categoria;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Set;
import java.util.stream.Collectors;

// En este caso, se utiliza el componente "spring" para la inyección de dependencias y se especifican
// las clases de servicio y mappers que utiliza.
@Mapper(componentModel = "spring", uses = {SucursalService.class, ArticuloInsumoMapper.class, ArticuloManufacturadoMapper.class, SucursalMapper.class})
public interface CategoriaMapper extends BaseMapper<Categoria, CategoriaDto,CategoriaCreateDto, CategoriaEditDto> {
    // Esta es una instancia estática de la interfaz, que se utiliza para obtener una instancia del Mapper.
    CategoriaMapper INSTANCE = Mappers.getMapper(CategoriaMapper.class);

    // Este método define la transformación de un CategoriaCreateDto a una entidad Categoria.
    @Mapping(target = "sucursales", source = "idSucursales",qualifiedByName = "getById")
    Categoria toEntityCreate(CategoriaCreateDto source);


    @Mapping(target = "insumos", expression = "java(filterArticulosInsumo(source))")
    @Mapping(target = "articulosManufacturados", expression = "java(filterArticulosManufacturados(source))")
    CategoriaDto toDTO(Categoria source);

    // Este método filtra y mapea los artículos de insumo de la categoría
    default Set<ArticuloInsumoDto> filterArticulosInsumo(Categoria source) {
        return source.getArticulos().stream()
                .filter(articulo -> articulo instanceof ArticuloInsumo)
                .map(articulo -> ArticuloInsumoMapper.INSTANCE.toDTO((ArticuloInsumo) articulo))
                .collect(Collectors.toSet());
    }

    // Este método filtra y mapea los artículos manufacturados de la categoría.
    default Set<ArticuloManufacturadoDto> filterArticulosManufacturados(Categoria source) {
        return source.getArticulos().stream()
                .filter(articulo -> articulo instanceof ArticuloManufacturado)
                .map(articulo -> ArticuloManufacturadoMapper.INSTANCE.toDTO((ArticuloManufacturado) articulo))
                .collect(Collectors.toSet());
    }

}
