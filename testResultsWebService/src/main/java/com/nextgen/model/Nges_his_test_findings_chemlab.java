package com.nextgen.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "nges_his_test_findings_chemlab")
public class Nges_his_test_findings_chemlab implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5583539223597316451L;

	/* */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "batch_nr")
	private Integer batch_nr;

	@Column(name = "encounter_nr")
	private String encounter_nr;

	@Column(name = "job_id")
	private String job_id;

	@Column(name = "item_nr")
	private int item_nr;

	@Column(name = "test_name")
	private String test_name;

	@Column(name = "test_date")
	@Temporal(TemporalType.DATE)
	private java.util.Date test_date;

	@Column(name = "test_time")
	/*@Temporal(TemporalType.TIME)*/
	private java.sql.Time test_time;

	@Column(name = "group_id")
	private String group_id;

	@Column(name = "serial_value", length = 65535)
	private String serial_value;

	@Column(name = "validator")
	private String validator;

	@Column(name = "validate_dt")
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date validate_dt;

	@Column(name = "status")
	private String status;

	@Column(name = "history", length = 65535)
	private String history;

	@Column(name = "create_id")
	private String create_id;

	@Column(name = "create_time")
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date create_time;

	@Column(name = "modify_id")
	private String modify_id;

	@Column(name = "modify_time")
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date modify_time;

	@Column(name = "sample_time")
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date sample_time;

	@Column(name = "sample_by")
	private String sample_by;

	@Column(name = "sample_accept_time")
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date sample_accept_time;

	@Column(name = "sample_accept_by")
	private String sample_accept_by;

	@Column(name = "result_time")
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date result_time;

	@Column(name = "result_by")
	private String result_by;

	@Column(name = "ini_approve_time")
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date ini_approve_time;

	@Column(name = "ini_approve_by")
	private String ini_approve_by;

	@Column(name = "approve_time")
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date approve_time;

	@Column(name = "approve_by")
	private String approve_by;

	@Column(name = "location_nr")
	private String location_nr;

	@Column(name = "counter_nr")
	private String counter_nr;

	@Column(name = "request_nr")
	private int request_nr;

	@Column(name = "inter_job_id")
	private String inter_job_id;

	@Column(name = "serial_nr", length = 65535)
	private String serial_nr;

	@Column(name = "is_panic", length = 65535)
	private String is_panic;

	@Column(name = "pid")
	private String pid;

	@Column(name = "kit_nr")
	private int kit_nr;

	@Column(name = "test_parent_nr")
	private int test_parent_nr;

	@Column(name = "sort_nr")
	private int sort_nr;

	@Column(name = "manual_sample_number")
	private String manual_sample_number;

	@Column(name = "patient_type")
	private int patient_type;

	@Column(name = "sample_rejected_history")
	private String sample_rejected_history;

	@Column(name = "sample_nr")
	private String sample_nr;

	@Column(name = "is_printed")
	private int is_printed;

	@Column(name = "template_data", length = 65535)
	private String template_data;

	@Column(name = "ward_nr")
	private int ward_nr;

	@Column(name = "is_emergency")
	private int is_emergency;

	@Column(name = "doctor_advise", length = 65535)
	private String doctor_advise;

	@Column(name = "uploaded_files", length = 65535)
	private String uploaded_files;

	@Column(name = "seprate_entry", length = 65535)
	private String seprate_entry;

	@Column(name = "interpretation_data", length = 65535)
	private String interpretation_data;

	public java.util.Date getTest_time() {
		return test_time;
	}

	public void setTest_time(java.sql.Time test_time) {
		this.test_time = test_time;
	}

	public java.util.Date getValidate_dt() {
		return validate_dt;
	}

	public void setValidate_dt(java.util.Date validate_dt) {
		this.validate_dt = validate_dt;
	}

	public java.util.Date getSample_time() {
		return sample_time;
	}

	public void setSample_time(java.util.Date sample_time) {
		this.sample_time = sample_time;
	}

	public java.util.Date getSample_accept_time() {
		return sample_accept_time;
	}

	public void setSample_accept_time(java.util.Date sample_accept_time) {
		this.sample_accept_time = sample_accept_time;
	}

	public java.util.Date getResult_time() {
		return result_time;
	}

	public void setResult_time(java.util.Date result_time) {
		this.result_time = result_time;
	}

	public java.util.Date getIni_approve_time() {
		return ini_approve_time;
	}

	public void setIni_approve_time(java.util.Date ini_approve_time) {
		this.ini_approve_time = ini_approve_time;
	}

	public java.util.Date getApprove_time() {
		return approve_time;
	}

	public void setApprove_time(java.util.Date approve_time) {
		this.approve_time = approve_time;
	}

	public String getSerial_value() {
		return serial_value;
	}

	public void setSerial_value(String serial_value) {
		this.serial_value = serial_value;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public String getSerial_nr() {
		return serial_nr;
	}

	public void setSerial_nr(String serial_nr) {
		this.serial_nr = serial_nr;
	}

	public String getIs_panic() {
		return is_panic;
	}

	public void setIs_panic(String is_panic) {
		this.is_panic = is_panic;
	}

	public String getTemplate_data() {
		return template_data;
	}

	public void setTemplate_data(String template_data) {
		this.template_data = template_data;
	}

	public String getDoctor_advise() {
		return doctor_advise;
	}

	public void setDoctor_advise(String doctor_advise) {
		this.doctor_advise = doctor_advise;
	}

	public String getUploaded_files() {
		return uploaded_files;
	}

	public void setUploaded_files(String uploaded_files) {
		this.uploaded_files = uploaded_files;
	}

	public String getSeprate_entry() {
		return seprate_entry;
	}

	public void setSeprate_entry(String seprate_entry) {
		this.seprate_entry = seprate_entry;
	}

	public String getInterpretation_data() {
		return interpretation_data;
	}

	public void setInterpretation_data(String interpretation_data) {
		this.interpretation_data = interpretation_data;
	}

	public String getEncounter_nr() {
		return encounter_nr;
	}

	public void setEncounter_nr(String encounter_nr) {
		this.encounter_nr = encounter_nr;
	}

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}

	public int getItem_nr() {
		return item_nr;
	}

	public void setItem_nr(int item_nr) {
		this.item_nr = item_nr;
	}

	public String getTest_name() {
		return test_name;
	}

	public void setTest_name(String test_name) {
		this.test_name = test_name;
	}

	public java.util.Date getTest_date() {
		return test_date;
	}

	public void setTest_date(java.util.Date test_date) {
		this.test_date = test_date;
	}

	public String getGroup_id() {
		return group_id;
	}

	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}

	public String getValidator() {
		return validator;
	}

	public void setValidator(String validator) {
		this.validator = validator;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreate_id() {
		return create_id;
	}

	public void setCreate_id(String create_id) {
		this.create_id = create_id;
	}

	public java.util.Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(java.util.Date create_time) {
		this.create_time = create_time;
	}

	public String getModify_id() {
		return modify_id;
	}

	public void setModify_id(String modify_id) {
		this.modify_id = modify_id;
	}

	public java.util.Date getModify_time() {
		return modify_time;
	}

	public void setModify_time(java.util.Date modify_time) {
		this.modify_time = modify_time;
	}

	public String getSample_by() {
		return sample_by;
	}

	public void setSample_by(String sample_by) {
		this.sample_by = sample_by;
	}

	public String getSample_accept_by() {
		return sample_accept_by;
	}

	public void setSample_accept_by(String sample_accept_by) {
		this.sample_accept_by = sample_accept_by;
	}

	public String getResult_by() {
		return result_by;
	}

	public void setResult_by(String result_by) {
		this.result_by = result_by;
	}

	public String getIni_approve_by() {
		return ini_approve_by;
	}

	public void setIni_approve_by(String ini_approve_by) {
		this.ini_approve_by = ini_approve_by;
	}

	public String getApprove_by() {
		return approve_by;
	}

	public void setApprove_by(String approve_by) {
		this.approve_by = approve_by;
	}

	public String getLocation_nr() {
		return location_nr;
	}

	public void setLocation_nr(String location_nr) {
		this.location_nr = location_nr;
	}

	public String getCounter_nr() {
		return counter_nr;
	}

	public void setCounter_nr(String counter_nr) {
		this.counter_nr = counter_nr;
	}

	public int getRequest_nr() {
		return request_nr;
	}

	public void setRequest_nr(int request_nr) {
		this.request_nr = request_nr;
	}

	public String getInter_job_id() {
		return inter_job_id;
	}

	public void setInter_job_id(String inter_job_id) {
		this.inter_job_id = inter_job_id;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public int getKit_nr() {
		return kit_nr;
	}

	public void setKit_nr(int kit_nr) {
		this.kit_nr = kit_nr;
	}

	public int getTest_parent_nr() {
		return test_parent_nr;
	}

	public void setTest_parent_nr(int test_parent_nr) {
		this.test_parent_nr = test_parent_nr;
	}

	public int getSort_nr() {
		return sort_nr;
	}

	public void setSort_nr(int sort_nr) {
		this.sort_nr = sort_nr;
	}

	public String getManual_sample_number() {
		return manual_sample_number;
	}

	public void setManual_sample_number(String manual_sample_number) {
		this.manual_sample_number = manual_sample_number;
	}

	public int getPatient_type() {
		return patient_type;
	}

	public void setPatient_type(int patient_type) {
		this.patient_type = patient_type;
	}

	public String getSample_rejected_history() {
		return sample_rejected_history;
	}

	public void setSample_rejected_history(String sample_rejected_history) {
		this.sample_rejected_history = sample_rejected_history;
	}

	public String getSample_nr() {
		return sample_nr;
	}

	public void setSample_nr(String sample_nr) {
		this.sample_nr = sample_nr;
	}

	public int getIs_printed() {
		return is_printed;
	}

	public void setIs_printed(int is_printed) {
		this.is_printed = is_printed;
	}

	public int getWard_nr() {
		return ward_nr;
	}

	public void setWard_nr(int ward_nr) {
		this.ward_nr = ward_nr;
	}

	public int getIs_emergency() {
		return is_emergency;
	}

	public void setIs_emergency(int is_emergency) {
		this.is_emergency = is_emergency;
	}

	public Integer getBatch_nr() {
		return batch_nr;
	}

	public void setBatch_nr(Integer batch_nr) {
		this.batch_nr = batch_nr;
	}

	@Override
	public String toString() {
		return "Nges_his_test_findings_chemlab [batch_nr=" + batch_nr + ", encounter_nr=" + encounter_nr + ", job_id="
				+ job_id + ", item_nr=" + item_nr + ", test_name=" + test_name + ", test_date=" + test_date
				+ ", test_time=" + test_time + ", group_id=" + group_id + ", serial_value=" + serial_value
				+ ", validator=" + validator + ", validate_dt=" + validate_dt + ", status=" + status + ", history="
				+ history + ", create_id=" + create_id + ", create_time=" + create_time + ", modify_id=" + modify_id
				+ ", modify_time=" + modify_time + ", sample_time=" + sample_time + ", sample_by=" + sample_by
				+ ", sample_accept_time=" + sample_accept_time + ", sample_accept_by=" + sample_accept_by
				+ ", result_time=" + result_time + ", result_by=" + result_by + ", ini_approve_time=" + ini_approve_time
				+ ", ini_approve_by=" + ini_approve_by + ", approve_time=" + approve_time + ", approve_by=" + approve_by
				+ ", location_nr=" + location_nr + ", counter_nr=" + counter_nr + ", request_nr=" + request_nr
				+ ", inter_job_id=" + inter_job_id + ", serial_nr=" + serial_nr + ", is_panic=" + is_panic + ", pid="
				+ pid + ", kit_nr=" + kit_nr + ", test_parent_nr=" + test_parent_nr + ", sort_nr=" + sort_nr
				+ ", manual_sample_number=" + manual_sample_number + ", patient_type=" + patient_type
				+ ", sample_rejected_history=" + sample_rejected_history + ", sample_nr=" + sample_nr + ", is_printed="
				+ is_printed + ", template_data=" + template_data + ", ward_nr=" + ward_nr + ", is_emergency="
				+ is_emergency + ", doctor_advise=" + doctor_advise + ", uploaded_files=" + uploaded_files
				+ ", seprate_entry=" + seprate_entry + ", interpretation_data=" + interpretation_data + "]";
	}
	
	

}
