package com.nit.repository;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Table(name = "VHCL_DTLS")
public class VehicleDetails {
	@Id
	@GeneratedValue
	@Column(name = "VHCL_DTL_ID")
	private Integer VehicleDetailId;

	@OneToOne
	@JoinColumn(name = "VHCL_OWNER_ID")
	private VehicleOwnerDetails VehicleOwnerId;

	@Column(name = "VHCL_TYPE")
	private String VehicleType;

	@Column(name = "MFG_YR")
	private Date MfgYear;

	@Column(name = "VHCL_BRND")
	private String VehicleBrand;

	@CreatedDate
	@Column(name = "CREATE_DATE")
	private Date createDate;

	@LastModifiedDate
	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATE_DATE")
	private Date updateDate;

	public Integer getVehicleDetailId() {
		return VehicleDetailId;
	}

	public void setVehicleDetailId(Integer vehicleDetailId) {
		VehicleDetailId = vehicleDetailId;
	}

	public VehicleOwnerDetails getVehicleOwnerId() {
		return VehicleOwnerId;
	}

	public void setVehicleOwnerId(VehicleOwnerDetails vehicleOwnerId) {
		VehicleOwnerId = vehicleOwnerId;
	}

	public String getVehicleType() {
		return VehicleType;
	}

	public void setVehicleType(String vehicleType) {
		VehicleType = vehicleType;
	}

	public Date getMfgYear() {
		return MfgYear;
	}

	public void setMfgYear(Date mfgYear) {
		MfgYear = mfgYear;
	}

	public String getVehicleBrand() {
		return VehicleBrand;
	}

	public void setVehicleBrand(String vehicleBrand) {
		VehicleBrand = vehicleBrand;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "VehicleDetails [VehicleDetailId=" + VehicleDetailId + ", VehicleOwnerId=" + VehicleOwnerId
				+ ", VehicleType=" + VehicleType + ", year=" + "MfgYear" + ", VehicleBrand=" + VehicleBrand
				+ ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
	}

}
