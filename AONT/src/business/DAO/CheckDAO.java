package business.DAO;

import java.util.List;

import Model.TCheck;
import Model.VCheck;

/***
 * 
 * @author Aicken 检查模块接口设计
 */
public interface CheckDAO {
	/**
	 * 添加检查
	 * 
	 * @param Check
	 *            检查实体
	 * @return 返回检查主键
	 */
	public boolean Insert(TCheck Check);

	/**
	 * 删除检查
	 * 
	 * @param TCheck
	 *            检查id
	 * @return true 成功 false 失败
	 */
	public boolean delete(int Checkid);

	/**
	 * 更改检查
	 * 
	 * @param TCheck
	 *            检查实体
	 * @return true 成功 false 失败
	 */
	public boolean update(TCheck Check);

	/**
	 * 根据id查询 检查
	 * 
	 * @return 检查数据实体
	 */
	public TCheck select(int TCheckid);

	/**
	 * 根据id查询 检查视图
	 * 
	 * @return 检查数据实体
	 */
	public VCheck selectVcheck(int Checkid);

	/**
	 * 查询所有检查
	 * 
	 * @return 检查数据集
	 */
	public List<VCheck> select();

	/**
	 * 根据条件获取符合条件的检查的数量
	 * 
	 * @param wherecondition
	 *            如："userRole = '超级管理员' and userid = 'zhangjs'"
	 * @return
	 */
	public int getVCheckAmount(String wherecondition);

	/**
	 * 根据条件查询检查
	 * 
	 * @param likecondtion
	 *            条件
	 * @param currentPage
	 *            开始页数
	 * @param pageSize
	 *            每页数量
	 * @return 检查数据集
	 */
	public List<VCheck> getVCheckByLike(String likecondtion, int currentPage,
			int pageSize);

	public TCheck isExit(int patId);
}
