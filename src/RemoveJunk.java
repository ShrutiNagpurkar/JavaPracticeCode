
public class RemoveJunk {

	public static void main(String[] args) {
		String a ="R$%@#$#$%@#$@$#$#^DWUY latin string ^&GLU";
		a=a.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(a);
	}
}