package ar.com.sancorsalud.crm.domain.usecase;

import ar.com.sancorsalud.crm.domain.model.entity.Product;
import ar.com.sancorsalud.crm.domain.model.request.ProductRequest;

import java.util.List;

public interface IProductService {

    public void create(ProductRequest request);

    public void update(Long id, ProductRequest request);

    public List<Product> listAll();

    public Product findByIdProduct(Long id);

    public List<Product> listAllOrderByCategoryProduct(String category);

    public void deleteByIdProduct(Long id);

}