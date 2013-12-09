/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VAuthor extends org.jooq.impl.TableImpl<org.jooq.test.postgres.generatedclasses.tables.records.VAuthorRecord> {

	private static final long serialVersionUID = 1042369455;

	/**
	 * The singleton instance of <code>public.v_author</code>
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.VAuthor V_AUTHOR = new org.jooq.test.postgres.generatedclasses.tables.VAuthor();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.VAuthorRecord> getRecordType() {
		return org.jooq.test.postgres.generatedclasses.tables.records.VAuthorRecord.class;
	}

	/**
	 * The column <code>public.v_author.id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.VAuthorRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.defaulted(true), this);

	/**
	 * The column <code>public.v_author.first_name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.VAuthorRecord, java.lang.String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR.length(50).defaulted(true), this);

	/**
	 * The column <code>public.v_author.last_name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.VAuthorRecord, java.lang.String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR.length(50).defaulted(true), this);

	/**
	 * The column <code>public.v_author.date_of_birth</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.VAuthorRecord, java.sql.Date> DATE_OF_BIRTH = createField("date_of_birth", org.jooq.impl.SQLDataType.DATE.defaulted(true), this);

	/**
	 * The column <code>public.v_author.year_of_birth</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.VAuthorRecord, java.lang.Integer> YEAR_OF_BIRTH = createField("year_of_birth", org.jooq.impl.SQLDataType.INTEGER.defaulted(true), this);

	/**
	 * The column <code>public.v_author.address</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.VAuthorRecord, org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord> ADDRESS = createField("address", org.jooq.test.postgres.generatedclasses.udt.UAddressType.U_ADDRESS_TYPE.getDataType(), this);

	/**
	 * Create a <code>public.v_author</code> table reference
	 */
	public VAuthor() {
		super("v_author", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.v_author</code> table reference
	 */
	public VAuthor(java.lang.String alias) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.test.postgres.generatedclasses.tables.VAuthor.V_AUTHOR);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.postgres.generatedclasses.tables.VAuthor as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.VAuthor(alias);
	}
}
