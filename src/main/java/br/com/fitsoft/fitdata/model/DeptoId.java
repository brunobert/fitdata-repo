package br.com.fitsoft.fitdata.model;

// Generated 06/06/2013 09:53:01 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DeptoId generated by hbm2java
 */
@Embeddable
public class DeptoId implements java.io.Serializable {

	private long idEmpresa;
	private int idDepto;

	public DeptoId() {
	}

	public DeptoId(long idEmpresa, int idDepto) {
		this.idEmpresa = idEmpresa;
		this.idDepto = idDepto;
	}

	@Column(name = "idEmpresa", nullable = false)
	public long getIdEmpresa() {
		return this.idEmpresa;
	}

	public void setIdEmpresa(long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	@Column(name = "idDepto", nullable = false)
	public int getIdDepto() {
		return this.idDepto;
	}

	public void setIdDepto(int idDepto) {
		this.idDepto = idDepto;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DeptoId))
			return false;
		DeptoId castOther = (DeptoId) other;

		return (this.getIdEmpresa() == castOther.getIdEmpresa())
				&& (this.getIdDepto() == castOther.getIdDepto());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getIdEmpresa();
		result = 37 * result + this.getIdDepto();
		return result;
	}

}
