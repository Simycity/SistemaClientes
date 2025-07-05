package model;

//Criando classe
public class Cliente{
    private int id_Clientes;
    private String Nome_Completo;
    private String CPF;
    private String Email;
    private String Telefone;
    private String Endereco;
    
    
    //Construtor
    public Cliente(String Nome_Completo, String CPF, String Email, String Telefone, String Endereco){
        this.Nome_Completo = Nome_Completo;
        this.CPF = CPF;
        this.Email = Email;
        this.Telefone = Telefone;
        this.Endereco = Endereco;
    }
    
    //Get id
    public int getId_Clientes(){
        return id_Clientes;
    }
    
    //set id
    public void setId_Clientes(int id_Clientes){
        this.id_Clientes = id_Clientes;
    }
    
    //Get nome
    public String getNome_Completo(){
        return Nome_Completo;
    }
    
    //Set nome
    public void setNome_Completo(String Nome_Completo){
        this.Nome_Completo = Nome_Completo;
    }
    
    //Get cpf
    public String getCPF(){
        return CPF;
    }
    
    //Set cpf
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    
    //Get email
    public String getEmail(){
        return Email;
    }
    
    //Set email
    public void setEmail(String Email){
        this.Email = Email;
    }
    
    //Get telefone
    public String getTelefone(){
        return Telefone;
    }
    
    //Set telefone
    public void setTelefone(String Telefone){
        this.Telefone = Telefone;
    }
    
    //Get tndereco
    public String getEndereco(){
        return Endereco;
    }
    
    //Set endereco
    public void setEndereco(String Endereco){
        this.Endereco = Endereco;
    }
}