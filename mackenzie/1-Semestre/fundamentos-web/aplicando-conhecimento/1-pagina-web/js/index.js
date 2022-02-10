function horarios_tela_principal() {
    let msg = '';
    let data_atual = new Date();
    let dias_da_semana = [
        'Domingo', 'Segunda', 'Terça', 'Quarta', 'Quinta', 'Sexta', 'Sábado'
    ]

    if (data_atual.getHours() >= 0 && data_atual.getHours() <= 12)
        msg += 'Bom dia! '

    else if (data_atual.getHours() >= 13 && data_atual.getHours() <= 18)
        msg += msg + 'Boa tarde! '
    else
        msg += 'Boa noite! '

    let dia_confirmacao = data_atual.getDay()
    dias_da_semana[dia_confirmacao] === 'Domingo' && dias_da_semana[dia_confirmacao] === 'Sábado' ? msg += 'Hoje é ' + dias_da_semana[dia_confirmacao] : msg += 'Hoje é ' + dias_da_semana[dia_confirmacao] + ' - feira.'
    
    alert(`Meu nome é Gustavo Camalionti \nSou de Indaiatuba/ADS-MACK \n${msg}`)


}