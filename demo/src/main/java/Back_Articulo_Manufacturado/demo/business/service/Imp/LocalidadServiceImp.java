package Back_Articulo_Manufacturado.demo.business.service.Imp;
import Back_Articulo_Manufacturado.demo.business.service.Base.BaseServiceImp;
import Back_Articulo_Manufacturado.demo.business.service.LocalidadService;
import Back_Articulo_Manufacturado.demo.domain.entities.Localidad;
import Back_Articulo_Manufacturado.demo.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadServiceImp extends BaseServiceImp<Localidad,Long> implements LocalidadService {

    @Autowired
    LocalidadRepository localidadRepository;

    @Override
    public List<Localidad> findByProvinciaId(Long id) {
        return localidadRepository.findByProvinciaId(id);
    }
}
