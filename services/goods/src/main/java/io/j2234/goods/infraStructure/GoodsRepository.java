package io.j2234.goods.infraStructure;

import io.j2234.goods.domain.GoodsInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsRepository extends JpaRepository<GoodsInfo, Long>, GoodsRepositoryCustom {
}
