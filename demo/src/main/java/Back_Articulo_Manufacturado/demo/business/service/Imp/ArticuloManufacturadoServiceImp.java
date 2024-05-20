package Back_Articulo_Manufacturado.demo.business.service.Imp;

import Back_Articulo_Manufacturado.demo.business.service.ArticuloManufacturadoService;
import Back_Articulo_Manufacturado.demo.business.service.Base.BaseServiceImp;
import Back_Articulo_Manufacturado.demo.domain.entities.ArticuloManufacturado;
import Back_Articulo_Manufacturado.demo.domain.entities.ArticuloManufacturadoDetalle;
import Back_Articulo_Manufacturado.demo.domain.entities.ImagenArticulo;
import Back_Articulo_Manufacturado.demo.repositories.ArticuloManufacturadoRepository;
import Back_Articulo_Manufacturado.demo.repositories.ImagenArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloManufacturadoServiceImp extends BaseServiceImp<ArticuloManufacturado, Long> implements ArticuloManufacturadoService{

    @Autowired
    ArticuloManufacturadoRepository articuloManufacturadoRepository;

    @Autowired
    ImagenArticuloRepository imagenArticuloRepository;

    @Override
    public List<ArticuloManufacturadoDetalle> findAllDetalles(Long id) {
        return getById(id).getArticuloManufacturadoDetalles().stream().toList();
    }

    @Override
    public void addImagen(ImagenArticulo imagenArticulo, Long id) {
        var articulo = getById(id);
        articulo.getImagenes().add(imagenArticulo);
        imagenArticuloRepository.save(imagenArticulo);
        baseRepository.save(articulo);
    }
}
