package Back_Articulo_Manufacturado.demo.domain.dto.PedidoDto;


import Back_Articulo_Manufacturado.demo.domain.dto.BaseDto;
import Back_Articulo_Manufacturado.demo.domain.enums.Estado;
import Back_Articulo_Manufacturado.demo.domain.enums.FormaPago;
import Back_Articulo_Manufacturado.demo.domain.enums.TipoEnvio;
import Back_Articulo_Manufacturado.demo.domain.dto.Sucursal.ShortSucursal;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PedidoDto extends BaseDto {

    @Schema(type = "string", format = "time", pattern = "HH:mm:ss", description = "Horario de apertura en formato HH:mm:ss")
    private LocalTime horaEstimadaFinalizacion;
    private Double total;
    private Double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;

    private ShortSucursal sucursal;
}
