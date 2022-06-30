package ir.mapsa.CRUDGeneric.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@Table(name = "tbl_cloth")
public class Cloth {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Column(name = "title")
    private String title;

    @ElementCollection(targetClass = Size.class)
    @CollectionTable(name = "tbl_size")
    private List<Size> size;
}
