package business.DAO;

import java.util.List;

import Model.TExam;
import Model.VExam;

/***
 * 
 * @author Aicken 考试模块接口设计
 */

public interface ExamDAO {
	/**
	 * 添加考试
	 * 
	 * @param TExam
	 *            考试实体
	 * @return 返回考试主键
	 */
	public boolean Insert(TExam TExam);

	/**
	 * 删除考试
	 * 
	 * @param TExamid
	 *            考试id
	 * @return true 成功 false 失败
	 */
	public boolean delete(int TExamid);

	/**
	 * 根据id查询考试
	 * 
	 * @return 考试数据实体
	 */
	public TExam select(int TExamid);

	/**
	 * 更改考试
	 * 
	 * @param TExam
	 *            考试实体
	 * @return true 成功 false 失败
	 */
	public boolean update(TExam TExam);

	/**
	 * 查询所有考试
	 * 
	 * @return 考试数据集
	 */
	public List<VExam> select();

	/**
	 * 根据条件获取符合条件的考试的数量
	 * 
	 * @param wherecondition
	 *            如："userRole = '超级管理员' and userid = 'zhangjs'"
	 * @return
	 */
	public int getVExamAmount(String wherecondition);

	/**
	 * 根据条件查询考试
	 * 
	 * @param likecondtion
	 *            条件
	 * @param currentPage
	 *            开始页数
	 * @param pageSize
	 *            每页数量
	 * @return 考试数据集
	 */
	public List<VExam> getVExamByLike(String likecondtion, int currentPage,
			int pageSize);
}
