package in.course.service.sc.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "COURSE")
@ToString
public class Course implements Serializable {

    @Id
    private String courseId;
    private String courseName;
    private String courseType;
    private BigDecimal fee;
}
