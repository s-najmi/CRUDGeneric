package ir.mapsa.CRUDGeneric.generic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@NoRepositoryBean
public interface IRepositoryGeneric<T, PK> extends JpaRepository<T, PK> {
}
