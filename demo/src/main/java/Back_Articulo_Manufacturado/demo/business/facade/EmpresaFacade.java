package Back_Articulo_Manufacturado.demo.business.facade;


import Back_Articulo_Manufacturado.demo.business.facade.Base.BaseFacade;
import Back_Articulo_Manufacturado.demo.domain.dto.Empresa.EmpresaCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Empresa.EmpresaDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Empresa.EmpresaLargeDto;

public interface EmpresaFacade extends BaseFacade<EmpresaDto, EmpresaCreateDto, EmpresaCreateDto, Long> {
    EmpresaLargeDto getEmpresaSucursales(Long idEmpresa);
}
