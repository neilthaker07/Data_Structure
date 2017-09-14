package progs;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class LearningReflectionTesting {

	
	public static void main(String qp[])
	{
		
		Class ref = LearnReflection.class;
		
		System.out.println(ref.getClass().getName());
		
		try {
			
			// private property
			
			String varName = "a";
			Field privateVar = ref.getDeclaredField(varName);
			privateVar.setAccessible(true);
			
			LearnReflection lr = new LearnReflection();
			String valueVar = (String) privateVar.get(lr);
			System.out.println("yahoo 1 "+valueVar);
		
			
			
			// private method
			
			String methodName = "testing";
			
			Method privateMethod = ref.getDeclaredMethod(methodName, null);
			privateMethod.setAccessible(true);
			
			int methodValue = (Integer) privateMethod.invoke(lr, null);
			System.out.println("yahoo 2"+ methodValue);
			
			
			
			// private method with parameters
			
			
			Class[] methodParams = new Class[]{Integer.TYPE};
			Object[] params = new Object[]{9999};
			
			String methodName2 = "test2";
			privateMethod = ref.getDeclaredMethod(methodName2, methodParams);
			privateMethod.setAccessible(true);
			
			Integer op = (Integer)privateMethod.invoke(lr, params);
			System.out.println("HOOU " + op);
			
			
		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
