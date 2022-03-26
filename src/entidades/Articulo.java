package entidades;
// Generated 27 feb 2022 12:31:33 by Hibernate Tools 5.6.3.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Articulo generated by hbm2java
 */
public class Articulo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2385359788411126882L;
	private int idarticulo;
	private Categoria categoria;
	private String codigo;
	private String nombre;
	private BigDecimal precioVenta;
	private int stock;
	private String descripcion;
	private Boolean estado;
	private Set<?> detalleIngresos = new HashSet<Object>(0);
	private Set<?> detalleVentas = new HashSet<Object>(0);

	public Articulo() {
	}

	public Articulo(int idarticulo, Categoria categoria, String nombre, BigDecimal precioVenta, int stock) {
		this.idarticulo = idarticulo;
		this.categoria = categoria;
		this.nombre = nombre;
		this.precioVenta = precioVenta;
		this.stock = stock;
	}

	public Articulo(int idarticulo, Categoria categoria, String codigo, String nombre, BigDecimal precioVenta,
			int stock, String descripcion, Boolean estado, Set<?> detalleIngresos, Set<?> detalleVentas) {
		this.idarticulo = idarticulo;
		this.categoria = categoria;
		this.codigo = codigo;
		this.nombre = nombre;
		this.precioVenta = precioVenta;
		this.stock = stock;
		this.descripcion = descripcion;
		this.estado = estado;
		this.detalleIngresos = detalleIngresos;
		this.detalleVentas = detalleVentas;
	}

	public int getIdarticulo() {
		return this.idarticulo;
	}

	public void setIdarticulo(int idarticulo) {
		this.idarticulo = idarticulo;
	}

	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecioVenta() {
		return this.precioVenta;
	}

	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Set<?> getDetalleIngresos() {
		return this.detalleIngresos;
	}

	public void setDetalleIngresos(Set<?> detalleIngresos) {
		this.detalleIngresos = detalleIngresos;
	}

	public Set<?> getDetalleVentas() {
		return this.detalleVentas;
	}

	public void setDetalleVentas(Set<?> detalleVentas) {
		this.detalleVentas = detalleVentas;
	}

}
