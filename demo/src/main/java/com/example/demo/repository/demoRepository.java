package com.example.demo.repository;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modal.domoModal;

public interface demoRepository extends JpaRepository<domoModal ,UUID> {

}
