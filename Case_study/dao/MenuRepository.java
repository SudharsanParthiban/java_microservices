package com.restraunt.Menu.dao;

import org.springframework.stereotype.Repository;

import com.restraunt.Menu.model.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu,String>{

}