package Back_Articulo_Manufacturado.demo.domain.dto.Localidad;

import Back_Articulo_Manufacturado.demo.domain.dto.Provincia.ProvinciaDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LocalidadCreateDto {
    private String nombre;
    private Long idProvincia;
}
