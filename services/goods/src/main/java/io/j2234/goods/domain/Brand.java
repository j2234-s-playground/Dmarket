package io.j2234.goods.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "brand_info")
@Entity
@NoArgsConstructor
@Getter
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 내부 식별자

    @Column(name = "brand", nullable = false, unique = true, length = 100)
    private String brand; // 브랜드 식별 슬러그

    @Column(name = "brand_name", nullable = false, length = 200)
    private String brandName; // 국문명

    @Column(name = "brand_english_name", nullable = false, length = 200)
    private String brandEnglishName; // 영문명

    @Column(name = "brand_nation_code", length = 50)
    private String brandNationCode; // 국가 코드

    @Column(name = "brand_nation_name", length = 100)
    private String brandNationName; // 국문 국가명

    @Column(name = "brand_nation_english_name", length = 100)
    private String brandNationEnglishName; // 영문 국가명

    @Column(name = "brand_logo_image", length = 500)
    private String brandLogoImage; // 로고 이미지 URL

    @Column(name = "brand_white_logo_image", length = 500)
    private String brandWhiteLogoImage; // 흰색 로고 이미지 URL

    @Column(name = "since_year")
    private Integer sinceYear; // 설립연도

    @Lob
    @Column(name = "memo")
    private String memo; // 브랜드 소개 문구
}
