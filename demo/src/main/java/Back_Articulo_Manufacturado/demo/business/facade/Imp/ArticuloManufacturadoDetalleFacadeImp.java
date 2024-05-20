package Back_Articulo_Manufacturado.demo.business.facade.Imp;


import Back_Articulo_Manufacturado.demo.business.facade.ArticuloManufacturadoDetalleFacade;
import Back_Articulo_Manufacturado.demo.business.facade.Base.BaseFacadeImp;
import Back_Articulo_Manufacturado.demo.business.mapper.BaseMapper;
import Back_Articulo_Manufacturado.demo.business.service.Base.BaseService;
import Back_Articulo_Manufacturado.demo.domain.dto.ArticuloManufacturadoDetalle.ArticuloManufacturadoDetalleCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.ArticuloManufacturadoDetalle.ArticuloManufacturadoDetalleDto;
import Back_Articulo_Manufacturado.demo.domain.entities.ArticuloManufacturadoDetalle;
import org.springframework.stereotype.Service;

@Service
public class ArticuloManufacturadoDetalleFacadeImp extends BaseFacadeImp<ArticuloManufacturadoDetalle, ArticuloManufacturadoDetalleDto, ArticuloManufacturadoDetalleCreateDto, ArticuloManufacturadoDetalleCreateDto, Long> implements ArticuloManufacturadoDetalleFacade {
    public ArticuloManufacturadoDetalleFacadeImp(BaseService<ArticuloManufacturadoDetalle, Long> baseService, BaseMapper<ArticuloManufacturadoDetalle, ArticuloManufacturadoDetalleDto,ArticuloManufacturadoDetalleCreateDto, ArticuloManufacturadoDetalleCreateDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
