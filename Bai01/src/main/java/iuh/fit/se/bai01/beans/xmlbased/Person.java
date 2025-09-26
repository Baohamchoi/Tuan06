package iuh.fit.se.bai01.beans.xmlbased;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Person {
    private int age;
    private List<Address> addresses;
    private List<String> emails;
    private String name;
}
