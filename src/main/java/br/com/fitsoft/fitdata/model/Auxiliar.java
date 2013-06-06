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
 * Auxiliar generated by hbm2java
 */
@Entity
@Table(name = "auxiliar", catalog = "fitdata")
public class Auxiliar implements java.io.Serializable {

	private AuxiliarId id;
	private Tipoauxiliar tipoauxiliar;
	private String descAux;
	private char flagSituacao;
	private char flagSistema;
	private Date dataLogUpdate;
	private String usuarioLogUpdate;
	private Date dataLogInclusao;
	private String usuarioLogInclusao;

	public Auxiliar() {
	}

	public Auxiliar(AuxiliarId id, Tipoauxiliar tipoauxiliar, String descAux,
			char flagSituacao, char flagSistema, Date dataLogUpdate,
			String usuarioLogUpdate, Date dataLogInclusao,
			String usuarioLogInclusao) {
		this.id = id;
		this.tipoauxiliar = tipoauxiliar;
		this.descAux = descAux;
		this.flagSituacao = flagSituacao;
		this.flagSistema = flagSistema;
		this.dataLogUpdate = dataLogUpdate;
		this.usuarioLogUpdate = usuarioLogUpdate;
		this.dataLogInclusao = dataLogInclusao;
		this.usuarioLogInclusao = usuarioLogInclusao;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idEmpresa", column = @Column(name = "idEmpresa", nullable = false)),
			@AttributeOverride(name = "idTipo", column = @Column(name = "idTipo", nullable = false)),
			@AttributeOverride(name = "idAux", column = @Column(name = "idAux", nullable = false)) })
	public AuxiliarId getId() {
		return this.id;
	}

	public void setId(AuxiliarId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "idEmpresa", referencedColumnName = "idEmpresa", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "idTipo", referencedColumnName = "idTipo", nullable = false, insertable = false, updatable = false) })
	public Tipoauxiliar getTipoauxiliar() {
		return this.tipoauxiliar;
	}

	public void setTipoauxiliar(Tipoauxiliar tipoauxiliar) {
		this.tipoauxiliar = tipoauxiliar;
	}

	@Column(name = "descAux", nullable = false, length = 50)
	public String getDescAux() {
		return this.descAux;
	}

	public void setDescAux(String descAux) {
		this.descAux = descAux;
	}

	@Column(name = "flagSituacao", nullable = false, length = 1)
	public char getFlagSituacao() {
		return this.flagSituacao;
	}

	public void setFlagSituacao(char flagSituacao) {
		this.flagSituacao = flagSituacao;
	}

	@Column(name = "flagSistema", nullable = false, length = 1)
	public char getFlagSistema() {
		return this.flagSistema;
	}

	public void setFlagSistema(char flagSistema) {
		this.flagSistema = flagSistema;
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
