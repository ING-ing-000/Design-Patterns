package StatePattern;

public class DeadState extends ThreadState {

	public DeadState() {
		state=StateSet.DEAD;
		System.out.println("阻塞线程");
	}
	public void resume(ThreadContext tc) {
		System.out.println("调用了resume方法");
		if(state==StateSet.BLOCKED)
			tc.setThreadState(new RunnableState());
		else 
			System.out.println("当前线程不是新建状态");
	}
}
