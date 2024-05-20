package Back_Articulo_Manufacturado.demo.business.mapper;


import Back_Articulo_Manufacturado.demo.business.service.SucursalService;
import Back_Articulo_Manufacturado.demo.domain.dto.PedidoDto.PedidoCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.PedidoDto.PedidoDto;
import Back_Articulo_Manufacturado.demo.domain.entities.Pedido;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {SucursalService.class})
public interface PedidoMapper extends BaseMapper<Pedido, PedidoDto, PedidoCreateDto,PedidoCreateDto> {


    @Mapping( source = "idSucursal", target = "sucursal", qualifiedByName = "getById")
    Pedido toEntityCreate(PedidoCreateDto source);
}
