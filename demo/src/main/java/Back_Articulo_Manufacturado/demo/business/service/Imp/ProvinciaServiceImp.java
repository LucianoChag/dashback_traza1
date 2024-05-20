package Back_Articulo_Manufacturado.demo.business.service.Imp;


import Back_Articulo_Manufacturado.demo.business.service.Base.BaseServiceImp;
import Back_Articulo_Manufacturado.demo.business.service.ProvinciaService;
import Back_Articulo_Manufacturado.demo.domain.entities.Provincia;
import Back_Articulo_Manufacturado.demo.repositories.ProvinciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinciaServiceImp extends BaseServiceImp<Provincia,Long> implements ProvinciaService {
    @Autowired
    ProvinciaRepository provinciaRepository;
    @Override
    public List<Provincia> findByPaisId(Long id) {
        return provinciaRepository.findByPaisId(id);
    }
}
