package io.j2234.goods.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Sex {
    MAN("남"),
    WOMAN("여"),
    UNISEX("공용");

    private final String label;
}
