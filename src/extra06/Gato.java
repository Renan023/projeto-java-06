
package extra06;


public class Gato extends Felino {
    protected String porte;
    protected int idade;
    protected float peso;

    public Gato(int idade, String sexo,float peso, String nome, int patas, boolean deficiencia, String pelo) {
        super(nome,sexo, patas, deficiencia, pelo);
        this.setIdade(idade);
        this.setPeso(peso);
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setPorte();
    }
   
    
    public String getPorte() {
        return porte;
    }

    public void setPorte() {
        if(this.peso>=50){
            if(this.peso<=105){
                this.porte = "Pequeno";
            }else if (this.peso<5000){
                this.porte = "Médio";
            }else if (this.peso>=5000){
                this.porte = "Grande";
            }
        }else{
            this.porte = "Inválido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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
    
    @Override
    public void locomocao(){
       if(this.getIdade()<=3){
           System.out.println(this.getNome()+" Gosta de correr e brincar");
    }else if ( this.getIdade() >3){
           System.out.println(this.getNome()+" prefere Carinho e dormir");
       }else{
           System.out.println(this.getNome()+ " está deitado");
    }
    }    
    
    public void alimentar(int hora, int min){
        if (hora<12 ) {
            System.out.println("Ração");
        } else if (hora <=19 ){
            System.out.println("Carne");
        }else if (hora <= 21){
            System.out.println("Queijo");
        }else{
            System.out.println("Bebendo água");
        }
    }
    
    @Override
    public void miado(){
        System.out.println("Seu miado Miau!miau!miau");
    }
    
    public void adoucr(){
        if(this.getIdade ()<3){
            System.out.println("Ainda é filhote");
        }else{
            System.out.println("Já é adulto");
        }
    }
    
    public void status(){
        System.out.println("------------------------------------");
        System.out.println("Nome "+this.getNome());
        System.out.println("Idade "+this.getIdade()+" ano(s)");
        System.out.println("Sexo "+this.getSexo());
        System.out.println("Peso "+this.getPeso()+"g");
        System.out.println("Porte "+this.getPorte());
        System.out.println("Deficiência "+this.isDeficiencia());
        System.out.println("Cor do Pelo "+this.getPelo());
    }
    
}


