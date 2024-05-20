package Back_Articulo_Manufacturado.demo.domain.dto.Imagen;


import Back_Articulo_Manufacturado.demo.domain.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ImagenDto extends BaseDto {
    private String url;
}
