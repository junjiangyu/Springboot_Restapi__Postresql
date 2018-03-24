package com.example.demo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userrepository extends JpaRepository<User,String>
{

}
