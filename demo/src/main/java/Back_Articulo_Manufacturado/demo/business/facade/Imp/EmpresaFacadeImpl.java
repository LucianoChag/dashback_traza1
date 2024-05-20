package Back_Articulo_Manufacturado.demo.business.facade.Imp;


import Back_Articulo_Manufacturado.demo.business.facade.Base.BaseFacadeImp;
import Back_Articulo_Manufacturado.demo.business.facade.EmpresaFacade;
import Back_Articulo_Manufacturado.demo.business.mapper.BaseMapper;
import Back_Articulo_Manufacturado.demo.business.mapper.EmpresaMapper;
import Back_Articulo_Manufacturado.demo.business.service.Base.BaseService;
import Back_Articulo_Manufacturado.demo.business.service.EmpresaService;
import Back_Articulo_Manufacturado.demo.domain.dto.Empresa.EmpresaCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Empresa.EmpresaDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Empresa.EmpresaLargeDto;
import Back_Articulo_Manufacturado.demo.domain.entities.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaFacadeImpl extends BaseFacadeImp<Empresa, EmpresaDto, EmpresaCreateDto, EmpresaCreateDto,Long> implements EmpresaFacade {

    public EmpresaFacadeImpl(BaseService<Empresa, Long> baseService, BaseMapper<Empresa, EmpresaDto,EmpresaCreateDto, EmpresaCreateDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    EmpresaMapper empresaMapper;

    @Autowired
    EmpresaService empresaService;

    @Override
    public EmpresaLargeDto getEmpresaSucursales(Long idEmpresa) {
        return empresaMapper.toLargeDto(empresaService.getEmpresaSucursales(idEmpresa));
    }
}
