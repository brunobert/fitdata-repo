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
 * Perfilfuncao generated by hbm2java
 */
@Entity
@Table(name = "perfilfuncao", catalog = "fitdata")
public class Perfilfuncao implements java.io.Serializable {

	private PerfilfuncaoId id;
	private Perfil perfil;
	private Empresa empresa;
	private Funcao funcao;
	private Date dataLogUpdate;
	private String usuarioLogUpdate;
	private Date dataLogInclusao;
	private String usuarioLogInclusao;

	public Perfilfuncao() {
	}

	public Perfilfuncao(PerfilfuncaoId id, Perfil perfil, Empresa empresa,
			Funcao funcao, Date dataLogUpdate, String usuarioLogUpdate,
			Date dataLogInclusao, String usuarioLogInclusao) {
		this.id = id;
		this.perfil = perfil;
		this.empresa = empresa;
		this.funcao = funcao;
		this.dataLogUpdate = dataLogUpdate;
		this.usuarioLogUpdate = usuarioLogUpdate;
		this.dataLogInclusao = dataLogInclusao;
		this.usuarioLogInclusao = usuarioLogInclusao;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idEmpresa", column = @Column(name = "idEmpresa", nullable = false)),
			@AttributeOverride(name = "idPerfil", column = @Column(name = "idPerfil", nullable = false)),
			@AttributeOverride(name = "idFuncao", column = @Column(name = "idFuncao", nullable = false)) })
	public PerfilfuncaoId getId() {
		return this.id;
	}

	public void setId(PerfilfuncaoId id) {
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
	@JoinColumn(name = "idEmpresa", nullable = false, insertable = false, updatable = false)
	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "idEmpresa", referencedColumnName = "idEmpresa", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "idFuncao", referencedColumnName = "idFuncao", nullable = false, insertable = false, updatable = false) })
	public Funcao getFuncao() {
		return this.funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
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