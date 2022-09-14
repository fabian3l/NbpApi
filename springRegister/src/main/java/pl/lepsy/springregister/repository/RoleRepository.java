package pl.lepsy.springregister.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.lepsy.springregister.Model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    
}
