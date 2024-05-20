package Back_Articulo_Manufacturado.demo.presentation.rest.Base;


import Back_Articulo_Manufacturado.demo.MyException.RestrictDeleteException;
import Back_Articulo_Manufacturado.demo.domain.dto.BaseDto;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;
import java.util.List;
//DC Dto create
//DE Dte edit
public interface BaseController <D extends BaseDto, DC, DE, ID extends Serializable> {
    ResponseEntity<D> getById(ID id);

    ResponseEntity<List<D>> getAll();

    ResponseEntity<D> create(DC entity);

    ResponseEntity<D> edit(DE entity, ID id);

    ResponseEntity<?> deleteById(ID id) throws RestrictDeleteException;
}