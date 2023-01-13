package app.staff.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class StaffVO {

    private int staff_id, department_id, staff_level;
    private String name, department_name;
    
}