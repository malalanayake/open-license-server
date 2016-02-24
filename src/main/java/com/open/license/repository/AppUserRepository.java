package com.open.license.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.open.license.model.AppUser;

/**
 * 
 * Distibution under GNU GENERAL PUBLIC LICENSE Version 2, June 1991
 * 
 * @author malalanayake
 * @created Nov 8, 2015 7:47:13 PM
 * 
 * @blog https://malalanayake.wordpress.com/
 */
@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
}
