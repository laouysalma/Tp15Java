// Interface fonctionnelle qui peut lancer une exception

import java.io.IOException;
import java.util.function.Function;

@FunctionalInterface
interface IOFunction<T, R> {
    R apply(T t) throws IOException;
    
    // Méthode utilitaire pour transformer en Function standard
    static <T, R> Function<T, R> unchecked(IOFunction<T, R> f) {
        return t -> {
            try {
                return f.apply(t);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };
    }
}