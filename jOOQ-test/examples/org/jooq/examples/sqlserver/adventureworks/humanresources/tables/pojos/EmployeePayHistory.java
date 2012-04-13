/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "EmployeePayHistory", schema = "HumanResources", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"EmployeeID", "RateChangeDate"})
})
public class EmployeePayHistory implements java.io.Serializable {

	private static final long serialVersionUID = -2010601952;


	@javax.validation.constraints.NotNull
	private java.lang.Integer    EmployeeID;

	@javax.validation.constraints.NotNull
	private java.sql.Timestamp   RateChangeDate;

	@javax.validation.constraints.NotNull
	private java.math.BigDecimal Rate;

	@javax.validation.constraints.NotNull
	private java.lang.Byte       PayFrequency;

	@javax.validation.constraints.NotNull
	private java.sql.Timestamp   ModifiedDate;

	@javax.persistence.Column(name = "EmployeeID", nullable = false, precision = 10)
	public java.lang.Integer getEmployeeID() {
		return this.EmployeeID;
	}

	public void setEmployeeID(java.lang.Integer EmployeeID) {
		this.EmployeeID = EmployeeID;
	}

	@javax.persistence.Column(name = "RateChangeDate", nullable = false)
	public java.sql.Timestamp getRateChangeDate() {
		return this.RateChangeDate;
	}

	public void setRateChangeDate(java.sql.Timestamp RateChangeDate) {
		this.RateChangeDate = RateChangeDate;
	}

	@javax.persistence.Column(name = "Rate", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getRate() {
		return this.Rate;
	}

	public void setRate(java.math.BigDecimal Rate) {
		this.Rate = Rate;
	}

	@javax.persistence.Column(name = "PayFrequency", nullable = false, precision = 3)
	public java.lang.Byte getPayFrequency() {
		return this.PayFrequency;
	}

	public void setPayFrequency(java.lang.Byte PayFrequency) {
		this.PayFrequency = PayFrequency;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}
