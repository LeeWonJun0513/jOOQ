/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "Contact", schema = "Person")
public class Contact implements java.io.Serializable {

	private static final long serialVersionUID = -1460173084;


	@javax.validation.constraints.NotNull
	private java.lang.Integer  ContactID;

	@javax.validation.constraints.NotNull
	private java.lang.Boolean  NameStyle;

	@javax.validation.constraints.Size(max = 8)
	private java.lang.String   Title;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 50)
	private java.lang.String   FirstName;

	@javax.validation.constraints.Size(max = 50)
	private java.lang.String   MiddleName;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 50)
	private java.lang.String   LastName;

	@javax.validation.constraints.Size(max = 10)
	private java.lang.String   Suffix;

	@javax.validation.constraints.Size(max = 50)
	private java.lang.String   EmailAddress;

	@javax.validation.constraints.NotNull
	private java.lang.Integer  EmailPromotion;

	@javax.validation.constraints.Size(max = 25)
	private java.lang.String   Phone;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 128)
	private java.lang.String   PasswordHash;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 10)
	private java.lang.String   PasswordSalt;
	private java.lang.Object   AdditionalContactInfo;

	@javax.validation.constraints.NotNull
	private java.lang.String   rowguid;

	@javax.validation.constraints.NotNull
	private java.sql.Timestamp ModifiedDate;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ContactID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getContactID() {
		return this.ContactID;
	}

	public void setContactID(java.lang.Integer ContactID) {
		this.ContactID = ContactID;
	}

	@javax.persistence.Column(name = "NameStyle", nullable = false)
	public java.lang.Boolean getNameStyle() {
		return this.NameStyle;
	}

	public void setNameStyle(java.lang.Boolean NameStyle) {
		this.NameStyle = NameStyle;
	}

	@javax.persistence.Column(name = "Title", length = 8)
	public java.lang.String getTitle() {
		return this.Title;
	}

	public void setTitle(java.lang.String Title) {
		this.Title = Title;
	}

	@javax.persistence.Column(name = "FirstName", nullable = false, length = 50)
	public java.lang.String getFirstName() {
		return this.FirstName;
	}

	public void setFirstName(java.lang.String FirstName) {
		this.FirstName = FirstName;
	}

	@javax.persistence.Column(name = "MiddleName", length = 50)
	public java.lang.String getMiddleName() {
		return this.MiddleName;
	}

	public void setMiddleName(java.lang.String MiddleName) {
		this.MiddleName = MiddleName;
	}

	@javax.persistence.Column(name = "LastName", nullable = false, length = 50)
	public java.lang.String getLastName() {
		return this.LastName;
	}

	public void setLastName(java.lang.String LastName) {
		this.LastName = LastName;
	}

	@javax.persistence.Column(name = "Suffix", length = 10)
	public java.lang.String getSuffix() {
		return this.Suffix;
	}

	public void setSuffix(java.lang.String Suffix) {
		this.Suffix = Suffix;
	}

	@javax.persistence.Column(name = "EmailAddress", length = 50)
	public java.lang.String getEmailAddress() {
		return this.EmailAddress;
	}

	public void setEmailAddress(java.lang.String EmailAddress) {
		this.EmailAddress = EmailAddress;
	}

	@javax.persistence.Column(name = "EmailPromotion", nullable = false, precision = 10)
	public java.lang.Integer getEmailPromotion() {
		return this.EmailPromotion;
	}

	public void setEmailPromotion(java.lang.Integer EmailPromotion) {
		this.EmailPromotion = EmailPromotion;
	}

	@javax.persistence.Column(name = "Phone", length = 25)
	public java.lang.String getPhone() {
		return this.Phone;
	}

	public void setPhone(java.lang.String Phone) {
		this.Phone = Phone;
	}

	@javax.persistence.Column(name = "PasswordHash", nullable = false, length = 128)
	public java.lang.String getPasswordHash() {
		return this.PasswordHash;
	}

	public void setPasswordHash(java.lang.String PasswordHash) {
		this.PasswordHash = PasswordHash;
	}

	@javax.persistence.Column(name = "PasswordSalt", nullable = false, length = 10)
	public java.lang.String getPasswordSalt() {
		return this.PasswordSalt;
	}

	public void setPasswordSalt(java.lang.String PasswordSalt) {
		this.PasswordSalt = PasswordSalt;
	}

	@javax.persistence.Column(name = "AdditionalContactInfo")
	public java.lang.Object getAdditionalContactInfo() {
		return this.AdditionalContactInfo;
	}

	public void setAdditionalContactInfo(java.lang.Object AdditionalContactInfo) {
		this.AdditionalContactInfo = AdditionalContactInfo;
	}

	@javax.persistence.Column(name = "rowguid", nullable = false)
	public java.lang.String getrowguid() {
		return this.rowguid;
	}

	public void setrowguid(java.lang.String rowguid) {
		this.rowguid = rowguid;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}
