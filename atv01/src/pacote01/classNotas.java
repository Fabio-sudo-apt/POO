package pacote01;

public class classNotas {
    public classNotas(){

    }
    public classNotas(double av1, double av2){
        setAv1(av1);
        setAv2(av2);
    }
    public void setAv1(double av1){
        this.av1 = av1;
    }
    public double getAv1(){
        return av1;
    }
    public void setAv2(double av2){
        this.av2 = av2;
    }
    public double getAv2(){
        return av2;
    }
    public double getMedia(){
        return (this.av1 + this.av2) / 2;
    }
    private double av1;
    private double av2;
}
