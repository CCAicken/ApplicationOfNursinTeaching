package business.DAO;

import java.util.List;

import Model.TDiaRecord;
import Model.TDiagnosis;
import Model.VDiagnosis;

/***
 * 
 * @author Aicken
 *诊断模块接口设计
 */
public interface DiagnosisDAO {
	/**
	 * 添加诊断
	 * @param TDiagnosis 诊断实体
	 * @return 返回诊断主键
	 */
	public boolean Insert(TDiagnosis TDiagnosis);
	/**
	 * 删除诊断
	 * @param TDiagnosisid 诊断id
	 * @return true 成功 false 失败
	 */
	public boolean delete(int TDiagnosisid);
	
	/**
	 * 更改诊断
	 * @param TDiagnosis 诊断实体
	 * @return true 成功 false 失败 
	 */
	public boolean update(TDiagnosis TDiagnosis);
	/**
	 * 根据id查询诊断 
	 * @return 诊断数据实体
	 */
	public  TDiagnosis select(int TDiagnosisid);
	/**
	 * 查询所有诊断
	 * @return 诊断数据集
	 */
	public List<VDiagnosis> select();
	
	/**
	 * 根据条件获取符合条件的诊断的数量
	 * 
	 * @param wherecondition
	 *            如："userRole = '超级管理员' and userid = 'zhangjs'"
	 * @return
	 */
	public int getAchievementrAmount(String wherecondition);
	
		
	 /**
	  * 根据条件查询诊断
	  * @param likecondtion 条件
	  * @param currentPage  开始页数
	  * @param pageSize 每页数量
	  * @return 诊断数据集
	  */
	public List<VDiagnosis> getAchievementByLike(String likecondtion,int currentPage, int pageSize);
}
