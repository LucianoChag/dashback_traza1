package Back_Articulo_Manufacturado.demo.domain.dto.Categoria;


import Back_Articulo_Manufacturado.demo.domain.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SubCategoriaDto extends BaseDto {
    private String denominacion;

    private boolean esInsumo;
}
