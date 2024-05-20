package Back_Articulo_Manufacturado.demo.business.facade.Imp;


import Back_Articulo_Manufacturado.demo.business.facade.Base.BaseFacadeImp;
import Back_Articulo_Manufacturado.demo.business.facade.CategoriaFacade;
import Back_Articulo_Manufacturado.demo.business.mapper.BaseMapper;
import Back_Articulo_Manufacturado.demo.business.service.Base.BaseService;
import Back_Articulo_Manufacturado.demo.business.service.CategoriaService;
import Back_Articulo_Manufacturado.demo.domain.dto.Categoria.CategoriaCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Categoria.CategoriaDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Categoria.CategoriaEditDto;
import Back_Articulo_Manufacturado.demo.domain.entities.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaFacadeImp extends BaseFacadeImp<Categoria, CategoriaDto, CategoriaCreateDto, CategoriaEditDto, Long> implements CategoriaFacade {
    public CategoriaFacadeImp(BaseService<Categoria, Long> baseService, BaseMapper<Categoria, CategoriaDto, CategoriaCreateDto, CategoriaEditDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private CategoriaService categoriaService;

    @Override
    public CategoriaDto addInsumo(Long idCategoria, Long idInsumo) {
        return baseMapper.toDTO(categoriaService.addArticulo(idCategoria,idInsumo));
    }

    @Override
    public CategoriaDto addManufacturado(Long idCategoria, Long idManufacturado) {
        return baseMapper.toDTO(categoriaService.addArticulo(idCategoria,idManufacturado));
    }

    @Override
    public CategoriaDto addSubCategoria(Long idCategoria, CategoriaCreateDto subCategoria) {
        Categoria subCategoriaToCreate = baseMapper.toEntityCreate(subCategoria);
        return baseMapper.toDTO(categoriaService.addSubCategoria(idCategoria, subCategoriaToCreate));
    }
}
