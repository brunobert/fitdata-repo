package br.com.fitsoft.fitdata.model;

// Generated 06/06/2013 09:53:01 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SistemaId generated by hbm2java
 */
@Embeddable
public class SistemaId implements java.io.Serializable {

	private long idEmpresa;
	private int idSistema;

	public SistemaId() {
	}

	public SistemaId(long idEmpresa, int idSistema) {
		this.idEmpresa = idEmpresa;
		this.idSistema = idSistema;
	}

	@Column(name = "idEmpresa", nullable = false)
	public long getIdEmpresa() {
		return this.idEmpresa;
	}

	public void setIdEmpresa(long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	@Column(name = "idSistema", nullable = false)
	public int getIdSistema() {
		return this.idSistema;
	}

	public void setIdSistema(int idSistema) {
		this.idSistema = idSistema;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SistemaId))
			return false;
		SistemaId castOther = (SistemaId) other;

		return (this.getIdEmpresa() == castOther.getIdEmpresa())
				&& (this.getIdSistema() == castOther.getIdSistema());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getIdEmpresa();
		result = 37 * result + this.getIdSistema();
		return result;
	}

}
