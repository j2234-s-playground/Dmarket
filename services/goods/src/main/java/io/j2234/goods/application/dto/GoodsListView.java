package io.j2234.goods.application.dto;

public record GoodsListView(
        String goodsId,
        String goodsName,
        String goodsNameEng,
        String thumbnailImageUrl,
        String headDesc,
        Integer normalPrice,
        Integer salesPrice
) {
}
