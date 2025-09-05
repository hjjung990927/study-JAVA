package selfLambda;

@FunctionalInterface
public interface SelfPrintName {
	String getFullName(String firstName, String lastName);
}
