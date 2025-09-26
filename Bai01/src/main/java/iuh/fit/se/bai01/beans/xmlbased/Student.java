package iuh.fit.se.bai01.beans.xmlbased;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Student {
    private long id;
    private String name;
    private Class_ class_;
}
