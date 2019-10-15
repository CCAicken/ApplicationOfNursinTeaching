package business.DAO;

import java.util.List;

import Model.TProblem;

/***
 * 
 * @author Aicken 问题模块接口设计
 */
public interface ProblemDAO {
	/**
	 * 添加问题表
	 * 
	 * @param pro
	 * @author mz
	 * @return
	 */
	public int addPro(TProblem pro);

	/**
	 * 获取所有问题信息
	 * 
	 * @return
	 */
	public List<TProblem> getAllPro();

	/**
	 * 根据问题Id获取对应问题信息
	 * 
	 * @param proId
	 * @return
	 */
	public TProblem getProById(int proId);

	/**
	 * 根据学生Id获取对应的问题信息
	 * 
	 * @param stuId
	 * @return
	 */
	public List<TProblem> getProByStuId(String stuId);

	/**
	 * 根据时间获取对应的问题信息
	 * 
	 * @param time
	 * @return
	 */
	public List<TProblem> getProByTime(String time);
}
