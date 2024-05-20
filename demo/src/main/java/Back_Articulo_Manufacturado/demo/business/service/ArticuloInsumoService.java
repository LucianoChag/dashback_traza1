package Back_Articulo_Manufacturado.demo.business.service;
import Back_Articulo_Manufacturado.demo.business.service.Base.BaseService;
import Back_Articulo_Manufacturado.demo.domain.entities.ArticuloInsumo;
import Back_Articulo_Manufacturado.demo.domain.entities.ImagenArticulo;

public interface ArticuloInsumoService extends BaseService<ArticuloInsumo, Long> {
    public void addImagen(ImagenArticulo imagenArticulo, Long id);
}
