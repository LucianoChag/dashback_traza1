package Back_Articulo_Manufacturado.demo.business.facade;


import Back_Articulo_Manufacturado.demo.business.facade.Base.BaseFacade;
import Back_Articulo_Manufacturado.demo.domain.dto.Imagen.ImagenCreate;
import Back_Articulo_Manufacturado.demo.domain.dto.Insumo.ArticuloInsumoCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Insumo.ArticuloInsumoDto;

public interface ArticuloInsumoFacade extends BaseFacade<ArticuloInsumoDto, ArticuloInsumoCreateDto, ArticuloInsumoCreateDto, Long> {
    public void addImagen(ImagenCreate imagen, Long id);
}
