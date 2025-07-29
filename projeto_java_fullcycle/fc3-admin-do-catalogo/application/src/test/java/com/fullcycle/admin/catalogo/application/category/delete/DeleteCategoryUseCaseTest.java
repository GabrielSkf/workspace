package com.fullcycle.admin.catalogo.application.category.delete;

import com.fullcycle.admin.catalogo.application.category.update.DefaultUpdateCategoryUseCase;
import com.fullcycle.admin.catalogo.application.category.update.UpdateCategoryCommand;
import com.fullcycle.admin.catalogo.domain.category.Category;
import com.fullcycle.admin.catalogo.domain.category.CategoryGateway;
import com.fullcycle.admin.catalogo.domain.category.CategoryID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Objects;
import java.util.Optional;

import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class DeleteCategoryUseCaseTest {

    @InjectMocks
    private DefaultDeleteCategoryUseCase useCase;

    @Mock
    private CategoryGateway categoryGateway;

    @BeforeEach
    void cleanUp() {
        Mockito.reset(categoryGateway);
    }

    // 1. teste do caminho feliz
    // 2. teste passando um propriedade invalida
    // 3. teste simulando um erro do gateway

    @Test
    public void givenAValidId_whenCallsDeleteCategory_shouldReturnOK() {
        final var aCategory =
                Category.newCategory("Film", "A Categoria mais assistida", true);

        final var expectedId = aCategory.getId();

        doNothing().when(categoryGateway).deleteById(eq(expectedId));

        Assertions.assertDoesNotThrow(() -> useCase.execute(expectedId.getValue()));

        verify(categoryGateway, times(1)).deleteById(eq(expectedId));
    }


    @Test
    public void givenAnInvalidId_whenCallsDeleteCategory_shouldBeOK() {
        final var expectedId = CategoryID.from("123");

        doNothing().when(categoryGateway).deleteById(eq(expectedId));

        Assertions.assertDoesNotThrow(() -> useCase.execute(expectedId.getValue()));

        verify(categoryGateway, times(1)).deleteById(eq(expectedId));
    }

    @Test
    public void givenAValidId_whenGatewayThrowsException_shouldReturnException() {
        final var aCategory =
                Category.newCategory("Film", "A Categoria mais assistida", true);

        final var expectedId = aCategory.getId();

        doThrow(new IllegalStateException("Gateway Error")).when(categoryGateway).deleteById(eq(expectedId));

        Assertions.assertThrows(IllegalStateException.class, () -> useCase.execute(expectedId.getValue()));

        verify(categoryGateway, times(1)).deleteById(eq(expectedId));
    }
}
