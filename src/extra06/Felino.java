
package extra06;

public abstract class Felino {
    protected String nome;
    protected String som;
    protected int patas;
    protected boolean deficiencia;
    protected String pelo;
    protected String sexo;

    public Felino(String nome,String sexo,  int patas, boolean deficiencia, String pelo) {
        this.nome = nome;
        this.patas = patas;
        this.deficiencia = deficiencia;
        this.pelo = pelo;
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public boolean isDeficiencia() {
        return deficiencia;
    }

    public void setDeficiencia(boolean deficiencia) {
        this.deficiencia = deficiencia;
    }

    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }
    
    public void locomocao(){
        
    }
    
    public void alimentar(){
        
    }
    
    public void miado(){
        
    } 
}
