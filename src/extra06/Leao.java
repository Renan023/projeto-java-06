
package extra06;

public class Leao extends Gato{
    protected boolean carnivoro;
    
    public Leao(boolean carnivoro,  int idade, String sexo, float peso, String nome, int patas, boolean deficiencia, String pelo) {
        super(idade, sexo, peso, nome, patas, deficiencia, pelo);
        this.carnivoro = carnivoro;
    }

    public boolean isCarnivoro() {
        return carnivoro;
    }

    public void setCarnivoro(boolean carnivoro) {
        this.carnivoro = carnivoro;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso() {
        
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    @Override
    public void locomocao(){
        if(this.getIdade()<=5){
            System.out.println(this.getNome()+" Correr e brincar");
        }else{
            System.out.println(this.getNome()+" prefere caçar");
        }
    }
    
    @Override 
    public void alimentar(){
        if(this.carnivoro==true){
            System.out.println("Carnivoro");
        }else{
            System.out.println("Herbivoro");
        }
    }
    @Override 
    public void miado(){
        System.out.println("Seu rugido grraurrr! brrrum!");
    }
    
    public void juba(){
        if(this.getSexo().equals("Macho")&& this.getIdade()>5){
            System.out.println("Já tem juba ");
        }else if (this.getSexo().equals("Macho")&& this.getIdade()<5){
            System.out.println("Não tem juba ");
        }else {
            System.out.println("Não tem juba");
        }
    }
    
}
