package ar.com.sancorsalud.crm.domain.usecase;

import ar.com.sancorsalud.crm.domain.model.entity.Product;
import ar.com.sancorsalud.crm.domain.model.request.ProductRequest;
import ar.com.sancorsalud.crm.domain.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service("productService")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ProductService implements IProductService {

    @Qualifier("productRepository")
    private final ProductRepository repo;

    @Async("taskExecutor")
    public void someLongOperation() {
        repo.findAll().forEach(p -> {
            log.info("Performing some long operation on productId={}", p.getId());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {
                throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, ignored.getMessage(), ignored);
            }
        });
    }

    @Transactional
    @Override
    public void create(ProductRequest request) {
        Optional<Product> product = repo.findById(request.getId());
        if (product.isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Product exist.");
        } else {
            Product response = new Product();
            response.setAvailability(request.getAvailability());
            response.setCategory(request.getCategory());
            response.setDiscountedPrice(request.getDiscountedPrice());
            response.setName(request.getName());
            response.setRetailPrice(request.getRetailPrice());
            repo.save(response);
        }
    }

    @Transactional()
    @Override
    public void update(Long id, ProductRequest request) {
        try {
            Optional<Product> product = repo.findByIdProduct(id);
            if (product.isPresent()) {
                product.get().setAvailability(request.getAvailability() != null ? request.getAvailability() : product.get().getAvailability());
                product.get().setCategory(request.getCategory() != null ? request.getCategory() : product.get().getCategory());
                product.get().setDiscountedPrice(request.getDiscountedPrice() != null ? request.getDiscountedPrice() : product.get().getDiscountedPrice());
                product.get().setRetailPrice(request.getRetailPrice() != null ? request.getRetailPrice() : product.get().getRetailPrice());
                product.get().setName(request.getName() != null ? request.getName() : product.get().getName());
                repo.saveAndFlush(product.get());
            } else {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Error to update Product");
            }
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Error to update Product", e);
        }
    }

    @Transactional(readOnly = true)
    @Override
    public List<Product> listAll() {
        return repo.listAllOrderById();
    }

    @Transactional(readOnly = true)
    @Override
    public Product findByIdProduct(Long id) {
        Optional<Product> product = repo.findByIdProduct(id);
        if (product.isPresent()) {
            return product.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found.");
        }
    }

    @Transactional(readOnly = true)
    @Override
    public List<Product> listAllOrderByCategoryProduct(String category) {
        List<Product> listAllOrderByProduct;
        if (category != null) {
            listAllOrderByProduct = repo.listAllOrderByCategoryProduct(category);
        } else {
            listAllOrderByProduct = repo.listAllOrderById();
        }
        return listAllOrderByProduct;
    }

    @Transactional()
    @Override
    public void deleteByIdProduct(Long id) {
        try {
            Optional<Product> product = repo.findByIdProduct(id);
            if (product.isPresent()) {
                repo.delete(product.get());
            } else {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found.");
            }
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Error to update Product", e);
        }
    }

}