package Back_Articulo_Manufacturado.demo.presentation.rest;

import Back_Articulo_Manufacturado.demo.business.facade.Imp.PaisFacadeImp;
import Back_Articulo_Manufacturado.demo.domain.dto.Pais.PaisCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Pais.PaisDto;
import Back_Articulo_Manufacturado.demo.domain.entities.Pais;
import Back_Articulo_Manufacturado.demo.presentation.rest.Base.BaseControllerImp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pais")
@CrossOrigin("*")
public class PaisController extends BaseControllerImp<Pais, PaisDto, PaisCreateDto, PaisCreateDto,Long, PaisFacadeImp> {

    public PaisController(PaisFacadeImp facade) {
        super(facade);
    }
}
