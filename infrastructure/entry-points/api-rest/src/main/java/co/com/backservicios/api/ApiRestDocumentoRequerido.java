package co.com.backservicios.api;

import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.backservicios.model.documentorequerido.DocumentoRequerido;
import co.com.backservicios.usecase.documentorequerido.DocumentoRequeridoUseCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRestDocumentoRequerido {

    // Logger logger = LoggerFactory.getLogger(ApiRestDocumentoRequerido.class);
    private final DocumentoRequeridoUseCase useCase;

    @GetMapping(path = "/pruebasservicio")
    public String commandName() {
        return useCase.pruebaCU();
        // return "Hello World";
    }

    @GetMapping(path = "/consultar")
    public ResponseEntity<DocumentoRequerido> consultarDocuemntoRequerido(Integer id) {
        DocumentoRequerido objConsulta = null;
        try {
            System.out.println("DATOS JSON consultar:" + id);
            objConsulta = useCase.consultarDocumentoRequerido(id);
            return new ResponseEntity<>(objConsulta, HttpStatus.OK);
        } catch (Exception e) {
            // logger.error("Error:", e);
            return new ResponseEntity<>(objConsulta, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(path = "/")
    public ResponseEntity<DocumentoRequerido> crearDocumentoRequerido(
            @RequestBody DocumentoRequerido documentoRequerido) {
        System.out.println("DATOS JSON crear:" + documentoRequerido.getNombre());
        try {
            useCase.crearDocumentoRequerido(documentoRequerido);
            return new ResponseEntity<>(documentoRequerido, HttpStatus.OK);
        } catch (Exception e) {
            // logger.error("Error:", e);

            return new ResponseEntity<>(documentoRequerido, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping(path = "/update")
    public ResponseEntity<DocumentoRequerido> actualizarDocumentoRequerido(
            @RequestBody DocumentoRequerido documentoRequerido) {
        DocumentoRequerido out = new DocumentoRequerido();
        System.out.println("DATOS JSON update:" + documentoRequerido.getNombre());
        try {
            useCase.actualizarDocumentoRequerido(documentoRequerido);
            return new ResponseEntity<>(documentoRequerido, HttpStatus.OK);
        } catch (Exception e) {
            // logger.error("Error:", e);

            return new ResponseEntity<>(documentoRequerido, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
