package Back_Articulo_Manufacturado.demo.business.service.Imp;
import Back_Articulo_Manufacturado.demo.business.service.Base.BaseServiceImp;
import Back_Articulo_Manufacturado.demo.business.service.EmpresaService;

import Back_Articulo_Manufacturado.demo.business.service.SucursalService;
import Back_Articulo_Manufacturado.demo.domain.entities.Empresa;
import Back_Articulo_Manufacturado.demo.domain.entities.Sucursal;
import Back_Articulo_Manufacturado.demo.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class EmpresaServiceImpl extends BaseServiceImp<Empresa,Long> implements EmpresaService {

    @Override
    public Empresa getEmpresaSucursales(Long idEmpresa) {
        Empresa empresa = baseRepository.getById(idEmpresa);
        // Se filtran las sucursales eliminadas y se juntan
        Set<Sucursal> sucursales = empresa.getSucursales().stream()
                .filter(sucursal -> !sucursal.isEliminado())
                .collect(Collectors.toSet());
        // Se actualiza el conjunto de sucursales de la empresa.
        empresa.setSucursales(sucursales);
        return empresa;
    }
}
