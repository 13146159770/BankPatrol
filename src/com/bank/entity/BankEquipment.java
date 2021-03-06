package com.bank.entity;

import java.io.Serializable;
import java.util.Date;

import com.bank.util.DateUtils;
import com.google.gson.Gson;

/**
 * 银行设备
 */
public class BankEquipment implements Serializable {

	private static final long serialVersionUID = -9005658084919205189L;
	/**
	 * 流水 ID
	 */
	private String eachID;
	/**
	 * 种类
	 */
	private EquipmentType type;
	/**
	 * 所属银行
	 */
	private Bank bank;
	/**
	 * 购买价格
	 */
	private Double value;
	/**
	 * 购买时间
	 */
	private Date buyDate;
	/**
	 * 状态
	 */
	private int status;
	/**
	 * 折旧残值
	 */
	private Double depreciationValue;

	public BankEquipment() {
		type = new EquipmentType();
		bank = new Bank();
//		buyDate = new Date();
	}

	/**
	 * 银行设备构造器
	 * @param eachID 设备流水 ID
	 * @param type 设备类型
	 * @param bank 设备所属银行
	 * @param value 设备价值
	 * @param buyDate 购买时间
	 * @param status 状态
	 * @param depreciationValue 设备折旧残值
	 */
	public BankEquipment(String eachID, EquipmentType type, Bank bank, Double value, Date buyDate, int status, Double depreciationValue) {
		super();
		this.eachID = eachID;
		this.type = type;
		this.bank = bank;
		this.value = value == null ? 0 : value;
		this.buyDate = buyDate;
		this.status = status;
		this.depreciationValue = depreciationValue == null ? 0 : depreciationValue;
	}

	public String getEachID() {
		return eachID;
	}

	public void setEachID(String eachID) {
		this.eachID = eachID;
	}

	public EquipmentType getType() {
		return type;
	}

	public void setType(EquipmentType type) {
		this.type = type;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value == null ? 0 : value;
	}

	public Date getBuyDate() {
		return buyDate;
	}

	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}

	public int getStatus() {
		return status;
	}
	
	/**
	 * 获取设备状态
	 * @return 
	 */
	public String getStatusStr() {
		switch (status) {
		case 0:
			return "设备正常";
		case 1:
			return "报检设备";
		}
		return "停用设备";
	}

	/**
	 * 设置设备状态
	 * 
	 * 0：设备正常
	 * 
	 * 1：报检设备
	 * 
	 * 2：停用设备
	 * 
	 * @param status
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	public Double getDepreciationValue() {
		return depreciationValue;
	}

	public void setDepreciationValue(Double depreciationValue) {
		this.depreciationValue = depreciationValue == null ? 0 : depreciationValue;
	}
	
	/**
	 * 获取所属银行的 id
	 * @return
	 */
	public String getBankId() {
		return bank.getId();
	}
	
	/**
	 * 设置所属银行的 id
	 * @param bankID
	 */
	public void setBankId(String bankID) {
		this.bank.setId(bankID);
	}
	
	/**
	 * 获取所属银行的名称
	 * @return
	 */
	public String getBankName() {
		return bank.getName();
	}
	
	/**
	 * 设置所属银行的名称
	 * @param bankName
	 */
	public void setBankName(String bankName) {
		this.bank.setName(bankName);
	}
	
	/**
	 * 获取设备种类 id
	 * @return
	 */
	public String getTypeId() {
		return type.getId();
	}
	
	/**
	 * 设置设备种类 id
	 * @param typId
	 */
	public void setTypeId(String typId) {
		this.type.setId(typId);
	}

	/**
	 * 获取购买时间
	 * @return
	 */
	public String getBuyDateStr() {
		return DateUtils.dateToStr("yyyy-MM-dd", buyDate);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bank == null) ? 0 : bank.hashCode());
		result = prime * result + ((buyDate == null) ? 0 : buyDate.hashCode());
		long temp;
		temp = Double.doubleToLongBits(depreciationValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((eachID == null) ? 0 : eachID.hashCode());
		result = prime * result + status;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		temp = Double.doubleToLongBits(value);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankEquipment other = (BankEquipment) obj;
		if (bank == null) {
			if (other.bank != null)
				return false;
		} else if (!bank.equals(other.bank))
			return false;
		if (buyDate == null) {
			if (other.buyDate != null)
				return false;
		} else if (!buyDate.equals(other.buyDate))
			return false;
		if (Double.doubleToLongBits(depreciationValue) != Double.doubleToLongBits(other.depreciationValue))
			return false;
		if (eachID == null) {
			if (other.eachID != null)
				return false;
		} else if (!eachID.equals(other.eachID))
			return false;
		if (status != other.status)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BankEquipment [eachID=" + eachID + ", type=" + type + ", bank=" + bank + ", value=" + value + ", buyDate=" + buyDate + ", status=" + status + ", depreciationValue=" + depreciationValue + "]";
	}

	public String toJson() {
		return new Gson().toJson(this);
	}

}
