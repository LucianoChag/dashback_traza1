package Back_Articulo_Manufacturado.demo.domain.dto.ArticuloManufacturado;

import Back_Articulo_Manufacturado.demo.domain.dto.BaseDto;
import Back_Articulo_Manufacturado.demo.domain.dto.ArticuloManufacturadoDetalle.ArticuloManufacturadoDetalleDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Imagen.ImagenDto;
import Back_Articulo_Manufacturado.demo.domain.dto.UnidadMedida.UnidadMedidaDto;
import lombok.*;

import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ArticuloManufacturadoDto extends BaseDto {
    private String denominacion;
    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private Double precioVenta;
    private String preparacion;
    private UnidadMedidaDto unidadMedida;
    private Set<ArticuloManufacturadoDetalleDto> articuloManufacturadoDetalles;
    private Set<ImagenDto> imagenes;
}
