package gameObjects.dice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DiceTest {

    @Test
    void rollTwoDice() {
        // Given
        final var subject = new Dice();

        // When
        final var result = subject.rollTwoDice();

        // Then
        assertTrue(isBetween1And6(result.rollOne));
    }

    private boolean isBetween1And6(final int eyes){
        return (eyes > 0 && eyes < 7);
    }
}