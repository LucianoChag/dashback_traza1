package Back_Articulo_Manufacturado.demo.business.facade;

import Back_Articulo_Manufacturado.demo.business.facade.Base.BaseFacade;
import Back_Articulo_Manufacturado.demo.domain.dto.Categoria.CategoriaCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Categoria.CategoriaDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Categoria.CategoriaEditDto;
import org.springframework.stereotype.Service;

@Service
public interface CategoriaFacade extends BaseFacade<CategoriaDto, CategoriaCreateDto, CategoriaEditDto, Long> {
    public CategoriaDto addInsumo(Long idCategoria, Long idInsumo);
    public CategoriaDto addManufacturado(Long idCategoria, Long idManufacturado);
    public CategoriaDto addSubCategoria(Long idCategoria, CategoriaCreateDto subCategoria);
}
