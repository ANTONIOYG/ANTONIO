package com.antonio.antonio;

public class estructura_db {

    public static final int DB_VERSION = 1;
    public static final String TABLA = "hora";
    public static final String DBNAME = "antonio.db";

    //NOMBRE DE LAS COLUMNAS

    public static final String COLID = "id";
    public static final String MES = "mes";
    public static final String DIA = "dia";
    public static final String ENTRADA = "hentrada";
    public static final String SALIDA = "salida";
    public static final String OBRA = "obra";
    public static final String COMPI = "compi";


    //ARRAY DE COLUMNAS

    public static final String[] COLUMNAS = {COLID,MES,DIA,ENTRADA,SALIDA,OBRA,COMPI};

    //CREAR BASE DATOS

    public static final String CREAR_TABLA = "CREATE TABLE "+TABLA+" ("
            +COLID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+MES+" TEXT, "
            +DIA+" TEXT, "+ENTRADA+" TEXT, "+SALIDA+" TEXT, "
            +OBRA+" TEXT, "+COMPI+" TEXT );";
}
