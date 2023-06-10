package com.example.control_4_imc.util;

import java.text.DecimalFormat;
import java.util.HashMap;

public class ImcCalculadoraUtil {

    public static HashMap<String, Object> calcularIMC(double imc) {
        String estado;

        if (imc <= 20) {
            estado = ConstantsUtils.ESTADO_BAJO_PESO;
        } else if (imc <= 24.9) {
            estado = ConstantsUtils.ESTADO_NORMAL;
        } else if (imc <= 27.5) {
            estado = ConstantsUtils.ESTADO_SOBRE_PESO;
        } else {
            estado = ConstantsUtils.ESTADO_OBESIDAD;
        }

        DecimalFormat df = new DecimalFormat("#.00");
        String formattedIMC = df.format(imc);

        HashMap<String, Object> resultado = new HashMap<>();
        resultado.put(ConstantsUtils.ESTADO, estado);
        resultado.put(ConstantsUtils.IMC, formattedIMC);

        return resultado;
    }
}
