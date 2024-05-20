package Back_Articulo_Manufacturado.demo.business.facade.Imp;


import Back_Articulo_Manufacturado.demo.business.facade.Base.BaseFacadeImp;
import Back_Articulo_Manufacturado.demo.business.facade.PaisFacade;
import Back_Articulo_Manufacturado.demo.business.mapper.BaseMapper;
import Back_Articulo_Manufacturado.demo.business.service.Base.BaseService;
import Back_Articulo_Manufacturado.demo.domain.dto.Pais.PaisCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Pais.PaisDto;
import Back_Articulo_Manufacturado.demo.domain.entities.Pais;
import org.springframework.stereotype.Service;

@Service
public class PaisFacadeImp extends BaseFacadeImp<Pais, PaisDto, PaisCreateDto,PaisCreateDto,Long> implements PaisFacade {
    public PaisFacadeImp(BaseService<Pais, Long> baseService, BaseMapper<Pais, PaisDto,PaisCreateDto, PaisCreateDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
