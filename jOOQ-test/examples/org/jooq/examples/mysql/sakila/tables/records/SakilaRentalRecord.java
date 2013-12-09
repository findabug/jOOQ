/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SakilaRentalRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.SakilaRentalRecord> implements org.jooq.Record7<java.lang.Integer, java.sql.Timestamp, java.lang.Integer, java.lang.Short, java.sql.Timestamp, java.lang.Byte, java.sql.Timestamp> {

	private static final long serialVersionUID = -1851603011;

	/**
	 * Setter for <code>sakila.rental.rental_id</code>. 
	 */
	public void setRentalId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sakila.rental.rental_id</code>. 
	 */
	public java.lang.Integer getRentalId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>sakila.rental.rental_date</code>. 
	 */
	public void setRentalDate(java.sql.Timestamp value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sakila.rental.rental_date</code>. 
	 */
	public java.sql.Timestamp getRentalDate() {
		return (java.sql.Timestamp) getValue(1);
	}

	/**
	 * Setter for <code>sakila.rental.inventory_id</code>. 
	 */
	public void setInventoryId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sakila.rental.inventory_id</code>. 
	 */
	public java.lang.Integer getInventoryId() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>sakila.rental.customer_id</code>. 
	 */
	public void setCustomerId(java.lang.Short value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sakila.rental.customer_id</code>. 
	 */
	public java.lang.Short getCustomerId() {
		return (java.lang.Short) getValue(3);
	}

	/**
	 * Setter for <code>sakila.rental.return_date</code>. 
	 */
	public void setReturnDate(java.sql.Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>sakila.rental.return_date</code>. 
	 */
	public java.sql.Timestamp getReturnDate() {
		return (java.sql.Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>sakila.rental.staff_id</code>. 
	 */
	public void setStaffId(java.lang.Byte value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>sakila.rental.staff_id</code>. 
	 */
	public java.lang.Byte getStaffId() {
		return (java.lang.Byte) getValue(5);
	}

	/**
	 * Setter for <code>sakila.rental.last_update</code>. 
	 */
	public void setLastUpdate(java.sql.Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>sakila.rental.last_update</code>. 
	 */
	public java.sql.Timestamp getLastUpdate() {
		return (java.sql.Timestamp) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Integer, java.sql.Timestamp, java.lang.Integer, java.lang.Short, java.sql.Timestamp, java.lang.Byte, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Integer, java.sql.Timestamp, java.lang.Integer, java.lang.Short, java.sql.Timestamp, java.lang.Byte, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.examples.mysql.sakila.tables.SakilaRental.RENTAL.RENTAL_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field2() {
		return org.jooq.examples.mysql.sakila.tables.SakilaRental.RENTAL.RENTAL_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.examples.mysql.sakila.tables.SakilaRental.RENTAL.INVENTORY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field4() {
		return org.jooq.examples.mysql.sakila.tables.SakilaRental.RENTAL.CUSTOMER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field5() {
		return org.jooq.examples.mysql.sakila.tables.SakilaRental.RENTAL.RETURN_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field6() {
		return org.jooq.examples.mysql.sakila.tables.SakilaRental.RENTAL.STAFF_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field7() {
		return org.jooq.examples.mysql.sakila.tables.SakilaRental.RENTAL.LAST_UPDATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getRentalId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value2() {
		return getRentalDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getInventoryId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value4() {
		return getCustomerId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value5() {
		return getReturnDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value6() {
		return getStaffId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value7() {
		return getLastUpdate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SakilaRentalRecord value1(java.lang.Integer value) {
		setRentalId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SakilaRentalRecord value2(java.sql.Timestamp value) {
		setRentalDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SakilaRentalRecord value3(java.lang.Integer value) {
		setInventoryId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SakilaRentalRecord value4(java.lang.Short value) {
		setCustomerId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SakilaRentalRecord value5(java.sql.Timestamp value) {
		setReturnDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SakilaRentalRecord value6(java.lang.Byte value) {
		setStaffId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SakilaRentalRecord value7(java.sql.Timestamp value) {
		setLastUpdate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SakilaRentalRecord values(java.lang.Integer value1, java.sql.Timestamp value2, java.lang.Integer value3, java.lang.Short value4, java.sql.Timestamp value5, java.lang.Byte value6, java.sql.Timestamp value7) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SakilaRentalRecord
	 */
	public SakilaRentalRecord() {
		super(org.jooq.examples.mysql.sakila.tables.SakilaRental.RENTAL);
	}

	/**
	 * Create a detached, initialised SakilaRentalRecord
	 */
	public SakilaRentalRecord(java.lang.Integer rentalId, java.sql.Timestamp rentalDate, java.lang.Integer inventoryId, java.lang.Short customerId, java.sql.Timestamp returnDate, java.lang.Byte staffId, java.sql.Timestamp lastUpdate) {
		super(org.jooq.examples.mysql.sakila.tables.SakilaRental.RENTAL);

		setValue(0, rentalId);
		setValue(1, rentalDate);
		setValue(2, inventoryId);
		setValue(3, customerId);
		setValue(4, returnDate);
		setValue(5, staffId);
		setValue(6, lastUpdate);
	}
}
