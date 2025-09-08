package io.j2234.goods.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "goods_info")
@Entity
@NoArgsConstructor
@Getter
public class GoodsInfo {

    @Id
    private Long id;

    @Column(name = "goods_nm", nullable = false)
    private String goodsName;

    @Column(name = "goods_nm_eng")
    private String goodsNameEng;

    @Column(name = "thumbnail_image_url")
    private String thumbnailImageUrl;

    @Column(name = "head_desc")
    private String headDesc;

    @Column(name = "sex_code")
    @Enumerated(value = EnumType.STRING)
    private Sex sex;

    @Column(name = "brand_id") // Brand 연관
    private Long brandId;

    @Column(name = "com_id", length = 100)
    private String comId;

    @Column(name = "base_category_full_path", length = 500)
    private String baseCategoryFullPath;

    @Lob
    @Column(name = "goods_contents")
    private String goodsContents;

    @Column(name = "md_opinion")
    private String mdOpinion;

    @Column(name = "normal_price", nullable = false)
    private Integer normalPrice;

    @Column(name = "sales_price")
    private Integer salesPrice;

}
