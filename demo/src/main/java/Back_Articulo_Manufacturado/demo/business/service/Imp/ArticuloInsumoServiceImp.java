package Back_Articulo_Manufacturado.demo.business.service.Imp;

import Back_Articulo_Manufacturado.demo.MyException.RestrictDeleteException;
import Back_Articulo_Manufacturado.demo.business.service.ArticuloInsumoService;
import Back_Articulo_Manufacturado.demo.business.service.Base.BaseServiceImp;
import Back_Articulo_Manufacturado.demo.domain.entities.ArticuloInsumo;
import Back_Articulo_Manufacturado.demo.domain.entities.ArticuloManufacturadoDetalle;
import Back_Articulo_Manufacturado.demo.domain.entities.ImagenArticulo;
import Back_Articulo_Manufacturado.demo.repositories.ArticuloManufacturadoDetalleRepository;
import Back_Articulo_Manufacturado.demo.repositories.ImagenArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloInsumoServiceImp extends BaseServiceImp<ArticuloInsumo, Long> implements ArticuloInsumoService {

    @Autowired
    private ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository;

    @Autowired
    private ImagenArticuloRepository imagenArticuloRepository;

    @Override
    public void deleteById(Long id) throws RestrictDeleteException {
        var insumo = getById(id);
        List<ArticuloManufacturadoDetalle> detalles = articuloManufacturadoDetalleRepository.findByArticuloInsumo(insumo);
       // Si el size de detalles es igual a 0 es porque el insumo no esta en ningun detalle
        if(detalles.size() != 0)
            throw new RestrictDeleteException("No se puede eliminar el insumo por la integridad referencial de los datos");
        //si el insumo no esta en ninguno detalle se elimina
        baseRepository.delete(insumo);
    }


    @Override
    public void addImagen(ImagenArticulo imagenArticulo, Long id) {
        var articulo = getById(id);
        articulo.getImagenes().add(imagenArticulo);
        imagenArticuloRepository.save(imagenArticulo);
        baseRepository.save(articulo);
    }
}


