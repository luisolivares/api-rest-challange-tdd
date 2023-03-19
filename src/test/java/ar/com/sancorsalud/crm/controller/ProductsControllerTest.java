package ar.com.sancorsalud.crm.controller;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.time.Duration;

import static ar.com.sancorsalud.crm.utils.TestUtils.matchJson;
import static ar.com.sancorsalud.crm.utils.TestUtils.matchJsonArray;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProductsControllerTest {

    @Autowired
    private MockMvc mockMvc;

    /**
     * It tests creating a product
     */
    @Test
    @Order(1)
    public void createProduct() throws Exception {

        String json = "{\"id\": 1, \"name\": \"Dressing Gown\", \"category\": \"Full Body Outfits\", \"retail_price\": 303.0, \"discounted_price\": 251.49, \"availability\": true}";

        mockMvc.perform(
                        post("/api/v1/products")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andExpect(status().isCreated());

        json = "{\"id\": 2, \"name\": \"Shoes\", \"category\": \"Footwear\", \"retail_price\": 150.0, \"discounted_price\": 123.0, \"availability\": true}";

        mockMvc.perform(
                        post("/api/v1/products")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andExpect(status().isCreated());

        json = "{\"id\": 3, \"name\": \"Nightgown\", \"category\": \"Full Body Outfits\", \"retail_price\": 307.0, \"discounted_price\": 254.81, \"availability\": true}";

        mockMvc.perform(
                        post("/api/v1/products")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andExpect(status().isCreated());

        json = "{\"id\": 4, \"name\": \"Boots\", \"category\": \"Footwear\", \"retail_price\": 162.0, \"discounted_price\": 132.84, \"availability\": true}";

        mockMvc.perform(
                        post("/api/v1/products")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andExpect(status().isCreated());

        json = "{\"id\": 5, \"name\": \"Ball Gown\", \"category\": \"Full Body Outfits\", \"retail_price\": 337.0, \"discounted_price\": 272.97, \"availability\": true}";

        mockMvc.perform(
                        post("/api/v1/products")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andExpect(status().isCreated());

        json = "{\"id\": 6, \"name\": \"Shawl\", \"category\": \"Accessories\", \"retail_price\": 283.0, \"discounted_price\": 260.36, \"availability\": true}";

        mockMvc.perform(
                        post("/api/v1/products")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andExpect(status().isCreated());

        json = "{\"id\": 7, \"name\": \"Belt\", \"category\": \"Accessories\", \"retail_price\": 471.0, \"discounted_price\": 419.19, \"availability\": true}";

        mockMvc.perform(
                        post("/api/v1/products")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andExpect(status().isCreated());

        json = "{\"id\": 8, \"name\": \"Kaftan\", \"category\": \"Accessories\", \"retail_price\": 237.0, \"discounted_price\": 215.67, \"availability\": true}";

        mockMvc.perform(
                        post("/api/v1/products")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andExpect(status().isCreated());

        json = "{\"id\": 9, \"name\": \"Overalls\", \"category\": \"Full Body Outfits\", \"retail_price\": 374.0, \"discounted_price\": 321.64, \"availability\": true}";

        mockMvc.perform(
                        post("/api/v1/products")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andExpect(status().isCreated());

        json = "{\"id\": 10, \"name\": \"Cufflinks\", \"category\": \"Accessories\", \"retail_price\": 284.0, \"discounted_price\": 247.08, \"availability\": true}";

        mockMvc.perform(
                        post("/api/v1/products")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andExpect(status().isCreated());

        json = "{\"id\": 11, \"name\": \"Cargos\", \"category\": \"Bottoms\", \"retail_price\": 498.0, \"discounted_price\": 428.28, \"availability\": true}";

        mockMvc.perform(
                        post("/api/v1/products")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andExpect(status().isCreated());

        json = "{\"id\": 12, \"name\": \"Poncho\", \"category\": \"Accessories\", \"retail_price\": 280.0, \"discounted_price\": 224.7, \"availability\": true}";

        mockMvc.perform(
                        post("/api/v1/products")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andExpect(status().isCreated());

        json = "{\"id\": 13, \"name\": \"Cummerbund\", \"category\": \"Accessories\", \"retail_price\": 435.0, \"discounted_price\": 400.2, \"availability\": true}";

        mockMvc.perform(
                        post("/api/v1/products")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andExpect(status().isCreated());

        json = "{\"id\": 14, \"name\": \"Dress\", \"category\": \"Full Body Outfits\", \"retail_price\": 175.0, \"discounted_price\": 140.0, \"availability\": true}";

        mockMvc.perform(
                        post("/api/v1/products")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andExpect(status().isCreated());

        json = "{\"id\": 15, \"name\": \"Trainers\", \"category\": \"Footwear\", \"retail_price\": 228.0, \"discounted_price\": 184.68, \"availability\": true}";

        mockMvc.perform(
                        post("/api/v1/products")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andExpect(status().isCreated());

        json = "{\"id\": 16, \"name\": \"Tracksuit\", \"category\": \"Full Body Outfits\", \"retail_price\": 471.0, \"discounted_price\": 423.9, \"availability\": false}";

        mockMvc.perform(
                        post("/api/v1/products")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andExpect(status().isCreated());

        json = "{\"id\": 17, \"name\": \"Tailcoat\", \"category\": \"Full Body Outfits\", \"retail_price\": 307.0, \"discounted_price\": 254.81, \"availability\": true}";

        mockMvc.perform(
                        post("/api/v1/products")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andExpect(status().isCreated());

        json = "{\"id\": 18, \"name\": \"Vest\", \"category\": \"Tops\", \"retail_price\": 446.0, \"discounted_price\": 392.48, \"availability\": true}";

        mockMvc.perform(
                        post("/api/v1/products")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andExpect(status().isCreated());

        json = "{\"id\": 19, \"name\": \"Suit\", \"category\": \"Full Body Outfits\", \"retail_price\": 158.0, \"discounted_price\": 135.88, \"availability\": true}";

        mockMvc.perform(
                        post("/api/v1/products")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andExpect(status().isCreated());

        json = "{\"id\": 20, \"name\": \"Catsuit\", \"category\": \"Full Body Outfits\", \"retail_price\": 158.0, \"discounted_price\": 135.88, \"availability\": true}";

        mockMvc.perform(
                        post("/api/v1/products")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andExpect(status().isCreated());

        json = "{\"id\": 21, \"name\": \"Dungarees\", \"category\": \"Full Body Outfits\", \"retail_price\": 437.0, \"discounted_price\": 362.71, \"availability\": false}";

        mockMvc.perform(
                        post("/api/v1/products")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andExpect(status().isCreated());
    }

    /**
     * It tests creating a product with existing id
     */
    @Test
    @Order(2)
    public void createProductWithExistingId() throws Exception {

        String json = "{\"id\": 1, \"name\": \"Dressing Gown\", \"category\": \"Underwear\", \"retail_price\": 303.0, \"discounted_price\": 251.49, \"availability\": true}";

        mockMvc.perform(
                        post("/api/v1/products")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andExpect(status().isBadRequest());
    }

    /**
     * It tests updating retail price of a product
     */
    @Test
    @Order(3)
    public void updateProductRetailPrice() throws Exception {

        String json = "{\"retail_price\": 325.45, \"discounted_price\": 260.36, \"availability\": true}";

        mockMvc.perform(
                        patch("/api/v1/products/6")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andExpect(status().isNoContent());
    }

    /**
     * It tests updating discount price of a product
     */
    @Test
    @Order(4)
    public void updateProductDiscountPrice() throws Exception {

        String json = "{\"retail_price\": 284.0, \"discounted_price\": 227.2, \"availability\": true}";

        mockMvc.perform(
                        patch("/api/v1/products/10")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andExpect(status().isNoContent());
    }

    /**
     * It tests updating availability of a product
     */
    @Test
    @Order(5)
    public void updateProductAvailability() throws Exception {

        String json = "{\"retail_price\": 150.0, \"discounted_price\": 123.0, \"availability\": false}";

        mockMvc.perform(
                        patch("/api/v1/products/2")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andExpect(status().isNoContent());
    }

    /**
     * It tests updating retail and discount price of a product
     */
    @Test
    @Order(6)
    public void updateProductRetailAndDiscountPrice() throws Exception {

        String json = "{\"retail_price\": 350.0, \"discounted_price\": 283.5, \"availability\": true}";

        mockMvc.perform(
                        patch("/api/v1/products/12")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andExpect(status().isNoContent());
    }

    /**
     * It tests updating retail price and availability of a product
     */
    @Test
    @Order(7)
    public void updateProductRetailPriceAndAvailability() throws Exception {

        String json = "{\"retail_price\": 125.0, \"discounted_price\": 100.0, \"availability\": false}";

        mockMvc.perform(
                        patch("/api/v1/products/19")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andExpect(status().isNoContent());
    }

    /**
     * It tests updating discount price and availability of a product
     */
    @Test
    @Order(8)
    public void updateProductDiscountPriceAndAvailability() throws Exception {

        String json = "{\"retail_price\": 250.0, \"discounted_price\": 200.0, \"availability\": false}";

        mockMvc.perform(
                        patch("/api/v1/products/20")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andExpect(status().isNoContent());
    }

    /**
     * It tests updating retail price, discount price and availability of a product
     */
    @Test
    @Order(9)
    public void updateProductRetailPriceDiscountPriceAndAvailability() throws Exception {

        String json = "{\"retail_price\": 500.0, \"discounted_price\": 450.0, \"availability\": false}";

        mockMvc.perform(
                        patch("/api/v1/products/13")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andExpect(status().isNoContent());
    }

    /**
     * It tests updating availability of non-existing product
     */
    @Test
    @Order(10)
    public void updateAvailabilityOfNonExistingProduct() throws Exception {

        String json = "{\"retail_price\": 311.0, \"discounted_price\": 258.13, \"availability\": true}";

        mockMvc.perform(
                        patch("/api/v1/products/25")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(json)
                )
                .andExpect(status().isBadRequest());
    }

    /**
     * It tests finding a product by id
     */
    @Test
    @Order(11)
    public void findProductById() throws Exception {

        String res = "{\"id\": 2, \"name\": \"Shoes\", \"category\": \"Footwear\", \"retail_price\": 150.0, \"discounted_price\": 123.0, \"availability\": false}";

        assertTrue(
                matchJson(
                        mockMvc.perform(get("/api/v1/products/2"))
                                .andExpect(status().isOk())
                                .andReturn()
                                .getResponse()
                                .getContentAsString(),
                        res,
                        true
                )
        );
    }

    /**
     * It tests finding a non existing product
     */
    @Test
    @Order(12)
    public void findProductByNonExistingId() throws Exception {

        mockMvc.perform(get("/api/v1/products/25"))
                .andExpect(status().isNotFound());
    }

    /**
     * It tests finding products belonging to Accessories category
     */
    @Test
    @Order(13)
    public void findProductsByCategory() throws Exception {

        String res = "[{\"id\": 8, \"name\": \"Kaftan\", \"category\": \"Accessories\", \"retail_price\": 237.0, \"discounted_price\": 215.67, \"availability\": true}, {\"id\": 10, \"name\": \"Cufflinks\", \"category\": \"Accessories\", \"retail_price\": 284.0, \"discounted_price\": 227.2, \"availability\": true}, {\"id\": 6, \"name\": \"Shawl\", \"category\": \"Accessories\", \"retail_price\": 325.45, \"discounted_price\": 260.36, \"availability\": true}, {\"id\": 12, \"name\": \"Poncho\", \"category\": \"Accessories\", \"retail_price\": 350.0, \"discounted_price\": 283.5, \"availability\": true}, {\"id\": 7, \"name\": \"Belt\", \"category\": \"Accessories\", \"retail_price\": 471.0, \"discounted_price\": 419.19, \"availability\": true}, {\"id\": 13, \"name\": \"Cummerbund\", \"category\": \"Accessories\", \"retail_price\": 500.0, \"discounted_price\": 450.0, \"availability\": false}]";

        assertTrue(
                matchJsonArray(
                        mockMvc.perform(get("/api/v1/products?category=Accessories"))
                                .andExpect(status().isOk())
                                .andReturn()
                                .getResponse()
                                .getContentAsString(),
                        res,
                        true
                )
        );
    }

    /**
     * It tests finding products belonging to Swimwear category
     */
    @Test
    @Order(14)
    public void findProductsByNonExistingCategory() throws Exception {

        String res = "[]";

        assertTrue(
                matchJsonArray(
                        mockMvc.perform(get("/api/v1/products?category=Swimwear"))
                                .andExpect(status().isOk())
                                .andReturn()
                                .getResponse()
                                .getContentAsString(),
                        res,
                        true
                )
        );
    }

    /**
     * It tests finding all products
     */
    @Test
    @Order(15)
    public void findAllProducts() throws Exception {

        String res = "[{\"id\": 1, \"name\": \"Dressing Gown\", \"category\": \"Full Body Outfits\", \"retail_price\": 303.0, \"discounted_price\": 251.49, \"availability\": true}, {\"id\": 2, \"name\": \"Shoes\", \"category\": \"Footwear\", \"retail_price\": 150.0, \"discounted_price\": 123.0, \"availability\": false}, {\"id\": 3, \"name\": \"Nightgown\", \"category\": \"Full Body Outfits\", \"retail_price\": 307.0, \"discounted_price\": 254.81, \"availability\": true}, {\"id\": 4, \"name\": \"Boots\", \"category\": \"Footwear\", \"retail_price\": 162.0, \"discounted_price\": 132.84, \"availability\": true}, {\"id\": 5, \"name\": \"Ball Gown\", \"category\": \"Full Body Outfits\", \"retail_price\": 337.0, \"discounted_price\": 272.97, \"availability\": true}, {\"id\": 6, \"name\": \"Shawl\", \"category\": \"Accessories\", \"retail_price\": 325.45, \"discounted_price\": 260.36, \"availability\": true}, {\"id\": 7, \"name\": \"Belt\", \"category\": \"Accessories\", \"retail_price\": 471.0, \"discounted_price\": 419.19, \"availability\": true}, {\"id\": 8, \"name\": \"Kaftan\", \"category\": \"Accessories\", \"retail_price\": 237.0, \"discounted_price\": 215.67, \"availability\": true}, {\"id\": 9, \"name\": \"Overalls\", \"category\": \"Full Body Outfits\", \"retail_price\": 374.0, \"discounted_price\": 321.64, \"availability\": true}, {\"id\": 10, \"name\": \"Cufflinks\", \"category\": \"Accessories\", \"retail_price\": 284.0, \"discounted_price\": 227.2, \"availability\": true}, {\"id\": 11, \"name\": \"Cargos\", \"category\": \"Bottoms\", \"retail_price\": 498.0, \"discounted_price\": 428.28, \"availability\": true}, {\"id\": 12, \"name\": \"Poncho\", \"category\": \"Accessories\", \"retail_price\": 350.0, \"discounted_price\": 283.5, \"availability\": true}, {\"id\": 13, \"name\": \"Cummerbund\", \"category\": \"Accessories\", \"retail_price\": 500.0, \"discounted_price\": 450.0, \"availability\": false}, {\"id\": 14, \"name\": \"Dress\", \"category\": \"Full Body Outfits\", \"retail_price\": 175.0, \"discounted_price\": 140.0, \"availability\": true}, {\"id\": 15, \"name\": \"Trainers\", \"category\": \"Footwear\", \"retail_price\": 228.0, \"discounted_price\": 184.68, \"availability\": true}, {\"id\": 16, \"name\": \"Tracksuit\", \"category\": \"Full Body Outfits\", \"retail_price\": 471.0, \"discounted_price\": 423.9, \"availability\": false}, {\"id\": 17, \"name\": \"Tailcoat\", \"category\": \"Full Body Outfits\", \"retail_price\": 307.0, \"discounted_price\": 254.81, \"availability\": true}, {\"id\": 18, \"name\": \"Vest\", \"category\": \"Tops\", \"retail_price\": 446.0, \"discounted_price\": 392.48, \"availability\": true}, {\"id\": 19, \"name\": \"Suit\", \"category\": \"Full Body Outfits\", \"retail_price\": 125.0, \"discounted_price\": 100.0, \"availability\": false}, {\"id\": 20, \"name\": \"Catsuit\", \"category\": \"Full Body Outfits\", \"retail_price\": 250.0, \"discounted_price\": 200.0, \"availability\": false}, {\"id\": 21, \"name\": \"Dungarees\", \"category\": \"Full Body Outfits\", \"retail_price\": 437.0, \"discounted_price\": 362.71, \"availability\": false}]";

        assertTrue(
                matchJsonArray(
                        mockMvc.perform(get("/api/v1/products"))
                                .andExpect(status().isOk())
                                .andReturn()
                                .getResponse()
                                .getContentAsString(),
                        res,
                        true
                )
        );
    }

    /**
     * It tests a long operation in an asynchronous fashion
     */
    @Test
    @Order(16)
    public void longOperation() {
        assertTimeoutPreemptively(Duration.ofMillis(500), () -> {
            mockMvc.perform(post("/api/v1/products/job"))
                    .andExpect(status().isAccepted());
        });
    }

    /**
     * It tests a long operation in an asynchronous fashion
     */
    @Test
    @Order(17)
    public void deleteProductById() throws Exception {
        mockMvc.perform(delete("/api/v1/products/21"))
                .andExpect(status().isNoContent());
    }

    /**
     * It tests a long operation in an asynchronous fashion
     */
    @Test
    @Order(18)
    public void deleteOfNonExistingProduct() throws Exception {
        mockMvc.perform(delete("/api/v1/products/25"))
                .andExpect(status().isBadRequest());
    }

}