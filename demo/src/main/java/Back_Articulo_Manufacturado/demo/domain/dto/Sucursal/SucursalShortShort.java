package Back_Articulo_Manufacturado.demo.domain.dto.Sucursal;


import Back_Articulo_Manufacturado.demo.domain.dto.BaseDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Domicilio.DomicilioShortDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SucursalShortShort extends BaseDto {
    private String nombre;
    private DomicilioShortDto domicilio;
}
