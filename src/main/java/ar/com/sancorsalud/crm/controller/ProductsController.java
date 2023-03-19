package ar.com.sancorsalud.crm.controller;

import ar.com.sancorsalud.crm.domain.model.entity.Product;
import ar.com.sancorsalud.crm.domain.model.request.ProductRequest;
import ar.com.sancorsalud.crm.domain.usecase.ProductService;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ProductsController {

    private final ProductService service;

    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> create(@RequestBody ProductRequest request) {
        service.create(request);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Product>> listAll(@RequestParam(required = false) String category) {
        return new ResponseEntity<>(service.listAllOrderByCategoryProduct(category), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Product> listAllProduct(@PathVariable(name = "id", required = true) Long id) {
        return new ResponseEntity<>(service.findByIdProduct(id), HttpStatus.OK);
    }

    @PatchMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> update(@PathVariable(name = "id", required = true) Long id, @RequestBody ProductRequest request){
        service.update(id, request);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> deleteByIdProduct(@PathVariable(name = "id", required = true) Long id) {
        service.deleteByIdProduct(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping(value = "/job", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> someLongOperation(){
        service.someLongOperation();
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }



}
