package exxpoo5.com;

//Nessa classe sera criado toda logica e metodos pra ser aplicado em outra classe/*
public class Aluno {
	//Criando os atributos/*
	 private String nome;
	    private String ra; 
	    private double[] notas;
	    private boolean ead; 
	    private double presenca; 

	    // Construtor para disciplinas presenciais/*
	    public Aluno(String nome, String ra, double[] notas, double presenca) {
	        this.nome = nome;
	        this.ra = ra;
	        this.notas = notas;
	        this.presenca = presenca;
	        this.ead = false; 
	    }

	    // Construtor para disciplinas EAD/*
	    public Aluno(String nome, String ra, double[] notas) {
	        this.nome = nome;
	        this.ra = ra;
	        this.notas = notas;
	        this.ead = true; 
	        this.presenca = 100; 
	    }

	    // Método para calcular a nota final de acordo com o número de avaliações/*
	    public double calcularNotaFinal() {
	        int numeroNotas = notas.length;
	        double notaFinal = 0.0;

	        switch (numeroNotas) {
	            case 2:
	            
	                notaFinal = (notas[0] + notas[1]) / 2;
	                break;
	            case 3:
	                
	                notaFinal = (notas[0] + notas[1] * 2 + notas[2] * 4) / 7;
	                break;
	            case 4:
	                
	                notaFinal = (notas[0] * 0.15) + (notas[1] * 0.30) + (notas[2] * 0.10) + (notas[3] * 0.45);
	                break;
	            default:
	           System.out.println("Número de avaliações inválido.");
	                break;
	        }

	        return notaFinal;
	    }

	    // Método para verificar a situação do aluno/*
	    public String verificarSituacao() {
	        double notaFinal = calcularNotaFinal();

	        
	        if (!ead && presenca < 75) {
	            return "Reprovado por falta";
	        }

	        // Verificar se a nota é suficiente para aprovação/*
	        if (notaFinal >= 5) {
	            return "Aprovado";
	        } else {
	            return "Reprovado";
	        }
	    }

	    // Método para imprimir os dados do aluno/*
	    public void imprimirDadosAluno() {
	        double notaFinal = calcularNotaFinal();
	        String situacao = verificarSituacao();

	        System.out.println("Nome: " + nome);
	        System.out.println("RA: " + ra);
	        System.out.println("Nota Final: " + notaFinal);
	        System.out.println("Situação: " + situacao);
	    }

	    // Criando os getters and setters/*
	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getRa() {
	        return ra;
	    }

	    public void setRa(String ra) {
	        this.ra = ra;
	    }

	    public double[] getNotas() {
	        return notas;
	    }

	    public void setNotas(double[] notas) {
	        this.notas = notas;
	    }

	    public double getPresenca() {
	        return presenca;
	    }

	    public void setPresenca(double presenca) {
	        this.presenca = presenca;
	    }

	    public boolean isEad() {
	        return ead;
	    }

	    public void setEad(boolean ead) {
	        this.ead = ead;
	    }
	}


