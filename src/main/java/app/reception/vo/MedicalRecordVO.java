package app.reception.vo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MedicalRecordVO {
	private int medical_record_id, staff_id, patient_id;
	private String  record_date, record_time, record_day, treatment_date, prescription_name,
					treatment_name, admission, meno, patient, doctor, department_name ; 

}
