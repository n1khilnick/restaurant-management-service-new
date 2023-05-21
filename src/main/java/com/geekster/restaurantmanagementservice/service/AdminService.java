package com.geekster.restaurantmanagementservice.service;

import com.geekster.restaurantmanagementservice.model.Admin;
import com.geekster.restaurantmanagementservice.repositories.IAdminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    IAdminDao adminDao;

//    @Autowired
//    FoodService foodService;
//
    public void addAdmin(Admin admin) {
        adminDao.save(admin);
    }
//
//    public void createFood(String adminEmail, Food food) {
//        Admin admin =  adminDao.findAdminByAdminEmail(adminEmail);
//
//        if(admin == null){
//            throw new IllegalStateException("Admin doesn't exists !!");
//        }
//        else{
//            foodService.addFood(adminEmail, food);
//        }
//    }

//    public void removeFood(String adminEmail, Long foodId) {
//        Admin admin =  adminDao.findAdminByAdminEmail(adminEmail);
//
//        if(admin == null){
//            throw new IllegalStateException("Admin doesn't exists !!");
//        }
//        foodService.deleteFoodById(foodId);
//    }
}
