class Banca
{
    private String[] professores;
    Banca(String[] professores){
        this.professores = professores;
    }
    @Override
    public String toString(){
        String resp = "";
        if(professores.length > 0){
            resp = "Banca: ";
            for(int i = 0 ; i < professores.length; i++){
                resp += professores[i] + ",";
            }
        }
        return resp;
    }
}