package Back_Articulo_Manufacturado.demo.presentation.rest;

import Back_Articulo_Manufacturado.demo.business.facade.Imp.ArticuloManufacturadoDetalleFacadeImp;
import Back_Articulo_Manufacturado.demo.domain.dto.ArticuloManufacturadoDetalle.ArticuloManufacturadoDetalleCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.ArticuloManufacturadoDetalle.ArticuloManufacturadoDetalleDto;
import Back_Articulo_Manufacturado.demo.domain.entities.ArticuloManufacturadoDetalle;
import Back_Articulo_Manufacturado.demo.presentation.rest.Base.BaseControllerImp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/ArticuloManufacturadoDetalle")
public class ArticuloManufacturadoDetalleController extends BaseControllerImp<ArticuloManufacturadoDetalle, ArticuloManufacturadoDetalleDto, ArticuloManufacturadoDetalleCreateDto, ArticuloManufacturadoDetalleCreateDto, Long, ArticuloManufacturadoDetalleFacadeImp> {
    public ArticuloManufacturadoDetalleController(ArticuloManufacturadoDetalleFacadeImp facade) {
        super(facade);
    }
}
