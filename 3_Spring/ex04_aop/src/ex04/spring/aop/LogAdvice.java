package ex04.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

//XMl 기반 POJO 방식의 AspectJ를 이용한 AOP 방법
public class LogAdvice {
	//Around 방식의 사전/사후 처리 AOP around 방시긍로 할 때는
	//인수는 ProceedingJoinPoint, 리턴값은 object필수
	public Object arround(ProceedingJoinPoint point) throws Throwable {
		String methodName = point.getKind();
		String methodName2 = point.getSignature().getName();
		
		System.out.println("[LOG] MethodName = "+methodName+", MethodName2 = "+methodName2+" 호출 되기 전,...");
		StopWatch sw = new StopWatch();
		sw.start(methodName);
		
		Object result = point.proceed(); //실제 타겟 대상 메소드가 호출되는 부분
		sw.stop();
		System.out.println("[LOG] "+methodName+" 호출 완료 되었습니다.");
		System.out.println("[LOG] 실행 시간 : "+sw.getTotalTimeMillis()/100+"초");
		return result;
	}

	
}
