package Back_Articulo_Manufacturado.demo.business.facade;


import Back_Articulo_Manufacturado.demo.business.facade.Base.BaseFacade;
import Back_Articulo_Manufacturado.demo.domain.dto.Provincia.ProvinciaCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Provincia.ProvinciaDto;

import java.util.List;

public interface ProvinciaFacade extends BaseFacade<ProvinciaDto, ProvinciaCreateDto, ProvinciaCreateDto, Long> {
    List<ProvinciaDto> findByPaisId(Long id);
}
