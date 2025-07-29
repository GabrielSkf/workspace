package com.fullcycle.admin.catalogo.application.category.delete;

public record DeleteCategoryCommand(
        String id,
        String name,
        String description,
        boolean isActive
) {
    public static DeleteCategoryCommand with(
            final String anId,
            final String aName,
            final String aDescription,
            final boolean isActive
    ) {
        return new DeleteCategoryCommand(anId, aName, aDescription, isActive);
    }

}
