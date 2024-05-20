package Back_Articulo_Manufacturado.demo.business.facade.Imp;

import Back_Articulo_Manufacturado.demo.business.facade.Base.BaseFacadeImp;
import Back_Articulo_Manufacturado.demo.business.facade.UnidadMedidaFacade;
import Back_Articulo_Manufacturado.demo.business.mapper.BaseMapper;
import Back_Articulo_Manufacturado.demo.business.service.Base.BaseService;
import Back_Articulo_Manufacturado.demo.domain.dto.UnidadMedida.UnidadMedidaCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.UnidadMedida.UnidadMedidaDto;
import Back_Articulo_Manufacturado.demo.domain.entities.UnidadMedida;
import org.springframework.stereotype.Service;

@Service
public class UnidadMedidaFacadeImp extends BaseFacadeImp<UnidadMedida, UnidadMedidaDto, UnidadMedidaCreateDto, UnidadMedidaCreateDto, Long> implements UnidadMedidaFacade {
    public UnidadMedidaFacadeImp(BaseService<UnidadMedida, Long> baseService, BaseMapper<UnidadMedida, UnidadMedidaDto, UnidadMedidaCreateDto, UnidadMedidaCreateDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
