package ir.mapsa.CRUDGeneric.generic;

import java.util.Collection;
import java.util.Optional;

public interface IServiceGeneric<T, D, PK> {
    void save(D dto);
    Optional<D> getByID(PK id);
    Collection<D> findAll();
}
