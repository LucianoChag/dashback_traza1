package Back_Articulo_Manufacturado.demo.business.facade;



import Back_Articulo_Manufacturado.demo.business.facade.Base.BaseFacade;
import Back_Articulo_Manufacturado.demo.domain.dto.Localidad.LocalidadCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Localidad.LocalidadDto;

import java.util.List;

public interface LocalidadFacade extends BaseFacade<LocalidadDto, LocalidadCreateDto, LocalidadCreateDto, Long> {

    List<LocalidadDto> findByProvinciaId(Long id);
}
