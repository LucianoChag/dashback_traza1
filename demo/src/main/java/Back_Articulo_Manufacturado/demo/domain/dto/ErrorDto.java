package Back_Articulo_Manufacturado.demo.domain.dto;


import lombok.*;


@Builder
public class ErrorDto {
    private String errorMsg;
    private String errorClass;
}
