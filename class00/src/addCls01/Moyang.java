package addCls01;

public class Moyang {
	
	int width, height, rad, shape;
	double area;
	
	public Moyang() {}
	public Moyang(int rad, int shape) {
		this.rad = rad;
		this.shape =shape;
		this.area = (int)(rad*rad*Math.PI*100+0.5)/100.;
	}
	public Moyang(int width, int height, int shape) {
			this.shape = shape;
			this.width = width;
			this.height = height;
		if(shape==1) {
			this.area = width*height*0.5;
		}else if(shape==2) {
			this.area= width*height;
		}
	}
	public void toPrint() {
		if(shape == 2 || shape == 3) {
			System.out.println("삼/사각형 : " +this.width +" /"+ this.height+ "="+ this.area);
		}else if(shape == 0){
			System.out.println("원형 : "+this.rad +" = "+ this.area);
		}
	}
}