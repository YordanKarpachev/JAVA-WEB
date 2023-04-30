package bg.softuni.mobilele.model.entiti;

import bg.softuni.mobilele.model.entiti.enums.CategoryEnums;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity(name = "models")
public class ModelEntity extends BaseEntity {

    @Enumerated(EnumType.STRING)
   private CategoryEnums category;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "start_year")
    private int startYear;

    @Column(name = "end_year")
    private int endYear;

    private String brand;
}
