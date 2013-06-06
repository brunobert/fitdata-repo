package br.com.fitsoft.fitdata.model;

// Generated 06/06/2013 09:53:01 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UsuarioperfilId generated by hbm2java
 */
@Embeddable
public class UsuarioperfilId implements java.io.Serializable {

	private String idUsuario;
	private long idEmpresa;
	private int idPerfil;

	public UsuarioperfilId() {
	}

	public UsuarioperfilId(String idUsuario, long idEmpresa, int idPerfil) {
		this.idUsuario = idUsuario;
		this.idEmpresa = idEmpresa;
		this.idPerfil = idPerfil;
	}

	@Column(name = "idUsuario", nullable = false, length = 15)
	public String getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Column(name = "idEmpresa", nullable = false)
	public long getIdEmpresa() {
		return this.idEmpresa;
	}

	public void setIdEmpresa(long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	@Column(name = "idPerfil", nullable = false)
	public int getIdPerfil() {
		return this.idPerfil;
	}

	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UsuarioperfilId))
			return false;
		UsuarioperfilId castOther = (UsuarioperfilId) other;

		return ((this.getIdUsuario() == castOther.getIdUsuario()) || (this
				.getIdUsuario() != null && castOther.getIdUsuario() != null && this
				.getIdUsuario().equals(castOther.getIdUsuario())))
				&& (this.getIdEmpresa() == castOther.getIdEmpresa())
				&& (this.getIdPerfil() == castOther.getIdPerfil());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIdUsuario() == null ? 0 : this.getIdUsuario().hashCode());
		result = 37 * result + (int) this.getIdEmpresa();
		result = 37 * result + this.getIdPerfil();
		return result;
	}

}