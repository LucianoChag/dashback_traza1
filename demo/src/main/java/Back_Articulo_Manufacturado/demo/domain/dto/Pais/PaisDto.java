package Back_Articulo_Manufacturado.demo.domain.dto.Pais;


import Back_Articulo_Manufacturado.demo.domain.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PaisDto extends BaseDto {
    private Long id;
    private String nombre;
}
