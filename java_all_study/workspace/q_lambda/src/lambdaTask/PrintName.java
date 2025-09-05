package lambdaTask;

@FunctionalInterface
public interface PrintName {
	String getFullName(String firstName, String lastName);
}