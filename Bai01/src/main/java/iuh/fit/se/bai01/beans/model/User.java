package iuh.fit.se.bai01.beans.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private int id;
    private String userName;
    private String password;
    private Group group;
}
