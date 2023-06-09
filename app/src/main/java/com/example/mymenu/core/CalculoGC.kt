package com.example.mymenu.core

import com.example.mymenu.global.ENUM_ESTADO_CALCULO_GC
import java.util.Date

class CalculoGC {

    var cgcIndicadorMasaCorp: Double
    var cgcEdad: Int
    var cgcSexo: Char
    var cgcResultado: Double
    var cgcEstado: String
    var cgcFechaCalculo: Date

    constructor(
        cgcIndicadorMasaCorp: Double,
        cgcEdad: Int,
        cgcSexo: Char,
        cgcResultado: Double,
        cgcEstado: String,
        cgcFechaCalculo: Date
    ) {
        this.cgcIndicadorMasaCorp = cgcIndicadorMasaCorp
        this.cgcEdad = cgcEdad
        this.cgcSexo = cgcSexo
        this.cgcResultado = cgcResultado
        this.cgcEstado = cgcEstado
        this.cgcFechaCalculo = cgcFechaCalculo
    }

    constructor() {
        this.cgcIndicadorMasaCorp = 0.0
        this.cgcEdad = 0
        this.cgcSexo = 'N'
        this.cgcResultado = 0.0
        this.cgcEstado = ENUM_ESTADO_CALCULO_GC.ACEPTABLE.name
        this.cgcFechaCalculo = Date()
    }


}