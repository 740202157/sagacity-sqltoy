/**
 * 
 */
package org.sagacity.sqltoy.model;

import java.io.Serializable;

import javax.sql.DataSource;

/**
 * @description 提供给代码中组织sql进行数据库update操作
 * @author renfei.chen <a href="mailto:zhongxuchen@hotmail.com">联系作者</a>
 * @version id:EntityUpdate.java,Revision:v1.0,Date:2020-5-15
 */
public class EntityUpdate implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6476698994760985087L;

	public static EntityUpdate create() {
		return new EntityUpdate();
	}

	/**
	 * 内部参数对象模型,减少开发时大量的get对开发的影响
	 */
	private EntityUpdateExtend innerModel = new EntityUpdateExtend();

	public EntityUpdate set(String param, Object value) {
		innerModel.updateValues.put(param, value);
		return this;
	}

	/**
	 * @TODO 设置条件
	 * @param where
	 * @return
	 */
	public EntityUpdate where(String where) {
		innerModel.where = where;
		return this;
	}

	public EntityUpdate values(Object... values) {
		innerModel.values = values;
		return this;
	}

	public EntityUpdate dataSource(DataSource dataSource) {
		innerModel.dataSource = dataSource;
		return this;
	}

	public EntityUpdateExtend getInnerModel() {
		return innerModel;
	}

}
