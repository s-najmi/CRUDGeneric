package ir.mapsa.CRUDGeneric.Imp;

import ir.mapsa.CRUDGeneric.entity.Cloth;
import ir.mapsa.CRUDGeneric.generic.IRepositoryGeneric;
import org.springframework.stereotype.Repository;

@Repository
public interface IClothRepository extends IRepositoryGeneric<Cloth, Long> {
}
