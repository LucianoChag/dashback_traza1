package Back_Articulo_Manufacturado.demo.business.facade.Imp;


import Back_Articulo_Manufacturado.demo.business.facade.Base.BaseFacadeImp;
import Back_Articulo_Manufacturado.demo.business.facade.LocalidadFacade;
import Back_Articulo_Manufacturado.demo.business.mapper.BaseMapper;
import Back_Articulo_Manufacturado.demo.business.service.Base.BaseService;
import Back_Articulo_Manufacturado.demo.business.service.LocalidadService;
import Back_Articulo_Manufacturado.demo.domain.dto.Localidad.LocalidadCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Localidad.LocalidadDto;
import Back_Articulo_Manufacturado.demo.domain.entities.Localidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LocalidadFacadeImp extends BaseFacadeImp<Localidad, LocalidadDto, LocalidadCreateDto, LocalidadCreateDto, Long> implements LocalidadFacade {
    public LocalidadFacadeImp(BaseService<Localidad, Long> baseService, BaseMapper<Localidad, LocalidadDto,LocalidadCreateDto, LocalidadCreateDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    LocalidadService localidadService;

    @Override
    public List<LocalidadDto> findByProvinciaId(Long id) {
            // trae una lista de entidades
            var entities = localidadService.findByProvinciaId(id);
            //  devuelve una lista de DTO
            return entities
                    .stream()
                    .map(baseMapper::toDTO)
                    .collect(Collectors.toList());
    }
}
