package com.example.control_4_imc.dto;

import com.example.control_4_imc.util.ConstantsUtils;
import com.example.control_4_imc.util.ImcCalculadoraUtil;
import java.util.HashMap;

public class ImcDTO {
    private double peso;
    private double estatura;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public ImcDTO(double peso, double estatura) {
        this.peso = peso;
        this.estatura = estatura;
    }

    public String calcularImc(){

        HashMap<String, Object> resultado = ImcCalculadoraUtil.calcularIMC(peso / (estatura * estatura / 10000.0));



        return "Su IMC es " + resultado.get(ConstantsUtils.IMC) + " y  su estado nutricional es " + resultado.get(ConstantsUtils.ESTADO);
    }
}
