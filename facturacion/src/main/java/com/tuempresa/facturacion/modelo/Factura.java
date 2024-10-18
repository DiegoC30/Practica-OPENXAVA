package com.tuempresa.facturacion.modelo;

import java.time.*;
import java.util.*;

import javax.persistence.*;
import javax.persistence.Entity;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;
import org.openxava.calculators.*;

import com.tuempresa.facturacion.calculadores.*;

import lombok.*;

@Entity @Getter @Setter
public class Factura {

	@Id
	@GeneratedValue(generator="System-uuid")
	@Hidden
	@GenericGenerator(name="System-uuid", strategy = "uuid")
	String oid;
	
	@DefaultValueCalculator(CurrentYearCalculator.class)
	@Column(length=4)
	int anyo;
	
	@Column(length=6)
	@DefaultValueCalculator(value = CalculadorSiguienteNumeroParaAnyo.class,
	properties = @PropertyValue(name = "anyo"))
	int numero;
	
	@Required
	@DefaultValueCalculator(CurrentLocalDateCalculator.class)
	LocalDate fecha;
	
	@ManyToOne(fetch = FetchType.LAZY, optional=false)
	Cliente cliente;
	
	@ElementCollection
	@ListProperties("producto.numero, producto.description,cantidad")
	Collection<Detalle> detalles;
	
	@Stereotype("MEMO")
	String observaciones;
}
