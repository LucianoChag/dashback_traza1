package Back_Articulo_Manufacturado.demo.domain.dto.Domicilio;


import Back_Articulo_Manufacturado.demo.domain.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DomicilioShortDto extends BaseDto {
    private String calle;
}
