package br.com.fitsoft.fitdata.model;

// Generated 06/06/2013 09:53:01 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Tipoauxiliar generated by hbm2java
 */
@Entity
@Table(name = "tipoauxiliar", catalog = "fitdata")
public class Tipoauxiliar implements java.io.Serializable {

	private TipoauxiliarId id;
	private Empresa empresa;
	private String descricaoTipo;
	private Date dataLogUpdate;
	private String usuarioLogUpdate;
	private Date dataLogInclusao;
	private String usuarioLogInclusao;
	private Set<Auxiliar> auxiliars = new HashSet<Auxiliar>(0);

	public Tipoauxiliar() {
	}

	public Tipoauxiliar(TipoauxiliarId id, Empresa empresa,
			String descricaoTipo, Date dataLogUpdate, String usuarioLogUpdate,
			Date dataLogInclusao, String usuarioLogInclusao) {
		this.id = id;
		this.empresa = empresa;
		this.descricaoTipo = descricaoTipo;
		this.dataLogUpdate = dataLogUpdate;
		this.usuarioLogUpdate = usuarioLogUpdate;
		this.dataLogInclusao = dataLogInclusao;
		this.usuarioLogInclusao = usuarioLogInclusao;
	}

	public Tipoauxiliar(TipoauxiliarId id, Empresa empresa,
			String descricaoTipo, Date dataLogUpdate, String usuarioLogUpdate,
			Date dataLogInclusao, String usuarioLogInclusao,
			Set<Auxiliar> auxiliars) {
		this.id = id;
		this.empresa = empresa;
		this.descricaoTipo = descricaoTipo;
		this.dataLogUpdate = dataLogUpdate;
		this.usuarioLogUpdate = usuarioLogUpdate;
		this.dataLogInclusao = dataLogInclusao;
		this.usuarioLogInclusao = usuarioLogInclusao;
		this.auxiliars = auxiliars;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idEmpresa", column = @Column(name = "idEmpresa", nullable = false)),
			@AttributeOverride(name = "idTipo", column = @Column(name = "idTipo", nullable = false)) })
	public TipoauxiliarId getId() {
		return this.id;
	}

	public void setId(TipoauxiliarId id) {
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

	@Column(name = "descricaoTipo", nullable = false, length = 50)
	public String getDescricaoTipo() {
		return this.descricaoTipo;
	}

	public void setDescricaoTipo(String descricaoTipo) {
		this.descricaoTipo = descricaoTipo;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoauxiliar")
	public Set<Auxiliar> getAuxiliars() {
		return this.auxiliars;
	}

	public void setAuxiliars(Set<Auxiliar> auxiliars) {
		this.auxiliars = auxiliars;
	}

}
