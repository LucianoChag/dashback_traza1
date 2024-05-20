package Back_Articulo_Manufacturado.demo.business.facade.Imp;

import Back_Articulo_Manufacturado.demo.business.facade.Base.BaseFacadeImp;
import Back_Articulo_Manufacturado.demo.business.facade.ProvinciaFacade;
import Back_Articulo_Manufacturado.demo.business.mapper.BaseMapper;
import Back_Articulo_Manufacturado.demo.business.service.Base.BaseService;
import Back_Articulo_Manufacturado.demo.business.service.ProvinciaService;
import Back_Articulo_Manufacturado.demo.domain.dto.Provincia.ProvinciaCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Provincia.ProvinciaDto;
import Back_Articulo_Manufacturado.demo.domain.entities.Provincia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinciaFacadeImp extends BaseFacadeImp<Provincia, ProvinciaDto, ProvinciaCreateDto, ProvinciaCreateDto, Long> implements ProvinciaFacade {

    public ProvinciaFacadeImp(BaseService<Provincia, Long> baseService, BaseMapper<Provincia, ProvinciaDto,ProvinciaCreateDto, ProvinciaCreateDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    ProvinciaService provinciaService;
    @Override
    public List<ProvinciaDto> findByPaisId(Long id) {
        return baseMapper.toDTOsList(provinciaService.findByPaisId(id));
    }
}
