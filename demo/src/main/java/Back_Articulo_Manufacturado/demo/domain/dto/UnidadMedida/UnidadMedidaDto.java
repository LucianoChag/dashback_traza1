package Back_Articulo_Manufacturado.demo.domain.dto.UnidadMedida;


import Back_Articulo_Manufacturado.demo.domain.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UnidadMedidaDto extends BaseDto {
    private String denominacion;
}
