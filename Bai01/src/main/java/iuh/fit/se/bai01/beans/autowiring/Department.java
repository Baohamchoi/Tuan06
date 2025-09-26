package iuh.fit.se.bai01.beans.autowiring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Department {
    private String id;
    private String name;
    private Faculty faculty;
}
