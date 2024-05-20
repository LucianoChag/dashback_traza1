package Back_Articulo_Manufacturado.demo.presentation.rest;

import Back_Articulo_Manufacturado.demo.business.facade.Imp.PedidoFacadeImp;
import Back_Articulo_Manufacturado.demo.domain.dto.PedidoDto.PedidoCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.PedidoDto.PedidoDto;
import Back_Articulo_Manufacturado.demo.domain.entities.Pedido;
import Back_Articulo_Manufacturado.demo.presentation.rest.Base.BaseControllerImp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/pedido")
public class PedidoController extends BaseControllerImp<Pedido, PedidoDto, PedidoCreateDto,PedidoCreateDto,Long, PedidoFacadeImp> {
    public PedidoController(PedidoFacadeImp facade) {
        super(facade);
    }
}