package generic;

public class ThreeDPrinter {
	private Object material;
	
	public void setMaterial(Object material) {
		this.material = material;
	}
	
	public Object getMaterial() {
		return material;
	}
	
	@Override
	public String toString() {
		return material + "";
	}

}
