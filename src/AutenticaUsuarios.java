
public class AutenticaUsuarios {
	private int senha;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			System.out.println("Pode entrar no sistema");
			return true;
		}else {
			System.out.println("Não pode entrar no sistema");
			return false;
		}
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
}
