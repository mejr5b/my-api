package org.launchcode.cheeseapi.repository;
import org.launchcode.cheeseapi.model.Cheese;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheeseRepository extends JpaRepository<Cheese, Long>
{

}

