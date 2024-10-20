package com.xerox_app.application.controller;
import com.xerox_app.application.model.Shop;
import com.xerox_app.application.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/shops")
public class ShopController {
    @Autowired
    private ShopService shopService;

    @PostMapping
    public ResponseEntity<Shop> createShop(@RequestBody Shop shop) {
        Shop createdShop = shopService.createShop(shop);
        return ResponseEntity.ok(createdShop);
    }

    @GetMapping("/{shopId}")
    public ResponseEntity<Shop> getShop(@PathVariable String shopId) {
        Shop shop = shopService.getShop(shopId);
        return shop != null ? ResponseEntity.ok(shop) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public List<Shop> getAllShops() {
        return shopService.getAllShops();
    }

    @PutMapping("/{shopId}")
    public ResponseEntity<Shop> updateShop(@PathVariable String shopId, @RequestBody Shop shop) {
        Shop updatedShop = shopService.updateShop(shopId, shop);
        return updatedShop != null ? ResponseEntity.ok(updatedShop) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{shopId}")
    public ResponseEntity<Void> deleteShop(@PathVariable String shopId) {
        boolean deleted = shopService.deleteShop(shopId);
        return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}