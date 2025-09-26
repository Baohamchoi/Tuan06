package iuh.fit.se.bai01.beans.xmlbased;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Address {
    private String city;
    private String country;
    private String street;
}
