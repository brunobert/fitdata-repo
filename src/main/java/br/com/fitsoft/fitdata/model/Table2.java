package br.com.fitsoft.fitdata.model;

// Generated 06/06/2013 12:23:52 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Table2 generated by hbm2java
 */
@Entity
@Table(name = "table2", catalog = "fitdata")
public class Table2 implements java.io.Serializable {

	private int idCliente;
	private String descCliente;
	private Set<Table1> table1s = new HashSet<Table1>(0);

	public Table2() {
	}

	public Table2(int idCliente) {
		this.idCliente = idCliente;
	}

	public Table2(int idCliente, String descCliente, Set<Table1> table1s) {
		this.idCliente = idCliente;
		this.descCliente = descCliente;
		this.table1s = table1s;
	}

	@Id
	@Column(name = "idCliente", unique = true, nullable = false)
	public int getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	@Column(name = "descCliente", length = 45)
	public String getDescCliente() {
		return this.descCliente;
	}

	public void setDescCliente(String descCliente) {
		this.descCliente = descCliente;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "table2")
	public Set<Table1> getTable1s() {
		return this.table1s;
	}

	public void setTable1s(Set<Table1> table1s) {
		this.table1s = table1s;
	}

}