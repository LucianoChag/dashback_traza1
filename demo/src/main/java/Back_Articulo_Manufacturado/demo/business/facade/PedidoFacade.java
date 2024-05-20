package Back_Articulo_Manufacturado.demo.business.facade;


import Back_Articulo_Manufacturado.demo.business.facade.Base.BaseFacade;
import Back_Articulo_Manufacturado.demo.domain.dto.PedidoDto.PedidoCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.PedidoDto.PedidoDto;

public interface PedidoFacade extends BaseFacade<PedidoDto, PedidoCreateDto,PedidoCreateDto, Long> {
}
