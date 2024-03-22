package generic;

public class GenericPrinter<T extends Material> {
	private T material;
	
	public void setMaterial(T material) {
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
