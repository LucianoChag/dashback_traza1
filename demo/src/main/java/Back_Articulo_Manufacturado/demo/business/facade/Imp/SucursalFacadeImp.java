package Back_Articulo_Manufacturado.demo.business.facade.Imp;

import Back_Articulo_Manufacturado.demo.business.facade.Base.BaseFacadeImp;
import Back_Articulo_Manufacturado.demo.business.facade.Sucursalfacade;
import Back_Articulo_Manufacturado.demo.business.mapper.BaseMapper;
import Back_Articulo_Manufacturado.demo.business.mapper.CategoriaMapper;
import Back_Articulo_Manufacturado.demo.business.service.Base.BaseService;
import Back_Articulo_Manufacturado.demo.business.service.SucursalService;
import Back_Articulo_Manufacturado.demo.domain.dto.Categoria.CategoriaDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Sucursal.SucursalCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Sucursal.SucursalDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Sucursal.SucursalEditDto;
import Back_Articulo_Manufacturado.demo.domain.entities.Sucursal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SucursalFacadeImp extends BaseFacadeImp<Sucursal, SucursalDto, SucursalCreateDto, SucursalEditDto,Long> implements Sucursalfacade {
    public SucursalFacadeImp(BaseService<Sucursal, Long> baseService, BaseMapper<Sucursal, SucursalDto, SucursalCreateDto, SucursalEditDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    CategoriaMapper categoriaMapper;

    @Autowired
    SucursalService sucursalService;

    @Override
    public List<CategoriaDto> findAllCategoriasByIdSucursal(Long idSucursal) {
        return categoriaMapper.toDTOsList(sucursalService.findCategoriasBySucursalId(idSucursal));
    }
}
