package com.creativo.collaborator.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.creativo.collaborator.model.Role;
import com.creativo.collaborator.model.RoleName;

/**
 *  Created by Stuti Rastogi on 01/08/19.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
