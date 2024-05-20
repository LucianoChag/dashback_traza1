package Back_Articulo_Manufacturado.demo.domain.dto.ArticuloManufacturado;


import Back_Articulo_Manufacturado.demo.domain.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
//dto para crear
public class ArticuloManufacturadoCreateDto extends ArticuloManufacturadoDto {
    private String denominacion;
    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private Double precioVenta;
    private String preparacion;
    private Long idUnidadMedida;
    private Set<Long> idsArticuloManufacturadoDetalles;
}
