package io.j2234.goods.application;

import io.j2234.goods.infraStructure.BrandRepository;
import io.j2234.goods.infraStructure.GoodsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class GoodsQueryService {

    private final GoodsRepository goodsRepository;

    private final BrandRepository brandRepository;

    
}
