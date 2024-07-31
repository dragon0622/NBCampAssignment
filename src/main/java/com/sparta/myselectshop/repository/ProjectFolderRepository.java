package com.sparta.myselectshop.repository;

import com.sparta.myselectshop.entity.ProductFolder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectFolderRepository extends JpaRepository<ProductFolder, Long> {
}
