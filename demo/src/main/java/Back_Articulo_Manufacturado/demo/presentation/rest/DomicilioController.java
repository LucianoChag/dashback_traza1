package Back_Articulo_Manufacturado.demo.presentation.rest;

import Back_Articulo_Manufacturado.demo.business.facade.Imp.DomicilioFacadeImp;
import Back_Articulo_Manufacturado.demo.domain.dto.Domicilio.DomicilioCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Domicilio.DomicilioDto;
import Back_Articulo_Manufacturado.demo.domain.entities.Domicilio;
import Back_Articulo_Manufacturado.demo.presentation.rest.Base.BaseControllerImp;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/domicilio")
@CrossOrigin("*")
public class DomicilioController extends BaseControllerImp<Domicilio, DomicilioDto, DomicilioCreateDto,DomicilioCreateDto,Long, DomicilioFacadeImp> {
    public DomicilioController(DomicilioFacadeImp facade) {
        super(facade);
    }
}
