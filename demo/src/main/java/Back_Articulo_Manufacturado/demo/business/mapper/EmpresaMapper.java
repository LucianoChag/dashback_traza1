package Back_Articulo_Manufacturado.demo.business.mapper;



import Back_Articulo_Manufacturado.demo.domain.dto.Empresa.EmpresaCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Empresa.EmpresaDto;

import Back_Articulo_Manufacturado.demo.domain.dto.Empresa.EmpresaLargeDto;
import Back_Articulo_Manufacturado.demo.domain.entities.Empresa;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmpresaMapper extends BaseMapper<Empresa, EmpresaDto, EmpresaCreateDto,EmpresaCreateDto> {
    EmpresaLargeDto toLargeDto(Empresa empresa);
}
