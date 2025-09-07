package io.j2234.goods.infraStructure;

import io.j2234.goods.domain.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}
