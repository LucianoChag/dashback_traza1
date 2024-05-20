package Back_Articulo_Manufacturado.demo.domain.dto.ArticuloManufacturadoDetalle;


import Back_Articulo_Manufacturado.demo.domain.dto.BaseDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Insumo.ArticuloInsumoDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ArticuloManufacturadoDetalleDto extends BaseDto {
    private Integer cantidad;
    private ArticuloInsumoDto articuloInsumo;
}
