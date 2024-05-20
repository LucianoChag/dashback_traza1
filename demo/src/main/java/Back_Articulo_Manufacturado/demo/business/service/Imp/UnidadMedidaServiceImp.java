package Back_Articulo_Manufacturado.demo.business.service.Imp;

import Back_Articulo_Manufacturado.demo.MyException.RestrictDeleteException;
import Back_Articulo_Manufacturado.demo.business.service.Base.BaseServiceImp;
import Back_Articulo_Manufacturado.demo.business.service.UnidadMedidaService;
import Back_Articulo_Manufacturado.demo.domain.entities.Articulo;
import Back_Articulo_Manufacturado.demo.domain.entities.UnidadMedida;
import Back_Articulo_Manufacturado.demo.repositories.ArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnidadMedidaServiceImp extends BaseServiceImp<UnidadMedida, Long> implements UnidadMedidaService {

    @Autowired
    ArticuloRepository articuloRepository;

    @Override
    public void deleteById(Long id) throws RestrictDeleteException {
        var unidadMedida = getById(id);

        List<Articulo> articulos = articuloRepository.findByUnidadMedida(unidadMedida);
        if(articulos.size() != 0)
            throw new RestrictDeleteException("No se puede eliminar la unidad de medida porque está siendo referenciada por uno o más artículos.");
        baseRepository.delete(unidadMedida);
    }
}
