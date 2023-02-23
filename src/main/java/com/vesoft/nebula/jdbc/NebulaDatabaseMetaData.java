package com.vesoft.nebula.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.RowIdLifetime;
import java.sql.SQLException;

import com.vesoft.nebula.jdbc.utils.ExceptionBuilder;

public class NebulaDatabaseMetaData implements DatabaseMetaData {

	public static final String PRODUCT_NAME = "NebulaGraph";

	private final NebulaConnection connection;

	public NebulaDatabaseMetaData(NebulaConnection connection) {
		this.connection = connection;
	}

	@Override
	public boolean allProceduresAreCallable() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean allTablesAreSelectable() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public String getURL() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public String getUserName() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean isReadOnly() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean nullsAreSortedHigh() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean nullsAreSortedLow() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean nullsAreSortedAtStart() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean nullsAreSortedAtEnd() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public String getDatabaseProductName() throws SQLException {
		return PRODUCT_NAME;
	}

	@Override
	public String getDatabaseProductVersion() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public String getDriverName() throws SQLException {
		return NebulaDriver.DRIVER_NAME;
	}

	@Override
	public String getDriverVersion() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public int getDriverMajorVersion() {
		throw new RuntimeException(ExceptionBuilder.buildUnsupportedOperationException());
	}

	@Override
	public int getDriverMinorVersion() {
		throw new RuntimeException(ExceptionBuilder.buildUnsupportedOperationException());
	}

