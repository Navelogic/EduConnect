package Fase5;

public class MainF5 {
    public static void main(String[] args) {

        AutenticavelF5 diretor = new AdministradorF5("Tiago Arruda", "admin", "123456");
        AutenticavelF5 prof = new ProfessorF5("Girafales", "prof.mestre", "cafe123", "Matemática", "REG-99");
        AutenticavelF5 aluno = new AlunoF5("Navelogic", "navelogic.dev", "java2025", "MAT-001", null);

        System.out.println("=== SISTEMA DE SEGURANÇA FASE 5 ===\n");

        System.out.println("Teste 1: Admin tentando logar...");
        validarAcesso(diretor, "admin", "123456");

        System.out.println("Teste 2: Professor com senha errada...");
        validarAcesso(prof, "prof.mestre", "senhaerrada");

        System.out.println("Teste 3: Aluno tentando logar...");
        validarAcesso(aluno, "navelogic.dev", "java2025");
    }


    public static void validarAcesso(AutenticavelF5 usuario, String login, String senha) {
        boolean sucesso = usuario.autenticar(login, senha);

        if (sucesso) {
            System.out.println(">> RESULTADO: ✅ Acesso Liberado");
        } else {
            System.out.println(">> RESULTADO: ❌ Acesso Negado (Credenciais Inválidas)");
        }
        System.out.println("---------------------------------------");
    }
}