package top.dianmu.ccompiler.learn.day85.backend;
import top.dianmu.ccompiler.learn.day85.frontend.*;

public class EndOptExecutor extends BaseExecutor {

	@Override
	public Object Execute(ICodeNode root) {
		
		return executeChild(root, 0);
	}

}
