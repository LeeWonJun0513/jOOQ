/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "TransactionHistory", schema = "Production")
public class TransactionHistory implements java.io.Serializable {

	private static final long serialVersionUID = 650647639;


	@javax.validation.constraints.NotNull
	private java.lang.Integer    TransactionID;

	@javax.validation.constraints.NotNull
	private java.lang.Integer    ProductID;

	@javax.validation.constraints.NotNull
	private java.lang.Integer    ReferenceOrderID;

	@javax.validation.constraints.NotNull
	private java.lang.Integer    ReferenceOrderLineID;

	@javax.validation.constraints.NotNull
	private java.sql.Timestamp   TransactionDate;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 1)
	private java.lang.String     TransactionType;

	@javax.validation.constraints.NotNull
	private java.lang.Integer    Quantity;

	@javax.validation.constraints.NotNull
	private java.math.BigDecimal ActualCost;

	@javax.validation.constraints.NotNull
	private java.sql.Timestamp   ModifiedDate;

	@javax.persistence.Id
	@javax.persistence.Column(name = "TransactionID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getTransactionID() {
		return this.TransactionID;
	}

	public void setTransactionID(java.lang.Integer TransactionID) {
		this.TransactionID = TransactionID;
	}

	@javax.persistence.Column(name = "ProductID", nullable = false, precision = 10)
	public java.lang.Integer getProductID() {
		return this.ProductID;
	}

	public void setProductID(java.lang.Integer ProductID) {
		this.ProductID = ProductID;
	}

	@javax.persistence.Column(name = "ReferenceOrderID", nullable = false, precision = 10)
	public java.lang.Integer getReferenceOrderID() {
		return this.ReferenceOrderID;
	}

	public void setReferenceOrderID(java.lang.Integer ReferenceOrderID) {
		this.ReferenceOrderID = ReferenceOrderID;
	}

	@javax.persistence.Column(name = "ReferenceOrderLineID", nullable = false, precision = 10)
	public java.lang.Integer getReferenceOrderLineID() {
		return this.ReferenceOrderLineID;
	}

	public void setReferenceOrderLineID(java.lang.Integer ReferenceOrderLineID) {
		this.ReferenceOrderLineID = ReferenceOrderLineID;
	}

	@javax.persistence.Column(name = "TransactionDate", nullable = false)
	public java.sql.Timestamp getTransactionDate() {
		return this.TransactionDate;
	}

	public void setTransactionDate(java.sql.Timestamp TransactionDate) {
		this.TransactionDate = TransactionDate;
	}

	@javax.persistence.Column(name = "TransactionType", nullable = false, length = 1)
	public java.lang.String getTransactionType() {
		return this.TransactionType;
	}

	public void setTransactionType(java.lang.String TransactionType) {
		this.TransactionType = TransactionType;
	}

	@javax.persistence.Column(name = "Quantity", nullable = false, precision = 10)
	public java.lang.Integer getQuantity() {
		return this.Quantity;
	}

	public void setQuantity(java.lang.Integer Quantity) {
		this.Quantity = Quantity;
	}

	@javax.persistence.Column(name = "ActualCost", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getActualCost() {
		return this.ActualCost;
	}

	public void setActualCost(java.math.BigDecimal ActualCost) {
		this.ActualCost = ActualCost;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}
