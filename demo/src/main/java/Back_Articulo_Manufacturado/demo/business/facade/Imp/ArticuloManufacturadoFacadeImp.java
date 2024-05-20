package Back_Articulo_Manufacturado.demo.business.facade.Imp;


import Back_Articulo_Manufacturado.demo.business.facade.ArticuloManufacturadoFacade;
import Back_Articulo_Manufacturado.demo.business.facade.Base.BaseFacadeImp;
import Back_Articulo_Manufacturado.demo.business.mapper.ArticuloManufacturadoDetalleMapper;
import Back_Articulo_Manufacturado.demo.business.mapper.BaseMapper;
import Back_Articulo_Manufacturado.demo.business.mapper.ImagenArticuloMapper;
import Back_Articulo_Manufacturado.demo.business.service.ArticuloManufacturadoService;
import Back_Articulo_Manufacturado.demo.business.service.Base.BaseService;
import Back_Articulo_Manufacturado.demo.domain.dto.ArticuloManufacturado.ArticuloManufacturadoCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.ArticuloManufacturado.ArticuloManufacturadoDto;
import Back_Articulo_Manufacturado.demo.domain.dto.ArticuloManufacturadoDetalle.ArticuloManufacturadoDetalleDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Imagen.ImagenCreate;
import Back_Articulo_Manufacturado.demo.domain.entities.ArticuloManufacturado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloManufacturadoFacadeImp extends BaseFacadeImp<ArticuloManufacturado, ArticuloManufacturadoDto, ArticuloManufacturadoCreateDto, ArticuloManufacturadoCreateDto, Long> implements ArticuloManufacturadoFacade {
    public ArticuloManufacturadoFacadeImp(BaseService<ArticuloManufacturado, Long> baseService, BaseMapper<ArticuloManufacturado, ArticuloManufacturadoDto, ArticuloManufacturadoCreateDto, ArticuloManufacturadoCreateDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    ArticuloManufacturadoService articuloManufacturadoService;

    @Autowired
    ArticuloManufacturadoDetalleMapper articuloManufacturadoDetalleMapper;

    @Autowired
    ImagenArticuloMapper mapper;

    @Override
    public List<ArticuloManufacturadoDetalleDto> findAllDetalles(Long id) {
        return articuloManufacturadoDetalleMapper.toDTOsList(articuloManufacturadoService.findAllDetalles(id));
    }

    @Override
    public void addImagen(ImagenCreate imagen, Long id) {
        articuloManufacturadoService.addImagen(mapper.toEntityCreate(imagen), id);
    }
}
