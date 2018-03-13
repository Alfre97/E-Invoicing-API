package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Service {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;
	@Column(nullable=false, name="lineNumber")
	private String lineNumber;
	@Column(nullable=false, name="codeType")
	private String codeType;
	@Column(nullable=false, name="code")
	private String code;
	@Column(nullable=false, name="amount")
	private String amount;
	@Column(nullable=false, name="unitOfMeasurementType")
	private String unitOfMeasurementType;
	@Column(nullable=false, name="unitOfMeasurementName")
	private String unitOfMeasurementName;
	@Column(nullable=false, name="comercialUnitOfMeasurement")
	private String comercialUnitOfMeasurement;
	@Column(nullable=false, name="detail")
	private String detail;
	@Column(nullable=false, name="priceByUnit")
	private String priceByUnit;
	@Column(nullable=false, name="totalAmount")
	private String totalAmount;
	@Column(nullable=false, name="discount")
	private String discount;
	@Column(nullable=false, name="subTotal")
	private String subTotal;
	@Column(nullable=false, name="total")
	private String total;
	
	public Service() {
		
	}

	public Service(Integer id, String lineNumber, String codeType, String code, String amount,
			String unitOfMeasurementType, String unitOfMeasurementName, String comercialUnitOfMeasurement,
			String detail, String priceByUnit, String totalAmount, String discount, String subTotal, String total) {
		super();
		this.id = id;
		this.lineNumber = lineNumber;
		this.codeType = codeType;
		this.code = code;
		this.amount = amount;
		this.unitOfMeasurementType = unitOfMeasurementType;
		this.unitOfMeasurementName = unitOfMeasurementName;
		this.comercialUnitOfMeasurement = comercialUnitOfMeasurement;
		this.detail = detail;
		this.priceByUnit = priceByUnit;
		this.totalAmount = totalAmount;
		this.discount = discount;
		this.subTotal = subTotal;
		this.total = total;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	public String getCodeType() {
		return codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getUnitOfMeasurementType() {
		return unitOfMeasurementType;
	}

	public void setUnitOfMeasurementType(String unitOfMeasurementType) {
		this.unitOfMeasurementType = unitOfMeasurementType;
	}

	public String getUnitOfMeasurementName() {
		return unitOfMeasurementName;
	}

	public void setUnitOfMeasurementName(String unitOfMeasurementName) {
		this.unitOfMeasurementName = unitOfMeasurementName;
	}

	public String getComercialUnitOfMeasurement() {
		return comercialUnitOfMeasurement;
	}

	public void setComercialUnitOfMeasurement(String comercialUnitOfMeasurement) {
		this.comercialUnitOfMeasurement = comercialUnitOfMeasurement;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getPriceByUnit() {
		return priceByUnit;
	}

	public void setPriceByUnit(String priceByUnit) {
		this.priceByUnit = priceByUnit;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(String subTotal) {
		this.subTotal = subTotal;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}
	
}
