/**
 * 
 */
package org.wso2.bpmn.helloworld.v2;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

/**
 * @author mehmet
 * 
 *         Hello World Service Task - Version 2.
 */
public class HelloWorldServiceTaskV2 implements JavaDelegate {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.activiti.engine.delegate.JavaDelegate#execute(org.activiti.engine
	 * .delegate.DelegateExecution)
	 */
	@Override
	public void execute(DelegateExecution arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello !!! 2. version of HelloWorld BPMN process.");

	}

}
