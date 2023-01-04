package app.staff.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class PatientVO {
	
    private int patient_id, height, weight, social_id;
    private String name, gender, phone_number, blood_type, allergy, underlying_disease, memo;

}
