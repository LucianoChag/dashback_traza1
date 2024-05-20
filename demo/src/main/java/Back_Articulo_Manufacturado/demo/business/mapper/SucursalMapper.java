package Back_Articulo_Manufacturado.demo.business.mapper;

import Back_Articulo_Manufacturado.demo.business.service.EmpresaService;
import Back_Articulo_Manufacturado.demo.domain.dto.Sucursal.SucursalCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Sucursal.SucursalDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Sucursal.SucursalEditDto;
import Back_Articulo_Manufacturado.demo.domain.entities.Sucursal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {DomicilioMapper.class, EmpresaService.class} )
public interface SucursalMapper extends BaseMapper<Sucursal, SucursalDto, SucursalCreateDto, SucursalEditDto>{
    //qualifiedByName ="getById" apunta al metodo con @Named de EmpresaService con valor getById
    @Mapping(target = "empresa", source = "idEmpresa", qualifiedByName = "getById")
    public Sucursal toEntityCreate(SucursalCreateDto source);
}
