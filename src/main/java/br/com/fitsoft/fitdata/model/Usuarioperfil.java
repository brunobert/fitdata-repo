package br.com.fitsoft.fitdata.model;

// Generated 06/06/2013 09:53:01 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Usuarioperfil generated by hbm2java
 */
@Entity
@Table(name = "usuarioperfil", catalog = "fitdata")
public class Usuarioperfil implements java.io.Serializable {

	private UsuarioperfilId id;
	private Perfil perfil;
	private Usuario usuario;
	private Date dataLogUpdate;
	private String usuarioLogUpdate;
	private Date dataLogInclusao;
	private String usuarioLogInclusao;

	public Usuarioperfil() {
	}

	public Usuarioperfil(UsuarioperfilId id, Perfil perfil, Usuario usuario,
			Date dataLogUpdate, String usuarioLogUpdate, Date dataLogInclusao,
			String usuarioLogInclusao) {
		this.id = id;
		this.perfil = perfil;
		this.usuario = usuario;
		this.dataLogUpdate = dataLogUpdate;
		this.usuarioLogUpdate = usuarioLogUpdate;
		this.dataLogInclusao = dataLogInclusao;
		this.usuarioLogInclusao = usuarioLogInclusao;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idUsuario", column = @Column(name = "idUsuario", nullable = false, length = 15)),
			@AttributeOverride(name = "idEmpresa", column = @Column(name = "idEmpresa", nullable = false)),
			@AttributeOverride(name = "idPerfil", column = @Column(name = "idPerfil", nullable = false)) })
	public UsuarioperfilId getId() {
		return this.id;
	}

	public void setId(UsuarioperfilId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "idEmpresa", referencedColumnName = "idEmpresa", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "idPerfil", referencedColumnName = "idPerfil", nullable = false, insertable = false, updatable = false) })
	public Perfil getPerfil() {
		return this.perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUsuario", nullable = false, insertable = false, updatable = false)
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dataLogUpdate", nullable = false, length = 19)
	public Date getDataLogUpdate() {
		return this.dataLogUpdate;
	}

	public void setDataLogUpdate(Date dataLogUpdate) {
		this.dataLogUpdate = dataLogUpdate;
	}

	@Column(name = "usuarioLogUpdate", nullable = false, length = 15)
	public String getUsuarioLogUpdate() {
		return this.usuarioLogUpdate;
	}

	public void setUsuarioLogUpdate(String usuarioLogUpdate) {
		this.usuarioLogUpdate = usuarioLogUpdate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dataLogInclusao", nullable = false, length = 19)
	public Date getDataLogInclusao() {
		return this.dataLogInclusao;
	}

	public void setDataLogInclusao(Date dataLogInclusao) {
		this.dataLogInclusao = dataLogInclusao;
	}

	@Column(name = "usuarioLogInclusao", nullable = false, length = 15)
	public String getUsuarioLogInclusao() {
		return this.usuarioLogInclusao;
	}

	public void setUsuarioLogInclusao(String usuarioLogInclusao) {
		this.usuarioLogInclusao = usuarioLogInclusao;
	}

}
