package ar.com.sancorsalud.crm.domain.repository;

import ar.com.sancorsalud.crm.domain.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("productRepository")
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "SELECT p FROM Product p WHERE p.id = :id")
    Optional<Product> findByIdProduct(@Param("id") Long id);
	
	@Query(value = "SELECT p FROM Product p ORDER BY p.id ASC")
    List<Product> listAllOrderById();

    @Query(value = "SELECT p FROM Product p WHERE p.category = :category ORDER BY p.availability DESC, p.discountedPrice, p.id")
    List<Product> listAllOrderByCategoryProduct(@Param("category") String category);

    @Query(value = "DELETE FROM Product p WHERE p.id = :id")
    void deleteByIdProduct(Long id);

}