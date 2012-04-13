/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "ProductDocument", schema = "Production", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"ProductID", "DocumentID"})
})
public class ProductDocument implements java.io.Serializable {

	private static final long serialVersionUID = -510662050;


	@javax.validation.constraints.NotNull
	private java.lang.Integer  ProductID;

	@javax.validation.constraints.NotNull
	private java.lang.Integer  DocumentID;

	@javax.validation.constraints.NotNull
	private java.sql.Timestamp ModifiedDate;

	@javax.persistence.Column(name = "ProductID", nullable = false, precision = 10)
	public java.lang.Integer getProductID() {
		return this.ProductID;
	}

	public void setProductID(java.lang.Integer ProductID) {
		this.ProductID = ProductID;
	}

	@javax.persistence.Column(name = "DocumentID", nullable = false, precision = 10)
	public java.lang.Integer getDocumentID() {
		return this.DocumentID;
	}

	public void setDocumentID(java.lang.Integer DocumentID) {
		this.DocumentID = DocumentID;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}
