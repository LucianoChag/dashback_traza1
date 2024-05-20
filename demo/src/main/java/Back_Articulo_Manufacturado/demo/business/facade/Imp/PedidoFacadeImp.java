package Back_Articulo_Manufacturado.demo.business.facade.Imp;


import Back_Articulo_Manufacturado.demo.business.facade.Base.BaseFacadeImp;
import Back_Articulo_Manufacturado.demo.business.facade.PedidoFacade;
import Back_Articulo_Manufacturado.demo.business.mapper.BaseMapper;
import Back_Articulo_Manufacturado.demo.business.service.Base.BaseService;
import Back_Articulo_Manufacturado.demo.domain.dto.PedidoDto.PedidoCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.PedidoDto.PedidoDto;
import Back_Articulo_Manufacturado.demo.domain.entities.Pedido;
import org.springframework.stereotype.Service;

@Service
public class PedidoFacadeImp extends BaseFacadeImp<Pedido, PedidoDto, PedidoCreateDto,PedidoCreateDto,Long> implements PedidoFacade {

    public PedidoFacadeImp(BaseService<Pedido, Long> baseService, BaseMapper<Pedido, PedidoDto, PedidoCreateDto,PedidoCreateDto> baseMapper) {
        super(baseService, baseMapper);
    }
}

