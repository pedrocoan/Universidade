package exxpoo5.com;

//Nessa classe vai ser instanciado os metodos e criado os objetos/*
public class AplicacaoAluno {

	public static void main(String[] args) {
		 //Atribuindo os valores e imprimindo na telaq*
        double[] notasPresencial = {7.0, 8.0, 6.5, 9.0};
        Aluno alunoPresencial = new Aluno("João Silva", "123456", notasPresencial, 80);
        alunoPresencial.imprimirDadosAluno();

       
        double[] notasEad = {7.0, 6.5, 8.5};
        Aluno alunoEad = new Aluno("Maria Oliveira", "654321", notasEad);
        alunoEad.imprimirDadosAluno();
    }


	

}

