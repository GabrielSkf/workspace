package com.fullcycle.admin.catalogo.application.category.delete;

import com.fullcycle.admin.catalogo.domain.category.Category;
import com.fullcycle.admin.catalogo.domain.category.CategoryID;

public record DeleteCategoryOutput(
        CategoryID id
) {
    public static DeleteCategoryOutput from(final Category aCategory) {
        return new DeleteCategoryOutput(aCategory.getId());
    }
}
