package co.com.backservicios.model.documentorequerido;

import lombok.Builder;
import lombok.Data;

@Data
// @Builder(toBuilder = true)
public class DocumentoRequerido {

    public DocumentoRequerido() {
    }

    private Integer codigo;
    private String nombre;
    private String descripcion;
    private boolean estado;

}
