package Back_Articulo_Manufacturado.demo.presentation.rest;


import Back_Articulo_Manufacturado.demo.business.facade.Imp.ArticuloInsumoFacadeImp;
import Back_Articulo_Manufacturado.demo.domain.dto.Imagen.ImagenCreate;
import Back_Articulo_Manufacturado.demo.domain.dto.Insumo.ArticuloInsumoCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Insumo.ArticuloInsumoDto;
import Back_Articulo_Manufacturado.demo.domain.entities.ArticuloInsumo;
import Back_Articulo_Manufacturado.demo.presentation.rest.Base.BaseControllerImp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/ArticuloInsumo")
public class ArticuloInsumoController  extends BaseControllerImp<ArticuloInsumo, ArticuloInsumoDto, ArticuloInsumoCreateDto, ArticuloInsumoCreateDto, Long, ArticuloInsumoFacadeImp> {
    public ArticuloInsumoController(ArticuloInsumoFacadeImp facade) {
        super(facade);
    }

    @PutMapping("/addImagen/{id}")
    public ResponseEntity<?> addImagen(@PathVariable Long id, @RequestBody ImagenCreate imagen){
        facade.addImagen(imagen, id);
        return ResponseEntity.ok().body("Imagen cargada");
    }
}
