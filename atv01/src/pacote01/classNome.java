package pacote01;

public class classNome{
    public  classNome() {
        
    }
    public classNome(String nome,String sobrenome ,int matricula){
        setNome(nome);
        setSobrenome(sobrenome);
        setMatricula(matricula);
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    private String nome;
    private String sobrenome;
    private int matricula;
    

}
