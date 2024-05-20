package Back_Articulo_Manufacturado.demo.presentation.rest;


import Back_Articulo_Manufacturado.demo.business.facade.Imp.SucursalFacadeImp;

import Back_Articulo_Manufacturado.demo.domain.dto.Categoria.CategoriaDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Sucursal.SucursalCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Sucursal.SucursalDto;

import Back_Articulo_Manufacturado.demo.domain.dto.Sucursal.SucursalEditDto;
import Back_Articulo_Manufacturado.demo.domain.entities.Sucursal;
import Back_Articulo_Manufacturado.demo.presentation.rest.Base.BaseControllerImp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sucursal")
@CrossOrigin("*")
public class SucursalController extends BaseControllerImp<Sucursal, SucursalDto, SucursalCreateDto, SucursalEditDto,Long, SucursalFacadeImp> {
    public SucursalController(SucursalFacadeImp facade) {
        super(facade);
    }

    @GetMapping("/getCategorias/{idSucursal}")
    public ResponseEntity<List<CategoriaDto>>getCategorias(@PathVariable Long idSucursal){
        return ResponseEntity.ok(facade.findAllCategoriasByIdSucursal(idSucursal));
    }
}
