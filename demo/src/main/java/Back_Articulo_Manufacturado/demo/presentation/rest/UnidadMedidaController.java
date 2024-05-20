package Back_Articulo_Manufacturado.demo.presentation.rest;

import Back_Articulo_Manufacturado.demo.business.facade.Imp.UnidadMedidaFacadeImp;
import Back_Articulo_Manufacturado.demo.domain.dto.UnidadMedida.UnidadMedidaCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.UnidadMedida.UnidadMedidaDto;
import Back_Articulo_Manufacturado.demo.domain.entities.UnidadMedida;
import Back_Articulo_Manufacturado.demo.presentation.rest.Base.BaseControllerImp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/UnidadMedida")
@CrossOrigin("*")
public class UnidadMedidaController extends BaseControllerImp<UnidadMedida, UnidadMedidaDto, UnidadMedidaCreateDto, UnidadMedidaCreateDto,Long, UnidadMedidaFacadeImp> {
    public UnidadMedidaController(UnidadMedidaFacadeImp facade) {
        super(facade);
    }
}
