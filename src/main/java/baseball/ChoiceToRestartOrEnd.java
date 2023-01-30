package baseball;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum ChoiceToRestartOrEnd {
    RESTART("1") {
        @Override
        void proceed(Game game) {
            game.start();
        }
    },
    END("2") {
        @Override
        void proceed(Game game) {
            game.end();
        }
    };

    ChoiceToRestartOrEnd(String choice) {
        this.choice = choice;
    }

    abstract void proceed(Game game);

    private String choice;
    private static final Map<String, String> CODE_MAP = Collections.unmodifiableMap(
            Stream.of(values()).collect(Collectors.toMap(ChoiceToRestartOrEnd::getCode, ChoiceToRestartOrEnd::name)));

    private String getCode() {
        return this.choice;
    }

    public static ChoiceToRestartOrEnd of(String code) {
        return ChoiceToRestartOrEnd.valueOf(CODE_MAP.get(code));
    }
}
