package business.DAO;

import java.util.List;

import Model.TDepartment;
import Model.TDiagnosis;

/***
 * 
 * @author Aicken
 *科室模块接口设计
 */
public interface DepartmentDAO {
	/**
	 * 添加科室
	 * @param TDepartment 科室实体
	 * @return 返回科室主键
	 */
	public boolean Insert(TDepartment TDepartment);
	/**
	 * 删除科室
	 * @param TDepartmentid 科室id
	 * @return true 成功 false 失败
	 */
	public boolean delete(int TDepartmentid);
	
	/**
	 * 更改科室
	 * @param TDepartment 科室实体
	 * @return true 成功 false 失败 
	 */
	public boolean update(TDepartment TDepartment);
	/**
	 * 根据id查询科室
	 * @return 科室数据实体
	 */
	public  TDepartment select(int TDepartmentid);
	/**
	 * 查询所有科室
	 * @return 科室数据集
	 */
	public List<TDepartment> select();
	
	/**
	 * 根据条件获取符合条件的科室的数量
	 * 
	 * @param wherecondition
	 *            如："userRole = '超级管理员' and userid = 'zhangjs'"
	 * @return
	 */
	public int getAchievementrAmount(String wherecondition);
	
		
	 /**
	  * 根据条件查询科室
	  * @param likecondtion 条件
	  * @param currentPage  开始页数
	  * @param pageSize 每页数量
	  * @return 科室数据集
	  */
	public List<TDepartment> getAchievementByLike(String likecondtion,int currentPage, int pageSize);
}
