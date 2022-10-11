package co.com.backservicios.usecase.documentorequerido;

import java.util.ArrayList;
import java.util.List;

import co.com.backservicios.model.documentorequerido.DocumentoRequerido;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DocumentoRequeridoUseCase {

    public String pruebaCU() {
        System.out.println("VER logica CU");

        List<String> ff = new ArrayList<>();
        return "";
    }

    public DocumentoRequerido consultarDocumentoRequerido(Integer id) {
        DocumentoRequerido obj = new DocumentoRequerido();

        return obj;
    }

    public DocumentoRequerido crearDocumentoRequerido(DocumentoRequerido crear) {
        DocumentoRequerido obj = new DocumentoRequerido();

        return obj;
    }

    public DocumentoRequerido actualizarDocumentoRequerido(DocumentoRequerido update) {
        DocumentoRequerido obj = new DocumentoRequerido();

        return obj;
    }
}
