package Back_Articulo_Manufacturado.demo.business.facade.Imp;


import Back_Articulo_Manufacturado.demo.business.facade.ArticuloInsumoFacade;
import Back_Articulo_Manufacturado.demo.business.facade.Base.BaseFacadeImp;
import Back_Articulo_Manufacturado.demo.business.mapper.BaseMapper;
import Back_Articulo_Manufacturado.demo.business.mapper.ImagenArticuloMapper;
import Back_Articulo_Manufacturado.demo.business.service.ArticuloInsumoService;
import Back_Articulo_Manufacturado.demo.business.service.Base.BaseService;
import Back_Articulo_Manufacturado.demo.domain.dto.Imagen.ImagenCreate;
import Back_Articulo_Manufacturado.demo.domain.dto.Insumo.ArticuloInsumoCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Insumo.ArticuloInsumoDto;
import Back_Articulo_Manufacturado.demo.domain.entities.ArticuloInsumo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticuloInsumoFacadeImp extends BaseFacadeImp<ArticuloInsumo, ArticuloInsumoDto, ArticuloInsumoCreateDto, ArticuloInsumoCreateDto, Long> implements ArticuloInsumoFacade {
    public ArticuloInsumoFacadeImp(BaseService<ArticuloInsumo, Long> baseService, BaseMapper<ArticuloInsumo, ArticuloInsumoDto,ArticuloInsumoCreateDto,ArticuloInsumoCreateDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    ImagenArticuloMapper mapper;
    @Autowired
    ArticuloInsumoService articuloInsumoService;

    @Override
    public void addImagen(ImagenCreate imagen, Long id) {
        articuloInsumoService.addImagen(mapper.toEntityCreate(imagen), id);
    }
}
