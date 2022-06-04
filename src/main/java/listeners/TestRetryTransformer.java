package listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class TestRetryTransformer implements IAnnotationTransformer {

	public void tranform(ITestAnnotation annotation, Class testClass, Constructor constructor, Method testMethod) {
		annotation.setRetryAnalyzer(TestRetryListeners.class);
	}
}