	@Override
	public boolean usesLocalFiles() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean usesLocalFilePerTable() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsMixedCaseIdentifiers() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean storesUpperCaseIdentifiers() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean storesLowerCaseIdentifiers() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean storesMixedCaseIdentifiers() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsMixedCaseQuotedIdentifiers() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean storesUpperCaseQuotedIdentifiers() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean storesLowerCaseQuotedIdentifiers() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean storesMixedCaseQuotedIdentifiers() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public String getIdentifierQuoteString() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public String getSQLKeywords() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public String getNumericFunctions() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public String getStringFunctions() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public String getSystemFunctions() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public String getTimeDateFunctions() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public String getSearchStringEscape() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public String getExtraNameCharacters() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsAlterTableWithAddColumn() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsAlterTableWithDropColumn() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsColumnAliasing() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean nullPlusNonNullIsNull() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsConvert() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsConvert(int fromType, int toType) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsTableCorrelationNames() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsDifferentTableCorrelationNames() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsExpressionsInOrderBy() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsOrderByUnrelated() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsGroupBy() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsGroupByUnrelated() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsGroupByBeyondSelect() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsLikeEscapeClause() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsMultipleResultSets() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsMultipleTransactions() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsNonNullableColumns() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsMinimumSQLGrammar() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsCoreSQLGrammar() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsExtendedSQLGrammar() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsANSI92EntryLevelSQL() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsANSI92IntermediateSQL() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsANSI92FullSQL() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsIntegrityEnhancementFacility() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsOuterJoins() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsFullOuterJoins() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsLimitedOuterJoins() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public String getSchemaTerm() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public String getProcedureTerm() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public String getCatalogTerm() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean isCatalogAtStart() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public String getCatalogSeparator() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsSchemasInDataManipulation() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsSchemasInProcedureCalls() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsSchemasInTableDefinitions() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsSchemasInIndexDefinitions() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsSchemasInPrivilegeDefinitions() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsCatalogsInDataManipulation() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsCatalogsInProcedureCalls() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsCatalogsInTableDefinitions() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsCatalogsInIndexDefinitions() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsCatalogsInPrivilegeDefinitions() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsPositionedDelete() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsPositionedUpdate() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsSelectForUpdate() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsStoredProcedures() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsSubqueriesInComparisons() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsSubqueriesInExists() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsSubqueriesInIns() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsSubqueriesInQuantifieds() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsCorrelatedSubqueries() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsUnion() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsUnionAll() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsOpenCursorsAcrossCommit() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsOpenCursorsAcrossRollback() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsOpenStatementsAcrossCommit() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsOpenStatementsAcrossRollback() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public int getMaxBinaryLiteralLength() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public int getMaxCharLiteralLength() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public int getMaxColumnNameLength() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public int getMaxColumnsInGroupBy() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public int getMaxColumnsInIndex() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public int getMaxColumnsInOrderBy() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public int getMaxColumnsInSelect() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public int getMaxColumnsInTable() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public int getMaxConnections() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public int getMaxCursorNameLength() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public int getMaxIndexLength() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public int getMaxSchemaNameLength() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public int getMaxProcedureNameLength() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public int getMaxCatalogNameLength() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public int getMaxRowSize() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean doesMaxRowSizeIncludeBlobs() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public int getMaxStatementLength() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public int getMaxStatements() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public int getMaxTableNameLength() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public int getMaxTablesInSelect() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public int getMaxUserNameLength() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public int getDefaultTransactionIsolation() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsTransactions() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsTransactionIsolationLevel(int level) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsDataDefinitionAndDataManipulationTransactions() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsDataManipulationTransactionsOnly() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean dataDefinitionCausesTransactionCommit() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean dataDefinitionIgnoredInTransactions() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public ResultSet getProcedures(String catalog, String schemaPattern, String procedureNamePattern) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public ResultSet getProcedureColumns(String catalog, String schemaPattern, String procedureNamePattern, String columnNamePattern) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public ResultSet getTables(String catalog, String schemaPattern, String tableNamePattern, String[] types) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public ResultSet getSchemas() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public ResultSet getCatalogs() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public ResultSet getTableTypes() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public ResultSet getColumns(String catalog, String schemaPattern, String tableNamePattern, String columnNamePattern) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public ResultSet getColumnPrivileges(String catalog, String schema, String table, String columnNamePattern) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public ResultSet getTablePrivileges(String catalog, String schemaPattern, String tableNamePattern) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public ResultSet getBestRowIdentifier(String catalog, String schema, String table, int scope, boolean nullable) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public ResultSet getVersionColumns(String catalog, String schema, String table) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public ResultSet getPrimaryKeys(String catalog, String schema, String table) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public ResultSet getImportedKeys(String catalog, String schema, String table) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public ResultSet getExportedKeys(String catalog, String schema, String table) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public ResultSet getCrossReference(String parentCatalog, String parentSchema, String parentTable, String foreignCatalog, String foreignSchema, String foreignTable) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public ResultSet getTypeInfo() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public ResultSet getIndexInfo(String catalog, String schema, String table, boolean unique, boolean approximate) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsResultSetType(int type) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsResultSetConcurrency(int type, int concurrency) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean ownUpdatesAreVisible(int type) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean ownDeletesAreVisible(int type) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean ownInsertsAreVisible(int type) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean othersUpdatesAreVisible(int type) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean othersDeletesAreVisible(int type) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean othersInsertsAreVisible(int type) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean updatesAreDetected(int type) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean deletesAreDetected(int type) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean insertsAreDetected(int type) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsBatchUpdates() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public ResultSet getUDTs(String catalog, String schemaPattern, String typeNamePattern, int[] types) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public Connection getConnection() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsSavepoints() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsNamedParameters() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsMultipleOpenResults() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsGetGeneratedKeys() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public ResultSet getSuperTypes(String catalog, String schemaPattern, String typeNamePattern) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public ResultSet getSuperTables(String catalog, String schemaPattern, String tableNamePattern) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public ResultSet getAttributes(String catalog, String schemaPattern, String typeNamePattern, String attributeNamePattern) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsResultSetHoldability(int holdability) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public int getResultSetHoldability() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public int getDatabaseMajorVersion() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public int getDatabaseMinorVersion() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public int getJDBCMajorVersion() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public int getJDBCMinorVersion() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public int getSQLStateType() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean locatorsUpdateCopy() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsStatementPooling() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public RowIdLifetime getRowIdLifetime() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public ResultSet getSchemas(String catalog, String schemaPattern) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean supportsStoredFunctionsUsingCallSyntax() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean autoCommitFailureClosesAllResultSets() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public ResultSet getClientInfoProperties() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public ResultSet getFunctions(String catalog, String schemaPattern, String functionNamePattern) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public ResultSet getFunctionColumns(String catalog, String schemaPattern, String functionNamePattern, String columnNamePattern) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public ResultSet getPseudoColumns(String catalog, String schemaPattern, String tableNamePattern, String columnNamePattern) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean generatedKeyAlwaysReturned() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}
}
