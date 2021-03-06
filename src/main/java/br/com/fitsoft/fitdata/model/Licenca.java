package br.com.fitsoft.fitdata.model;

// Generated 06/06/2013 09:53:01 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Licenca generated by hbm2java
 */
@Entity
@Table(name = "licenca", catalog = "fitdata")
public class Licenca implements java.io.Serializable {

	private long idLicenca;
	private Empresa empresa;
	private String numeroLicenca;
	private Integer anoLicenca;
	private String versaoLicenca;
	private Date dataContrato;
	private String tipoLicenca;
	private Date dataValidade;
	private String idHd;
	private String chaveLogica;
	private String ultimoPatch;
	private Date dataUltimoPatch;
	private Date dataLogUpdate;
	private String usuarioLogUpdate;
	private Date dataLogInclusao;
	private String usuarioLogInclusao;

	public Licenca() {
	}

	public Licenca(long idLicenca, Empresa empresa, Date dataLogUpdate,
			String usuarioLogUpdate, Date dataLogInclusao,
			String usuarioLogInclusao) {
		this.idLicenca = idLicenca;
		this.empresa = empresa;
		this.dataLogUpdate = dataLogUpdate;
		this.usuarioLogUpdate = usuarioLogUpdate;
		this.dataLogInclusao = dataLogInclusao;
		this.usuarioLogInclusao = usuarioLogInclusao;
	}

	public Licenca(long idLicenca, Empresa empresa, String numeroLicenca,
			Integer anoLicenca, String versaoLicenca, Date dataContrato,
			String tipoLicenca, Date dataValidade, String idHd,
			String chaveLogica, String ultimoPatch, Date dataUltimoPatch,
			Date dataLogUpdate, String usuarioLogUpdate, Date dataLogInclusao,
			String usuarioLogInclusao) {
		this.idLicenca = idLicenca;
		this.empresa = empresa;
		this.numeroLicenca = numeroLicenca;
		this.anoLicenca = anoLicenca;
		this.versaoLicenca = versaoLicenca;
		this.dataContrato = dataContrato;
		this.tipoLicenca = tipoLicenca;
		this.dataValidade = dataValidade;
		this.idHd = idHd;
		this.chaveLogica = chaveLogica;
		this.ultimoPatch = ultimoPatch;
		this.dataUltimoPatch = dataUltimoPatch;
		this.dataLogUpdate = dataLogUpdate;
		this.usuarioLogUpdate = usuarioLogUpdate;
		this.dataLogInclusao = dataLogInclusao;
		this.usuarioLogInclusao = usuarioLogInclusao;
	}

	@Id
	@Column(name = "idLicenca", unique = true, nullable = false)
	public long getIdLicenca() {
		return this.idLicenca;
	}

	public void setIdLicenca(long idLicenca) {
		this.idLicenca = idLicenca;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idEmpresa", nullable = false)
	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	@Column(name = "numeroLicenca", length = 45)
	public String getNumeroLicenca() {
		return this.numeroLicenca;
	}

	public void setNumeroLicenca(String numeroLicenca) {
		this.numeroLicenca = numeroLicenca;
	}

	@Column(name = "anoLicenca")
	public Integer getAnoLicenca() {
		return this.anoLicenca;
	}

	public void setAnoLicenca(Integer anoLicenca) {
		this.anoLicenca = anoLicenca;
	}

	@Column(name = "versaoLicenca", length = 10)
	public String getVersaoLicenca() {
		return this.versaoLicenca;
	}

	public void setVersaoLicenca(String versaoLicenca) {
		this.versaoLicenca = versaoLicenca;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dataContrato", length = 10)
	public Date getDataContrato() {
		return this.dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	@Column(name = "tipoLicenca", length = 50)
	public String getTipoLicenca() {
		return this.tipoLicenca;
	}

	public void setTipoLicenca(String tipoLicenca) {
		this.tipoLicenca = tipoLicenca;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dataValidade", length = 19)
	public Date getDataValidade() {
		return this.dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	@Column(name = "idHD", length = 45)
	public String getIdHd() {
		return this.idHd;
	}

	public void setIdHd(String idHd) {
		this.idHd = idHd;
	}

	@Column(name = "chaveLogica", length = 45)
	public String getChaveLogica() {
		return this.chaveLogica;
	}

	public void setChaveLogica(String chaveLogica) {
		this.chaveLogica = chaveLogica;
	}

	@Column(name = "ultimoPatch", length = 10)
	public String getUltimoPatch() {
		return this.ultimoPatch;
	}

	public void setUltimoPatch(String ultimoPatch) {
		this.ultimoPatch = ultimoPatch;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dataUltimoPatch", length = 19)
	public Date getDataUltimoPatch() {
		return this.dataUltimoPatch;
	}

	public void setDataUltimoPatch(Date dataUltimoPatch) {
		this.dataUltimoPatch = dataUltimoPatch;
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
