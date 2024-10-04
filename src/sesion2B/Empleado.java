package sesion2B;

public class Empleado {

	public enum TipoEmpleado {VENDEDOR, ENCARGADO};
	public float salarioBase = 0;
	public float primas = 0;
	public float extra = 0;
	public TipoEmpleado tipo;
	
	
	public float calculoNominaBruta(TipoEmpleado tipo, float ventaMes, float horasExtra) {
		if(tipo == TipoEmpleado.VENDEDOR) {
			salarioBase = 2000;
		}else if(tipo == TipoEmpleado.ENCARGADO) {
			salarioBase = 2500;
		}
		if(ventaMes >= 1500){
			primas =200;
		}else if(ventaMes >= 1000){
			primas = 100;
		}
		extra = horasExtra*30;
		return salarioBase+primas+extra;
	}
	
	public float calculoNominaNeta(float nominaBruta) {
		float calculoRetencion = 0;
		if(nominaBruta >= 2500) {
			calculoRetencion = 0.18f;
		}else if(nominaBruta >=2100) {
			calculoRetencion=0.15f;
		}
		return nominaBruta*(1-calculoRetencion);
	}
	
}
