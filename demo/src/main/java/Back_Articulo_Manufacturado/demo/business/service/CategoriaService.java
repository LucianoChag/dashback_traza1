package Back_Articulo_Manufacturado.demo.business.service;

import Back_Articulo_Manufacturado.demo.business.service.Base.BaseService;
import Back_Articulo_Manufacturado.demo.domain.entities.Categoria;

public interface CategoriaService extends BaseService<Categoria, Long> {
    public Categoria addArticulo(Long idCategoria, Long idArticulo);
    public Categoria addSubCategoria(Long idCategoria, Categoria subCategoriaToCreate);
}
