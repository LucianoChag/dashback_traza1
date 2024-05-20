package Back_Articulo_Manufacturado.demo.business.service;
import Back_Articulo_Manufacturado.demo.business.service.Base.BaseService;
import Back_Articulo_Manufacturado.demo.domain.entities.Empresa;

public interface EmpresaService extends BaseService<Empresa, Long> {
    public Empresa getEmpresaSucursales(Long idEmpresa);
}
