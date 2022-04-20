console.log("Atividade feita por: Gustavo Camalionti Gomes");

const BASE_URL = 'https://superheroapi.com/api.php/2496364390592143';

 


function getRandom() {
    return Math.floor(Math.random() * 731) + 1;
}

function PrimeiroHeroi(id) {
    var url = BASE_URL + "/" + id;

    callAPI(url, function(status,data) {
        var name = data.name 
        var intelligence = data.powerstats.intelligence
        var strength = data.powerstats.strength
        var speed = data.powerstats.speed
        var durability = data.powerstats.durability
        var power = data.powerstats.power
        var combat = data.powerstats.combat
        var image = data.image.url

        
        soma_habilidades_1 = intelligence + strength + speed + durability + power + combat
        document.getElementById("content").innerHTML += "<div class='card' id='primeiro-card'>"+
        "<img src='" + image + "' class='card-img-top'>" +
                "<div class='card-body'>" +
                    "<h6>"+ name+ ""+"</h6>"+
                    "<hr>" +
                    "<ul>" +
                        "<li>Intelligence: <span style = 'width:" + intelligence + "%; background-color: #F9832F'></span></li>" +
                        "<li>Strength: <span style = 'width:" + strength + "%; background-color: #FF7C6C'></span></li>" +
                        "<li>Speed: <span style = 'width:" + speed + "%; background-color: #22A7F0'></span></li>" +
                        "<li>Durability: <span style = 'width:" + durability + "%; background-color: #3EDC81'></span></li>" +
                        "<li>Power: <span style = 'width:" + power + "%; background-color: #AB69C6'></span></li>" +
                        "<li>Combat: <span style = 'width:" + combat + "%; background-color: #9CAAB9'></span></li>" +
                    "</ul>" +
            "</div>"+
            "</div>";

    })
}

function SegundoHeroi(id) {
    var url = BASE_URL + "/" + id;

    callAPI(url, function(status,data) {
        var name = data.name
        var intelligence = data.powerstats.intelligence
        var strength = data.powerstats.strength
        var speed = data.powerstats.speed
        var durability = data.powerstats.durability
        var power = data.powerstats.power
        var combat = data.powerstats.combat
        var image = data.image.url

        
        soma_habilidades_2 = intelligence + strength + speed + durability + power + combat
        document.getElementById("content").innerHTML += "<div class='card' id='segundo-card'>"+
        "<img src='" + image + "' class='card-img-top'>" +
                "<div class='card-body'>" +
                    "<h6>"+ name+ ""+"</h6>"+
                    "<hr>" +
                    "<ul>" +
                        "<li>Intelligence: <span style = 'width:" + intelligence + "%; background-color: #F9832F'></span></li>" +
                        "<li>Strength: <span style = 'width:" + strength + "%; background-color: #FF7C6C'></span></li>" +
                        "<li>Speed: <span style = 'width:" + speed + "%; background-color: #22A7F0'></span></li>" +
                        "<li>Durability: <span style = 'width:" + durability + "%; background-color: #3EDC81'></span></li>" +
                        "<li>Power: <span style = 'width:" + power + "%; background-color: #AB69C6'></span></li>" +
                        "<li>Combat: <span style = 'width:" + combat + "%; background-color: #9CAAB9'></span></li>" +
                    "</ul>" +
            "</div>"+
            "</div>";

    })
}

window.onload = function () {
    var soma_habilidades_1  
    var soma_habilidades_2 
    this.PrimeiroHeroi(getRandom());
    this.SegundoHeroi(getRandom());

    console.log(soma_habilidades_1);
    console.log(soma_habilidades_2);
    if (soma_habilidades_1 > soma_habilidades_2) {
        alert("Primeiro herói vence!")
    } else {
        alert("Segundo Herói Vence!")
    }
    
}


function callAPI(url, callback){
    var xhr = new XMLHttpRequest();
    xhr.responseType = 'json';
    xhr.open('GET', url, true);
    xhr.onload = function(){
        if(xhr.status === 200){
            console.log('Dados recebidos com sucesso');
            
            callback(xhr.status, xhr.response);

        }else{
            console.log('Problema ao conectar com a API: ' + xhr.status);
        }
    }
    xhr.send();
}


