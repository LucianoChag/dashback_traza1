package Back_Articulo_Manufacturado.demo.domain.dto.Categoria;


import Back_Articulo_Manufacturado.demo.domain.dto.ArticuloManufacturado.ArticuloManufacturadoDto;
import Back_Articulo_Manufacturado.demo.domain.dto.BaseDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Insumo.ArticuloInsumoDto;

import Back_Articulo_Manufacturado.demo.domain.dto.Sucursal.SucursalShortShort;

import lombok.*;


import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaDto extends BaseDto {
    private String denominacion;

    private boolean esInsumo;

    private Set<SucursalShortShort> sucursales;

    private Set<SubCategoriaDto> subCategorias;

    private Set<ArticuloInsumoDto> insumos;

    private Set<ArticuloManufacturadoDto> articulosManufacturados;

}
