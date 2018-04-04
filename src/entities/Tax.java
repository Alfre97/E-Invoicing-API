package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Tax {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable=false, name="code")
	private String code;
	@Column(nullable=false, name="taxTotal")
	private String taxTotal;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(nullable=true, name="serviceId")
	private Service service;
	@Column(nullable=false, name="rate")
	private String rate;
	
	//Exoneration data
	@Column(nullable=false, name="date")
	private String date;
	@Column(nullable=false, name="tax")
	private String tax;
	@Column(nullable=false, name="institutionName")
	private String institutionName;
	@Column(nullable=false, name="documentNumber")
	private String documentNumber;
	@Column(nullable=false, name="purchasePercentage")
	private String purchasePercentage;
	@Column(nullable=false, name="documentType")
	private String documentType;
	
	public Tax() {}

	public Tax(Integer id, String code, String taxTotal, Service service, String rate, String date, String tax,
			String institutionName, String documentNumber, String purchasePercentage, String documentType) {
		super();
		this.id = id;
		this.code = code;
		this.taxTotal = taxTotal;
		this.service = service;
		this.rate = rate;
		this.date = date;
		this.tax = tax;
		this.institutionName = institutionName;
		this.documentNumber = documentNumber;
		this.purchasePercentage = purchasePercentage;
		this.documentType = documentType;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTaxTotal() {
		return taxTotal;
	}

	public void setTaxTotal(String taxTotal) {
		this.taxTotal = taxTotal;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTax() {
		return tax;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}

	public String getInstitutionName() {
		return institutionName;
	}

	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public String getPurchasePercentage() {
		return purchasePercentage;
	}

	public void setPurchasePercentage(String purchasePercentage) {
		this.purchasePercentage = purchasePercentage;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
}