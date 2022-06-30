package ir.mapsa.CRUDGeneric.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class ClothDTO {
    private long id;
    private String title;
    private List<Size> size;
}
