
//OPERADORES
document.write("Olá, estamos começando no Javascript!<br><br>");
var x = 15;
x = x/(3+5) + (4-2);
document.write("Resultado de x é: ", x, "<br>"); //Aritméticos
var valor = 2;
var resposta = false;
resposta = (valor == 2);
document.write("A var resposta é: ", resposta, "<br>"); //Relacionais
var valor = 30;
var teste = false;
teste = valor < 40 && valor > 20;
document.write("A var teste é: ", teste, "<br>"); //Operador lógico T && T

teste = valor > 30 || valor > 20;
document.write("A var teste é: ", teste, "<br><br>"); //Operador Lógico F || T

// OPERADOR TERNARIO

document.write("Exemplo 1: Operador Ternário <br>")
var var_sexo = "M";
var sexo = ((var_sexo =="F") ? "Masculino" : "Feminino");
document.write(sexo, "<br>")

document.write("Exemplo 2: Operador Ternário <br>")
var x = 20;
var y = ((x== 21) ? 50 : 70);
document.write(y + "<br>")

var VariavelNumerica = 5310513901
document.write("Qualquer string com valor " + VariavelNumerica + " Numérico")
