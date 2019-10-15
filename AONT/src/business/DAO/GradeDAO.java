package business.DAO;

import java.util.List;

import Model.TGrade;
import Model.TGrade;

/***
 * 
 * @author Aicken
 *年级模块接口设计
 */

public interface GradeDAO {
	/**
	 * 
	 * 添加年级
	 * @param answer
	 * @return true成功 false 失败
	 */
	public boolean insert(TGrade Grade);
	
	/**
	 * 根据id查询年级
	 * @return 年级 
	 */
	public  TGrade select(int gradeid);
	
	/**
	 * 查询所有年级
	 * @return 年级数据集
	 */
	public List<TGrade> select();
	
	/**
	 * 根据条件获取符合条件的答案的数量
	 * 
	 * @param wherecondition
	 *            如："userRole = '超级管理员' and userid = 'zhangjs'"
	 * @return
	 */
	public int geTGradeAmount(String wherecondition);
	
		
	 /**
	  * 根据条件查询答案
	  * @param likecondtion 条件
	  * @param currentPage  开始页数
	  * @param pageSize 每页数量
	  * @return 成绩数据集
	  */
	public List<TGrade> geTGradeByLike(String likecondtion,int currentPage, int pageSize);

}
