package Back_Articulo_Manufacturado.demo.domain.dto.ArticuloManufacturadoDetalle;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArticuloManufacturadoDetalleCreateDto {
    private Integer cantidad;
    private Long idArticuloInsumo;
}
