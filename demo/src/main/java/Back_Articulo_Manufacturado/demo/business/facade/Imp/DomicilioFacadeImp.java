package Back_Articulo_Manufacturado.demo.business.facade.Imp;


import Back_Articulo_Manufacturado.demo.business.facade.Base.BaseFacadeImp;
import Back_Articulo_Manufacturado.demo.business.facade.DomicilioFacade;
import Back_Articulo_Manufacturado.demo.business.mapper.BaseMapper;
import Back_Articulo_Manufacturado.demo.business.service.Base.BaseService;
import Back_Articulo_Manufacturado.demo.domain.dto.Domicilio.DomicilioCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Domicilio.DomicilioDto;
import Back_Articulo_Manufacturado.demo.domain.entities.Domicilio;
import org.springframework.stereotype.Service;

@Service
public class DomicilioFacadeImp extends BaseFacadeImp<Domicilio, DomicilioDto, DomicilioCreateDto,DomicilioCreateDto, Long> implements DomicilioFacade {
    public DomicilioFacadeImp(BaseService<Domicilio, Long> baseService, BaseMapper<Domicilio, DomicilioDto,DomicilioCreateDto, DomicilioCreateDto> baseMapper) {
        super(baseService, baseMapper);
    }

}
