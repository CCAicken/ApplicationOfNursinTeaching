package business.DAO;

import java.util.List;

import Model.TDiaRecord;
import Model.TExam;
import Model.VDiagnosis;

/**
 * 
 * @author Aicken
 *诊断记录记录模块接口设计
 */
public interface DiaRecrdDAO {
	/**
	 * 添加诊断记录
	 * @param TDiaRecord 诊断记录实体
	 * @return 返回诊断记录主键
	 */
	public boolean Insert(TDiaRecord TDiaRecord);
	/**
	 * 删除诊断记录
	 * @param TDiaRecordid 诊断记录id
	 * @return true 成功 false 失败
	 */
	public boolean delete(int TDiaRecordid);
	
	/**
	 * 更改诊断记录
	 * @param TDiaRecord 诊断记录实体
	 * @return true 成功 false 失败 
	 */
	public boolean update(TDiaRecord TDiaRecord);
	/**
	 * 根据id查询诊断记录
	 * @return 诊断记录数据实体
	 */
	public  TDiaRecord select(int TDiaRecordid);
	/**
	 * 查询所有诊断记录
	 * @return 诊断记录数据集
	 */
	public List<VDiagnosis> select();
	
	/**
	 * 根据条件获取符合条件的诊断记录的数量
	 * 
	 * @param wherecondition
	 *            如："userRole = '超级管理员' and userid = 'zhangjs'"
	 * @return
	 */
	public int getAchievementrAmount(String wherecondition);
	
		
	 /**
	  * 根据条件查询诊断记录
	  * @param likecondtion 条件
	  * @param currentPage  开始页数
	  * @param pageSize 每页数量
	  * @return 诊断记录数据集
	  */
	public List<VDiagnosis> getAchievementByLike(String likecondtion,int currentPage, int pageSize);
}
