package xml.spring.ampersand.in.spring;

import org.springframework.beans.factory.FactoryBean;

public class CustomFactoryBean implements FactoryBean<MyBean> {

	MyBean myBean = new MyBean();

	@Override
	public MyBean getObject() throws Exception {
		return myBean;
	}

	@Override
	public Class<? extends MyBean> getObjectType() {
		return myBean.getClass();
	}

	@Override
	public boolean isSingleton() {
		return false;
	}
}
