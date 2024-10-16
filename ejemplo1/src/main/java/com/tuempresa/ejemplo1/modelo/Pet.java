package com.tuempresa.ejemplo1.modelo;

import java.math.*;
import java.time.*;
import org.openxava.model.*;
import javax.persistence.*;
import lombok.*;
import org.openxava.annotations.*;


@Entity @Getter @Setter

public class Pet {

	Private String name;
	Private String breed;
	Private String description;
	Private Localdate dateBirth;
}