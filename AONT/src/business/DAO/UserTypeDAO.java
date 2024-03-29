package business.DAO;

import java.util.List;

import Model.TUserType;

/***
 * 
 * @author Aicken 用户类型模块接口设计
 */
public interface UserTypeDAO {
	/**
	 * 获取所有用户类型信息
	 * 
	 * @return
	 */
	public List<TUserType> getAllUserTypes();

	/**
	 * 根据用户类型Id获取用户类型信息
	 * 
	 * @param userTypeId
	 * @return
	 */
	public TUserType getByUserTypeId(int userTypeId);
}
