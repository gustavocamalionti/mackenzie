console.log("Atividade feita por: Gustavo Camalionti Gomes");

var url = "https://api.covid19api.com/dayone/country/brazil";

function dateFormat(date){
    var data = new Date(date),
        dia  = data.getDate().toString().padStart(2, '0'),
        mes  = (data.getMonth()+1).toString().padStart(2, '0'), //+1 pois no getMonth Janeiro começa com zero.
        ano  = data.getFullYear();
    return dia+"/"+mes+"/"+ano;
}

function getJSON(url, callback){
    var xhr = new XMLHttpRequest();

    xhr.open('GET', url, true);

    xhr.responseType = 'json';

    xhr.onload = function(){
        if(xhr.status === 200){
            console.log('Dados recebidos com sucesso');

            callback(xhr.response);
        }else{
            console.log('Problema ao conectar com a API: ' + xhr.status);
        }
    }

    xhr.send();
}

getJSON(url, function(data){
    //data.length
    for(var i=0; i<data.length; i++){
        //console.log(data[i]);

        document.getElementById("content").innerHTML += "<div class='card'>"+
                "<div class='card-body'>" +
                    "<h6> Data: "+ dateFormat(data[i].Date)+"</h6>"+
                    "<hr>" +
                    "<ul>" +
                        "<li>País: " + data[i].Country + "</li>" +
                        "<li>Código do País: " + data[i].CountryCode + "</li>" +
                        "<li>Província: " + data[i].Province + "</li>" +
                        "<li>Cidade: " + data[i].City + "</li>" +
                        "<li>Código da Cidade: " + data[i].CityCode +"</li>" +
                        "<li>Latitude: " + data[i].Lat + "</li>" +
                        "<li>Longitude: " + data[i].Lon + "</li>" +
                        "<li>Confirmados: <span class='badge rounded-pill bg-success'>" + data[i].Confirmed + "</span></li>" +
                        "<li>Mortes: <span class='badge rounded-pill bg-danger'>" + data[i].Deaths + "</span></li>" +
                        "<li>Recuperados: <span class='badge rounded-pill bg-info text-dark'>" + data[i].Recovered +"</span></li>" +
                        "<li>Ativos: " +  data[i].Active + "</li>" +
                        "<li>Chave: <span class='badge rounded-pill bg-primary'>" + data[i].ID + "</span></li>" +
                    "</ul>" +
            "</div>"+
            "</div>";
    }
});'        '