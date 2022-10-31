package curdproject.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import curdproject.controller.Registeration;

@Repository
public interface JpaRepo extends JpaRepository<Registeration, Integer>{


}
