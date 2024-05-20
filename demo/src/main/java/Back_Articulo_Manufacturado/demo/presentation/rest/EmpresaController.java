package Back_Articulo_Manufacturado.demo.presentation.rest;

import Back_Articulo_Manufacturado.demo.business.facade.Imp.EmpresaFacadeImpl;

import Back_Articulo_Manufacturado.demo.domain.dto.Empresa.EmpresaCreateDto;
import Back_Articulo_Manufacturado.demo.domain.dto.Empresa.EmpresaDto;

import Back_Articulo_Manufacturado.demo.domain.dto.Empresa.EmpresaLargeDto;
import Back_Articulo_Manufacturado.demo.domain.entities.Empresa;

import Back_Articulo_Manufacturado.demo.presentation.rest.Base.BaseControllerImp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empresa")
@CrossOrigin("*")
public class EmpresaController extends BaseControllerImp<Empresa, EmpresaDto, EmpresaCreateDto, EmpresaCreateDto,Long, EmpresaFacadeImpl> {
    public EmpresaController(EmpresaFacadeImpl facade) {
        super(facade);
    }

    @GetMapping("/sucursales/{idEmpresa}")
    public ResponseEntity<EmpresaLargeDto> getEmpresaSucursales(@PathVariable Long idEmpresa){
        return ResponseEntity.ok(facade.getEmpresaSucursales(idEmpresa));
    }
}
