package com.alura.challenge.Literatura.config;

public interface iConvertirDatos {
    <T> T convertirDatosJsonAJava(String json , Class<T> clase);
    //metodo generico que coje el json y convierte en datos Java debido a que no se sabe que retornara
}
