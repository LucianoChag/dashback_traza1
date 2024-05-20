package Back_Articulo_Manufacturado.demo.presentation.rest;

import Back_Articulo_Manufacturado.demo.business.facade.Imp.ArticuloManufacturadoFacadeImp;
import Back_Articulo_Manufacturado.demo.domain.dto.ArticuloManufacturado.ArticuloManufacturadoCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.ArticuloManufacturado.ArticuloManufacturadoDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Imagen.ImagenCreate;
import Back_Articulo_Manufacturado.demo.domain.entities.ArticuloManufacturado;
import Back_Articulo_Manufacturado.demo.presentation.rest.Base.BaseControllerImp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/ArticuloManufacturado")
public class ArticuloManufacturadoController extends BaseControllerImp<ArticuloManufacturado, ArticuloManufacturadoDto, ArticuloManufacturadoCreateDto, ArticuloManufacturadoCreateDto, Long, ArticuloManufacturadoFacadeImp> {
    public ArticuloManufacturadoController(ArticuloManufacturadoFacadeImp facade) {
        super(facade);
    }

    @GetMapping("/allDetalles/{id}")
    public ResponseEntity<?> findAllDetall(@PathVariable Long id){
        return ResponseEntity.ok(facade.findAllDetalles(id));
    }

    @PutMapping("/addImagen/{id}")
    public ResponseEntity<?> addImagen(@PathVariable Long id, @RequestBody ImagenCreate imagen){
        facade.addImagen(imagen, id);
        return ResponseEntity.ok().body("Imagen cargada");
    }

}
