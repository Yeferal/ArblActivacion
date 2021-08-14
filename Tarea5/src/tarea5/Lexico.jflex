package tarea5;
import java_cup.runtime.*;
import java.util.ArrayList;

%%
%{
    //coidgo de usuario en sintaxis java
    

%}

    //directivas
%public 
%class AnalizadorLexico
%cupsym Simbolos
%cup
%char
%line
%column
%full
//%ignorecase
//%unicode

//expreciones regulares

Letra               = [a-zA-Z]
Digito              = [0-9]
Numero              = {Digito} {Digito}*
Palabra             = {Letra}+
Espacio             = [" "\t\r\b\n]+
//Salto               = [\n\t\r" "]+
%%

<YYINITIAL> {
    {Espacio}                       {/*Ignore*/}
    "("                             {System.out.print("("); return new Symbol(Simbolos.P_A , yycolumn, yyline, yytext());}
    ")"                             {System.out.print(")"); return new Symbol(Simbolos.P_C , yycolumn, yyline, yytext());}
    "programa"                      {System.out.print(yytext()); return new Symbol(Simbolos.PROGRAMA , yycolumn, yyline, yytext());}
    "procedimiento"                 {System.out.print(yytext()); return new Symbol(Simbolos.PROCEDIMIENTO , yycolumn, yyline, yytext());}
    ("param"("s")?)                 {System.out.print(yytext()); return new Symbol(Simbolos.PARAMETRO , yycolumn, yyline, yytext());}
    ";"                             {System.out.print(yytext()); return new Symbol(Simbolos.PUNTO_COMA , yycolumn, yyline, yytext());}
    "end"                           {System.out.print(yytext()); return new Symbol(Simbolos.END , yycolumn, yyline, yytext());}
    "begin"                         {System.out.print(yytext()); return new Symbol(Simbolos.BEGIN , yycolumn, yyline, yytext());}
    ":"                             {System.out.print(yytext()); return new Symbol(Simbolos.DOS_PUNTOS , yycolumn, yyline, yytext());}
    "integer"                       {System.out.print(yytext()); return new Symbol(Simbolos.INTEGER , yycolumn, yyline, yytext());}
    ":="                            {System.out.print(yytext()); return new Symbol(Simbolos.IGUAL , yycolumn, yyline, yytext());}
    ","                             {System.out.print(yytext()); return new Symbol(Simbolos.COMA , yycolumn, yyline, yytext());}
    (({Palabra})({Numero})*)*       {System.out.println(yytext()); return new Symbol(Simbolos.ID , yycolumn, yyline, yytext());}
    ({Numero})                      {System.out.println(yytext()); return new Symbol(Simbolos.NUMERO , yycolumn, yyline, yytext());}
    
    .                           {System.out.println("CUALQUIER_SIM: "+yytext()); 
                                    //ErrorG e = new ErrorG(yyline+1, yycolumn+1,yytext(),"Lexico","Error Lexico token: " + yytext()+"   Linea: " + (yyline+1) + " ,    Columna: " + (yycolumn+1));
                                    //listaErrores.add(e);
                                    //return new Symbol(Simbolos.CUALQUIER_SIM , yycolumn, yyline, yytext());
                                    }
    
}

