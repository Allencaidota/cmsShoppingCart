package com.allen.cmsshoppingcart.models;

import com.allen.cmsshoppingcart.models.data.Admin;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

    Admin findByUsername(String username);
}
