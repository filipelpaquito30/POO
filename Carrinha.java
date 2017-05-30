
/**
 * Escreva a descrição da classe Carrinha aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Carrinha extends Viatura {
    
public Carrinha(double velocidade, double custo, Posicao p, Motorista m, String matricula){
        super(velocidade,custo,p,m,matricula);
}

public Carrinha(){
    super();
    
}

public Carrinha(Carrinha u){
    super(u.getVelocidade(),u.getCusto(),u.getP(),u.getMotorista(),u.getMatricula());
}

public Carrinha clone(){
    return new Carrinha(this);
}
 }

