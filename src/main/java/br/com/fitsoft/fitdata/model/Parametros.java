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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Parametros generated by hbm2java
 */
@Entity
@Table(name = "parametros", catalog = "fitdata")
public class Parametros implements java.io.Serializable {

	private ParametrosId id;
	private Empresa empresa;
	private String descParam;
	private String valorParam;
	private char tipoParam;
	private char flagSistema;
	private Integer valorRangeMin;
	private Integer valorRangeMax;
	private Integer valorPadrao;
	private String listaValores;
	private Date dataLogUpdate;
	private String usuarioLogUpdate;
	private Date dataLogInclusao;
	private String usuarioLogInclusao;

	public Parametros() {
	}

	public Parametros(ParametrosId id, Empresa empresa, String descParam,
			char tipoParam, char flagSistema, Date dataLogUpdate,
			String usuarioLogUpdate, Date dataLogInclusao,
			String usuarioLogInclusao) {
		this.id = id;
		this.empresa = empresa;
		this.descParam = descParam;
		this.tipoParam = tipoParam;
		this.flagSistema = flagSistema;
		this.dataLogUpdate = dataLogUpdate;
		this.usuarioLogUpdate = usuarioLogUpdate;
		this.dataLogInclusao = dataLogInclusao;
		this.usuarioLogInclusao = usuarioLogInclusao;
	}

	public Parametros(ParametrosId id, Empresa empresa, String descParam,
			String valorParam, char tipoParam, char flagSistema,
			Integer valorRangeMin, Integer valorRangeMax, Integer valorPadrao,
			String listaValores, Date dataLogUpdate, String usuarioLogUpdate,
			Date dataLogInclusao, String usuarioLogInclusao) {
		this.id = id;
		this.empresa = empresa;
		this.descParam = descParam;
		this.valorParam = valorParam;
		this.tipoParam = tipoParam;
		this.flagSistema = flagSistema;
		this.valorRangeMin = valorRangeMin;
		this.valorRangeMax = valorRangeMax;
		this.valorPadrao = valorPadrao;
		this.listaValores = listaValores;
		this.dataLogUpdate = dataLogUpdate;
		this.usuarioLogUpdate = usuarioLogUpdate;
		this.dataLogInclusao = dataLogInclusao;
		this.usuarioLogInclusao = usuarioLogInclusao;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idEmpresa", column = @Column(name = "idEmpresa", nullable = false)),
			@AttributeOverride(name = "idParam", column = @Column(name = "idParam", nullable = false, length = 5)) })
	public ParametrosId getId() {
		return this.id;
	}

	public void setId(ParametrosId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idEmpresa", nullable = false, insertable = false, updatable = false)
	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	@Column(name = "descParam", nullable = false, length = 200)
	public String getDescParam() {
		return this.descParam;
	}

	public void setDescParam(String descParam) {
		this.descParam = descParam;
	}

	@Column(name = "valorParam", length = 500)
	public String getValorParam() {
		return this.valorParam;
	}

	public void setValorParam(String valorParam) {
		this.valorParam = valorParam;
	}

	@Column(name = "tipoParam", nullable = false, length = 1)
	public char getTipoParam() {
		return this.tipoParam;
	}

	public void setTipoParam(char tipoParam) {
		this.tipoParam = tipoParam;
	}

	@Column(name = "flagSistema", nullable = false, length = 1)
	public char getFlagSistema() {
		return this.flagSistema;
	}

	public void setFlagSistema(char flagSistema) {
		this.flagSistema = flagSistema;
	}

	@Column(name = "valorRangeMin")
	public Integer getValorRangeMin() {
		return this.valorRangeMin;
	}

	public void setValorRangeMin(Integer valorRangeMin) {
		this.valorRangeMin = valorRangeMin;
	}

	@Column(name = "valorRangeMax")
	public Integer getValorRangeMax() {
		return this.valorRangeMax;
	}

	public void setValorRangeMax(Integer valorRangeMax) {
		this.valorRangeMax = valorRangeMax;
	}

	@Column(name = "valorPadrao")
	public Integer getValorPadrao() {
		return this.valorPadrao;
	}

	public void setValorPadrao(Integer valorPadrao) {
		this.valorPadrao = valorPadrao;
	}

	@Column(name = "listaValores", length = 1000)
	public String getListaValores() {
		return this.listaValores;
	}

	public void setListaValores(String listaValores) {
		this.listaValores = listaValores;
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