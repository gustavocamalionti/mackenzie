var txtNumat = document.getElementById("txtNumat");
var txtNome =document.getElementById("txtNome");
var txtSalario = document.getElementById("txtSalario");
var txtSexo = document.getElementById("txtSexo");
var txtNdepto = document.getElementById("txtNdepto");
var txtNsuper = document.getElementById("txtNsuper");

// Método @GET: recupera os dados de um determinado funcionário a partir de seu número de matrícula (numat): 

function popular(jsonFunc){
    txtNumat.value = jsonFunc.numat;
    txtNome.value = jsonFunc.nome;
    txtSalario.value = jsonFunc.salario;
    txtSexo.value = jsonFunc.sexo;
    txtNdepto.value = jsonFunc.ndepto;
    txtNsuper.value = jsonFunc.nsuper;

}

async function consultar() {
    fetch('http://localhost:8080/empresa/sistema/rest/funcionarios/' + txtNumat.value). 

    then(resposta => { 

        if (!resposta.ok){ 

            throw Error(resposta.status);  

        } 

        return resposta.json(); 

    }). 

    then(jsonReposta => popular(jsonReposta)).  

    catch(erro => alert("erro não encontrado numat do funcionario"));  

}

// Método @POST: adiciona um novo funcionário a partir de seu número de matrícula (numat): 

async function adicionar() {
    fetch('http://localhost:8080/empresa/sistema/rest/funcionarios/',  

  {method: 'POST', 

    body: JSON.stringify({ 

        numat: txtNumat.value, 

        nome: txtNome.value, 

        salario: txtSalario.value, 

        sexo: txtSexo.value, 

        ndepto: txtNdepto.value, 

        nsuper: txtNsuper.value

    }), 

    headers: { 

        "Content-type": "application/json" 

    } 

}). 

then(resposta => { 

   if (!resposta.ok){ 

       throw Error(resposta.status);  

   } 

   return resposta; 

 }). 

then(jsonReposta => alert("funcionario inserido.")).  

catch(erro => alert("erro na inserção."));  
}


// Método @DELETE: remove um determinado funcionário a partir de seu número de matrícula (numat): 

async function deletar(){
    fetch('http://localhost:8080/empresa/sistema/rest/funcionarios/' + txtNumat.value,{method: 'DELETE'}). 

    then(resposta => { 

        if (!resposta.ok){ 

            throw Error(resposta.status);  

        } 

        return resposta; 

        }). 

    then(jsonReposta => alert("funcionario removido")).  

    catch(erro => alert("erro não encontrado numat do funcionario")); 
   
}


// Método @PUT: atualiza os dados de um determinado funcionário a partir de seu número de matrícula (numat): 

async function atualizar(){
    fetch('http://localhost:8080/empresa/sistema/rest/funcionarios/',  

  {method: 'PUT', 

    body: JSON.stringify({ 

        numat: txtNumat.value, 

        nome: txtNome.value, 

        salario: txtSalario.value, 

        sexo: txtSexo.value, 

        ndepto: txtNdepto.value, 

        nsuper: txtNsuper.value

    }), 

    headers: { 

        "Content-type": "application/json" 

    } 

}). 

then(resposta => { 

   if (!resposta.ok){ 

       throw Error(resposta.status);  

   } 

   return resposta; 

 }). 

then(jsonReposta => alert("funcionario atualizado.")). 

catch(erro => alert("erro na atualização."));
}
