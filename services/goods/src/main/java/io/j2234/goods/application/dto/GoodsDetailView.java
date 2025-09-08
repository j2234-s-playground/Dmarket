package io.j2234.goods.application.dto;

public record GoodsDetailView(
        Long goodsId,
        String goodsName,
        String goodsNameEng,
        String thumbnailImageUrl,
        String headDesc,
        String brandId,
        String brandName,
        String goodsContents,
        String mdOpinion,
        Integer normalPrice,
        Integer salesPrice
        
) {
}
