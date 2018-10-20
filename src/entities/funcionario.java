package entities;

public class funcionario {
	
	private int num;
	private int horas;
	private double valorHora;

	
	public funcionario(int num, int horas, double valorHora) {
		this.num = num;
		this.horas = horas;
		this.valorHora = valorHora;
	
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double salario( int horas, double valorHora) {
		return valorHora * horas;
	}
	
	
	
	

}
