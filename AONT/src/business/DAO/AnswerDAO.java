package business.DAO;

import java.util.List;

import Model.TAnswer;

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
	 * 查询所有回答记录
	 * @return 记录数据集
	 */
	public List<TAnswer> select();

}
