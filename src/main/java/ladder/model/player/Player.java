package ladder.model.player;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public class Player {
    private static final int MAX_NAME_LENGTH = 5;
    private final String name;
    private int position;

    public Player(String name, int position) {
        if (!isValidName(name)) {
            throw new IllegalArgumentException("올바르지 않은 이름입니다.");
        }
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }

    private boolean isValidName(String name) {
        return (!StringUtils.isBlank(name)) && (name.length() <= MAX_NAME_LENGTH);
    }

    public void moveLeft() {
        this.position--;
    }

    public void moveRight() {
        this.position++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
