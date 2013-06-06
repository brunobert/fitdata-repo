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
 * Usuariosistema generated by hbm2java
 */
@Entity
@Table(name = "usuariosistema", catalog = "fitdata")
public class Usuariosistema implements java.io.Serializable {

	private UsuariosistemaId id;
	private Usuario usuario;
	private Sistema sistema;
	private Date dataExpiracao;
	private Date dataAlteracaoPerfil;
	private Date dataPrimeiroAcesso;
	private Date dataUltimoAcesso;
	private char flagSituacao;
	private Date dataLogUpdate;
	private String usuarioLogUpdate;
	private Date dataLogInclusao;
	private String usuarioLogInclusao;

	public Usuariosistema() {
	}

	public Usuariosistema(UsuariosistemaId id, Usuario usuario,
			Sistema sistema, char flagSituacao, Date dataLogUpdate,
			String usuarioLogUpdate, Date dataLogInclusao,
			String usuarioLogInclusao) {
		this.id = id;
		this.usuario = usuario;
		this.sistema = sistema;
		this.flagSituacao = flagSituacao;
		this.dataLogUpdate = dataLogUpdate;
		this.usuarioLogUpdate = usuarioLogUpdate;
		this.dataLogInclusao = dataLogInclusao;
		this.usuarioLogInclusao = usuarioLogInclusao;
	}

	public Usuariosistema(UsuariosistemaId id, Usuario usuario,
			Sistema sistema, Date dataExpiracao, Date dataAlteracaoPerfil,
			Date dataPrimeiroAcesso, Date dataUltimoAcesso, char flagSituacao,
			Date dataLogUpdate, String usuarioLogUpdate, Date dataLogInclusao,
			String usuarioLogInclusao) {
		this.id = id;
		this.usuario = usuario;
		this.sistema = sistema;
		this.dataExpiracao = dataExpiracao;
		this.dataAlteracaoPerfil = dataAlteracaoPerfil;
		this.dataPrimeiroAcesso = dataPrimeiroAcesso;
		this.dataUltimoAcesso = dataUltimoAcesso;
		this.flagSituacao = flagSituacao;
		this.dataLogUpdate = dataLogUpdate;
		this.usuarioLogUpdate = usuarioLogUpdate;
		this.dataLogInclusao = dataLogInclusao;
		this.usuarioLogInclusao = usuarioLogInclusao;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idUsuario", column = @Column(name = "idUsuario", nullable = false, length = 15)),
			@AttributeOverride(name = "idEmpresa", column = @Column(name = "idEmpresa", nullable = false)),
			@AttributeOverride(name = "idSistema", column = @Column(name = "idSistema", nullable = false)) })
	public UsuariosistemaId getId() {
		return this.id;
	}

	public void setId(UsuariosistemaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUsuario", nullable = false, insertable = false, updatable = false)
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "idEmpresa", referencedColumnName = "idEmpresa", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "idSistema", referencedColumnName = "idSistema", nullable = false, insertable = false, updatable = false) })
	public Sistema getSistema() {
		return this.sistema;
	}

	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dataExpiracao", length = 19)
	public Date getDataExpiracao() {
		return this.dataExpiracao;
	}

	public void setDataExpiracao(Date dataExpiracao) {
		this.dataExpiracao = dataExpiracao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dataAlteracaoPerfil", length = 19)
	public Date getDataAlteracaoPerfil() {
		return this.dataAlteracaoPerfil;
	}

	public void setDataAlteracaoPerfil(Date dataAlteracaoPerfil) {
		this.dataAlteracaoPerfil = dataAlteracaoPerfil;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dataPrimeiroAcesso", length = 19)
	public Date getDataPrimeiroAcesso() {
		return this.dataPrimeiroAcesso;
	}

	public void setDataPrimeiroAcesso(Date dataPrimeiroAcesso) {
		this.dataPrimeiroAcesso = dataPrimeiroAcesso;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dataUltimoAcesso", length = 19)
	public Date getDataUltimoAcesso() {
		return this.dataUltimoAcesso;
	}

	public void setDataUltimoAcesso(Date dataUltimoAcesso) {
		this.dataUltimoAcesso = dataUltimoAcesso;
	}

	@Column(name = "flagSituacao", nullable = false, length = 1)
	public char getFlagSituacao() {
		return this.flagSituacao;
	}

	public void setFlagSituacao(char flagSituacao) {
		this.flagSituacao = flagSituacao;
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