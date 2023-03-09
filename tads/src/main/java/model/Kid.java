package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter//remember that you have to create the constructors and encapsulation to use the variables into the class
@Data
public class Kid {
//beginning of the definition of the variables
    private String id;
    private String name;
    private byte age;
}//end of boy
