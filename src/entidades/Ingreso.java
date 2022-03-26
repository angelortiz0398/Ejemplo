package entidades;
// Generated 27 feb 2022 12:31:33 by Hibernate Tools 5.6.3.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Ingreso generated by hbm2java
 */
public class Ingreso implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8284837787588101411L;
	private int idingreso;
	private Persona persona;
	private Usuario usuario;
	private String tipoComprobante;
	private String serieComprobante;
	private String numComprobante;
	private Date fecha;
	private BigDecimal impuesto;
	private BigDecimal total;
	private String estado;
	private Set<?> detalleIngresos = new HashSet<Object>(0);

	public Ingreso() {
	}

	public Ingreso(int idingreso, Persona persona, Usuario usuario, String tipoComprobante, String numComprobante,
			Date fecha, BigDecimal impuesto, BigDecimal total, String estado) {
		this.idingreso = idingreso;
		this.persona = persona;
		this.usuario = usuario;
		this.tipoComprobante = tipoComprobante;
		this.numComprobante = numComprobante;
		this.fecha = fecha;
		this.impuesto = impuesto;
		this.total = total;
		this.estado = estado;
	}

	public Ingreso(int idingreso, Persona persona, Usuario usuario, String tipoComprobante, String serieComprobante,
			String numComprobante, Date fecha, BigDecimal impuesto, BigDecimal total, String estado,
			Set<?> detalleIngresos) {
		this.idingreso = idingreso;
		this.persona = persona;
		this.usuario = usuario;
		this.tipoComprobante = tipoComprobante;
		this.serieComprobante = serieComprobante;
		this.numComprobante = numComprobante;
		this.fecha = fecha;
		this.impuesto = impuesto;
		this.total = total;
		this.estado = estado;
		this.detalleIngresos = detalleIngresos;
	}

	public int getIdingreso() {
		return this.idingreso;
	}

	public void setIdingreso(int idingreso) {
		this.idingreso = idingreso;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getTipoComprobante() {
		return this.tipoComprobante;
	}

	public void setTipoComprobante(String tipoComprobante) {
		this.tipoComprobante = tipoComprobante;
	}

	public String getSerieComprobante() {
		return this.serieComprobante;
	}

	public void setSerieComprobante(String serieComprobante) {
		this.serieComprobante = serieComprobante;
	}

	public String getNumComprobante() {
		return this.numComprobante;
	}

	public void setNumComprobante(String numComprobante) {
		this.numComprobante = numComprobante;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getImpuesto() {
		return this.impuesto;
	}

	public void setImpuesto(BigDecimal impuesto) {
		this.impuesto = impuesto;
	}

	public BigDecimal getTotal() {
		return this.total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Set<?> getDetalleIngresos() {
		return this.detalleIngresos;
	}

	public void setDetalleIngresos(Set<?> detalleIngresos) {
		this.detalleIngresos = detalleIngresos;
	}

}
