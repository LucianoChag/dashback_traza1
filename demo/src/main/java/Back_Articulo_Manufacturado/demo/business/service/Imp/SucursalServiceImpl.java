package Back_Articulo_Manufacturado.demo.business.service.Imp;
import Back_Articulo_Manufacturado.demo.business.service.Base.BaseServiceImp;
import Back_Articulo_Manufacturado.demo.business.service.SucursalService;
import Back_Articulo_Manufacturado.demo.domain.entities.Categoria;
import Back_Articulo_Manufacturado.demo.domain.entities.Sucursal;
import Back_Articulo_Manufacturado.demo.repositories.SucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SucursalServiceImpl extends BaseServiceImp<Sucursal,Long> implements SucursalService {

    @Autowired
    SucursalRepository sucursalRepository;

    @Override
    public List<Categoria> findCategoriasBySucursalId(Long idSucursal) {
        return sucursalRepository.findWithCategoriasById(idSucursal).getCategorias().stream().toList();
    }
}
