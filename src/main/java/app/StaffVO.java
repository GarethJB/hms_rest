package app;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class StaffVO {

    private int staff_id, department_id, staff_level;
    private String name;
    
}