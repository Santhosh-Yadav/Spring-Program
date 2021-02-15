package com.cfurd.sb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="sb_customers2")
public class Customer {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ_FILE_UPLOADING")
	private long id;
	
	@Column(name = "request_id")
	private String requestId;
	
	@Column(name = "name")
	private String Name;
	
	@Column(name="father_name")
	private String fatherName;
	
	@Column(name="dob")
	private String dob;
	
	@Column(name="pan")
	private String pan;
	
	public Customer() {
		super();
	}

	public Customer(long id, String requestId, String name, String fatherName, String dob, String pan) {
		super();
		
		this.id = id;
		this.requestId = requestId;
		Name = name;
		this.fatherName = fatherName;
		this.dob = dob;
		this.pan = pan;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", requestId=" + requestId + ", Name=" + Name + ", fatherName=" + fatherName
				+ ", dob=" + dob + ", pan=" + pan + "]";
	}
	
	
	
	
	
	
}
