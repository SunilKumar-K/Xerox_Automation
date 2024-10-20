package com.xerox_app.application.service;
import com.xerox_app.application.model.Shop;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ShopService {
    private Map<String, Shop> shops = new HashMap<>();

    public Shop createShop(Shop shop) {
        shops.put(shop.getId(), shop);
        return shop;
    }

    public Shop getShop(String shopId) {
        return shops.get(shopId);
    }

    public List<Shop> getAllShops() {
        return new ArrayList<>(shops.values());
    }

    public Shop updateShop(String shopId, Shop updatedShop) {
        if (shops.containsKey(shopId)) {
            updatedShop.setId(shopId);
            shops.put(shopId, updatedShop);
            return updatedShop;
        }
        return null;
    }

    public boolean deleteShop(String shopId) {
        return shops.remove(shopId) != null;
    }
}