package Back_Articulo_Manufacturado.demo.domain.dto.Insumo;


import Back_Articulo_Manufacturado.demo.domain.dto.BaseDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Imagen.ImagenDto;
import Back_Articulo_Manufacturado.demo.domain.dto.UnidadMedida.UnidadMedidaDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ArticuloInsumoDto extends BaseDto {
    private String denominacion;
    private Double precioVenta;
    private UnidadMedidaDto unidadMedida;
    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private Boolean esParaElaborar;
    private Set<ImagenDto> imagenes;
}
