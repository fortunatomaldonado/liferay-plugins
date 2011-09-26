/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.workflow.kaleo.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portal.workflow.kaleo.model.KaleoTaskForm;
import com.liferay.portal.workflow.kaleo.model.KaleoTaskFormModel;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the KaleoTaskForm service. Represents a row in the &quot;KaleoTaskForm&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.portal.workflow.kaleo.model.KaleoTaskFormModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link KaleoTaskFormImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoTaskFormImpl
 * @see com.liferay.portal.workflow.kaleo.model.KaleoTaskForm
 * @see com.liferay.portal.workflow.kaleo.model.KaleoTaskFormModel
 * @generated
 */
public class KaleoTaskFormModelImpl extends BaseModelImpl<KaleoTaskForm>
	implements KaleoTaskFormModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a kaleo task form model instance should use the {@link com.liferay.portal.workflow.kaleo.model.KaleoTaskForm} interface instead.
	 */
	public static final String TABLE_NAME = "KaleoTaskForm";
	public static final Object[][] TABLE_COLUMNS = {
			{ "kaleoTaskFormId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "kaleoDefinitionId", Types.BIGINT },
			{ "kaleoTaskId", Types.BIGINT },
			{ "description", Types.VARCHAR },
			{ "formTemplateId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table KaleoTaskForm (kaleoTaskFormId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(200) null,createDate DATE null,modifiedDate DATE null,kaleoDefinitionId LONG,kaleoTaskId LONG,description STRING null,formTemplateId LONG)";
	public static final String TABLE_SQL_DROP = "drop table KaleoTaskForm";
	public static final String ORDER_BY_JPQL = " ORDER BY kaleoTaskForm.kaleoTaskFormId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY KaleoTaskForm.kaleoTaskFormId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.portal.workflow.kaleo.model.KaleoTaskForm"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.portal.workflow.kaleo.model.KaleoTaskForm"),
			true);

	public Class<?> getModelClass() {
		return KaleoTaskForm.class;
	}

	public String getModelClassName() {
		return KaleoTaskForm.class.getName();
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.portal.workflow.kaleo.model.KaleoTaskForm"));

	public KaleoTaskFormModelImpl() {
	}

	public long getPrimaryKey() {
		return _kaleoTaskFormId;
	}

	public void setPrimaryKey(long primaryKey) {
		setKaleoTaskFormId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_kaleoTaskFormId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public long getKaleoTaskFormId() {
		return _kaleoTaskFormId;
	}

	public void setKaleoTaskFormId(long kaleoTaskFormId) {
		_kaleoTaskFormId = kaleoTaskFormId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getKaleoDefinitionId() {
		return _kaleoDefinitionId;
	}

	public void setKaleoDefinitionId(long kaleoDefinitionId) {
		if (!_setOriginalKaleoDefinitionId) {
			_setOriginalKaleoDefinitionId = true;

			_originalKaleoDefinitionId = _kaleoDefinitionId;
		}

		_kaleoDefinitionId = kaleoDefinitionId;
	}

	public long getOriginalKaleoDefinitionId() {
		return _originalKaleoDefinitionId;
	}

	public long getKaleoTaskId() {
		return _kaleoTaskId;
	}

	public void setKaleoTaskId(long kaleoTaskId) {
		if (!_setOriginalKaleoTaskId) {
			_setOriginalKaleoTaskId = true;

			_originalKaleoTaskId = _kaleoTaskId;
		}

		_kaleoTaskId = kaleoTaskId;
	}

	public long getOriginalKaleoTaskId() {
		return _originalKaleoTaskId;
	}

	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	public void setDescription(String description) {
		_description = description;
	}

	public long getFormTemplateId() {
		return _formTemplateId;
	}

	public void setFormTemplateId(long formTemplateId) {
		_formTemplateId = formTemplateId;
	}

	@Override
	public KaleoTaskForm toEscapedModel() {
		if (isEscapedModel()) {
			return (KaleoTaskForm)this;
		}
		else {
			if (_escapedModelProxy == null) {
				_escapedModelProxy = (KaleoTaskForm)ProxyUtil.newProxyInstance(_classLoader,
						_escapedModelProxyInterfaces,
						new AutoEscapeBeanHandler(this));
			}

			return _escapedModelProxy;
		}
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					KaleoTaskForm.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		KaleoTaskFormImpl kaleoTaskFormImpl = new KaleoTaskFormImpl();

		kaleoTaskFormImpl.setKaleoTaskFormId(getKaleoTaskFormId());
		kaleoTaskFormImpl.setGroupId(getGroupId());
		kaleoTaskFormImpl.setCompanyId(getCompanyId());
		kaleoTaskFormImpl.setUserId(getUserId());
		kaleoTaskFormImpl.setUserName(getUserName());
		kaleoTaskFormImpl.setCreateDate(getCreateDate());
		kaleoTaskFormImpl.setModifiedDate(getModifiedDate());
		kaleoTaskFormImpl.setKaleoDefinitionId(getKaleoDefinitionId());
		kaleoTaskFormImpl.setKaleoTaskId(getKaleoTaskId());
		kaleoTaskFormImpl.setDescription(getDescription());
		kaleoTaskFormImpl.setFormTemplateId(getFormTemplateId());

		kaleoTaskFormImpl.resetOriginalValues();

		return kaleoTaskFormImpl;
	}

	public int compareTo(KaleoTaskForm kaleoTaskForm) {
		int value = 0;

		if (getKaleoTaskFormId() < kaleoTaskForm.getKaleoTaskFormId()) {
			value = -1;
		}
		else if (getKaleoTaskFormId() > kaleoTaskForm.getKaleoTaskFormId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		KaleoTaskForm kaleoTaskForm = null;

		try {
			kaleoTaskForm = (KaleoTaskForm)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = kaleoTaskForm.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		KaleoTaskFormModelImpl kaleoTaskFormModelImpl = this;

		kaleoTaskFormModelImpl._originalCompanyId = kaleoTaskFormModelImpl._companyId;

		kaleoTaskFormModelImpl._setOriginalCompanyId = false;

		kaleoTaskFormModelImpl._originalKaleoDefinitionId = kaleoTaskFormModelImpl._kaleoDefinitionId;

		kaleoTaskFormModelImpl._setOriginalKaleoDefinitionId = false;

		kaleoTaskFormModelImpl._originalKaleoTaskId = kaleoTaskFormModelImpl._kaleoTaskId;

		kaleoTaskFormModelImpl._setOriginalKaleoTaskId = false;
	}

	@Override
	public CacheModel<KaleoTaskForm> toCacheModel() {
		KaleoTaskFormCacheModel kaleoTaskFormCacheModel = new KaleoTaskFormCacheModel();

		kaleoTaskFormCacheModel.kaleoTaskFormId = getKaleoTaskFormId();

		kaleoTaskFormCacheModel.groupId = getGroupId();

		kaleoTaskFormCacheModel.companyId = getCompanyId();

		kaleoTaskFormCacheModel.userId = getUserId();

		kaleoTaskFormCacheModel.userName = getUserName();

		String userName = kaleoTaskFormCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			kaleoTaskFormCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			kaleoTaskFormCacheModel.createDate = createDate.getTime();
		}
		else {
			kaleoTaskFormCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			kaleoTaskFormCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			kaleoTaskFormCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		kaleoTaskFormCacheModel.kaleoDefinitionId = getKaleoDefinitionId();

		kaleoTaskFormCacheModel.kaleoTaskId = getKaleoTaskId();

		kaleoTaskFormCacheModel.description = getDescription();

		String description = kaleoTaskFormCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			kaleoTaskFormCacheModel.description = null;
		}

		kaleoTaskFormCacheModel.formTemplateId = getFormTemplateId();

		return kaleoTaskFormCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{kaleoTaskFormId=");
		sb.append(getKaleoTaskFormId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", kaleoDefinitionId=");
		sb.append(getKaleoDefinitionId());
		sb.append(", kaleoTaskId=");
		sb.append(getKaleoTaskId());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", formTemplateId=");
		sb.append(getFormTemplateId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.liferay.portal.workflow.kaleo.model.KaleoTaskForm");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>kaleoTaskFormId</column-name><column-value><![CDATA[");
		sb.append(getKaleoTaskFormId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoDefinitionId</column-name><column-value><![CDATA[");
		sb.append(getKaleoDefinitionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kaleoTaskId</column-name><column-value><![CDATA[");
		sb.append(getKaleoTaskId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>formTemplateId</column-name><column-value><![CDATA[");
		sb.append(getFormTemplateId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = KaleoTaskForm.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			KaleoTaskForm.class
		};
	private long _kaleoTaskFormId;
	private long _groupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _kaleoDefinitionId;
	private long _originalKaleoDefinitionId;
	private boolean _setOriginalKaleoDefinitionId;
	private long _kaleoTaskId;
	private long _originalKaleoTaskId;
	private boolean _setOriginalKaleoTaskId;
	private String _description;
	private long _formTemplateId;
	private transient ExpandoBridge _expandoBridge;
	private KaleoTaskForm _escapedModelProxy;
}