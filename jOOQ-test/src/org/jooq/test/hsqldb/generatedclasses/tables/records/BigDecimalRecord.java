/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BigDecimalRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.BigDecimalRecord> implements org.jooq.Record2<java.lang.Integer, java.math.BigInteger>, org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IBigDecimal {

	private static final long serialVersionUID = -2050306381;

	/**
	 * Setter for <code>PUBLIC.BIG_DECIMAL.ID</code>. 
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.BIG_DECIMAL.ID</code>. 
	 */
	@Override
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.BIG_DECIMAL.OTHER</code>. 
	 */
	@Override
	public void setOther(java.math.BigInteger value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>PUBLIC.BIG_DECIMAL.OTHER</code>. 
	 */
	@Override
	public java.math.BigInteger getOther() {
		return (java.math.BigInteger) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.math.BigInteger> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.math.BigInteger> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.hsqldb.generatedclasses.tables.BigDecimal.BIG_DECIMAL.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigInteger> field2() {
		return org.jooq.test.hsqldb.generatedclasses.tables.BigDecimal.BIG_DECIMAL.OTHER;
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
	public java.math.BigInteger value2() {
		return getOther();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimalRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimalRecord value2(java.math.BigInteger value) {
		setOther(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimalRecord values(java.lang.Integer value1, java.math.BigInteger value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IBigDecimal from) {
		setId(from.getId());
		setOther(from.getOther());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IBigDecimal> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached BigDecimalRecord
	 */
	public BigDecimalRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.BigDecimal.BIG_DECIMAL);
	}

	/**
	 * Create a detached, initialised BigDecimalRecord
	 */
	public BigDecimalRecord(java.lang.Integer id, java.math.BigInteger other) {
		super(org.jooq.test.hsqldb.generatedclasses.tables.BigDecimal.BIG_DECIMAL);

		setValue(0, id);
		setValue(1, other);
	}
}
