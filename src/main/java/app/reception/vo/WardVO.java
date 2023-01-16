package app.reception.vo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class WardVO {
	int admission_record_id, ward_id, medical_record_id, bed;
	String admission_date, ward_number, doctor_name, department_name,patient_name, discharge_date;


}
