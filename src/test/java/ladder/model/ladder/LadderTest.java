package ladder.model.ladder;

import ladder.model.linepointsgenerator.impl.CustomLinePointsGenerator;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LadderTest {

    @Test
    void 올바른_사다리_높이일_때_생성자_확인() {
        assertDoesNotThrow(() -> new Ladder(new CustomLinePointsGenerator(Arrays.asList(new Point(true))), 1));
    }

    @Test
    void _1보다_작은_사다리_높이일_때_예외발생() {
        assertThrows(IllegalArgumentException.class, () -> new Ladder(new CustomLinePointsGenerator(Arrays.asList(new Point(true))), 0));
    }
}
