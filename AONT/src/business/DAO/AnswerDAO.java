package business.DAO;

import java.util.List;

import Model.TAnswer;
import Model.TCheck;
import Model.VAchievement;

/***
 * 
 * @author Aicken
 *	回答模块接口设计
 */
public interface AnswerDAO {
	/**
	 * 
	 * 添加回答记录
	 * @param answer
	 * @return true成功 false 失败
	 */
	public boolean insert(TAnswer answer);
	/**
	 * 根据id查询 检查
	 * @return  检查数据实体
	 */
	public  TAnswer select(int TAnswerid);
	/**
	 * 查询所有回答记录
	 * @return 记录数据集
	 */
	public List<TAnswer> select();
	
	/**
	 * 根据条件获取符合条件的答案的数量
	 * 
	 * @param wherecondition
	 *            如："userRole = '超级管理员' and userid = 'zhangjs'"
	 * @return
	 */
	public int getAnswerAmount(String wherecondition);
	
		
	 /**
	  * 根据条件查询答案
	  * @param likecondtion 条件
	  * @param currentPage  开始页数
	  * @param pageSize 每页数量
	  * @return 成绩数据集
	  */
	public List<TAnswer> getAnswerByLike(String likecondtion,int currentPage, int pageSize);

}
