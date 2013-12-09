/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StringRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.StringRecord> implements org.jooq.Record2<java.lang.Integer, java.lang.String>, org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IString {

	private static final long serialVersionUID = 1368775506;

	/**
	 * Setter for <code>PUBLIC.STRING.ID</code>. 
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.STRING.ID</code>. 
	 */
	@Override
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.STRING.OTHER</code>. 
	 */
	@Override
	public void setOther(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>PUBLIC.STRING.OTHER</code>. 
	 */
	@Override
	public java.lang.String getOther() {
		return (java.lang.String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.String> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.String> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.hsqldb.generatedclasses.tables.String.STRING.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.hsqldb.generatedclasses.tables.String.STRING.OTHER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getOther();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StringRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StringRecord value2(java.lang.String value) {
		setOther(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StringRecord values(java.lang.Integer value1, java.lang.String value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IString from) {
		setId(from.getId());
		setOther(from.getOther());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IString> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached StringRecord
	 */
	public StringRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.String.STRING);
	}

	/**
	 * Create a detached, initialised StringRecord
	 */
	public StringRecord(java.lang.Integer id, java.lang.String other) {
		super(org.jooq.test.hsqldb.generatedclasses.tables.String.STRING);

		setValue(0, id);
		setValue(1, other);
	}
}
