package modelo;

import utils.Seguranca;

public class usuario {
private int id;
private String login;
private String senha;
    public Usuario() {}
    public Usuario(String login, String senha; boolean admin) {
    this.login = login;
    setSenha(senha);
    this.admin = admin;}

    public int getId(){return id;}

    public void setId(int id) {this.id = id};

    public String getLogin() {return login;}

    public String getSenha() {return senha;}
    public String setSenha(String Senha) {
        if(senha == null) {this.senha = null;}
        else if (senha.length() == 64 && senha.matches("[0-9a-fA-F]+")) {
            this.senha = senha;
        }else {
            this.senha = Seguranca.gerarHashSHA256(senha);
        }
    }
    public boolean isAdmin() {return admin; }
    public void setAdmin(boolean admin) {this.admin = admin;}

}
