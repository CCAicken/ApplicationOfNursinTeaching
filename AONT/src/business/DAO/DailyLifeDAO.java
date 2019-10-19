package business.DAO;

import java.util.List;

import Model.TDailyLife;
import Model.VDailyLife;

/***
 * 
 * @author Aicken 日常生活模块接口设计
 */
public interface DailyLifeDAO {
	/**
	 * 添加日常生活
	 * 
	 * @param TDailyLife
	 *            日常生活实体
	 * @return 返回日常生活主键
	 */
	public boolean Insert(TDailyLife TDailyLife);

	/**
	 * 删除日常生活
	 * 
	 * @param TDailyLifeid
	 *            日常生活id
	 * @return true 成功 false 失败
	 */
	public boolean delete(int TDailyLifeid);

	/**
	 * 更改日常生活
	 * 
	 * @param TDailyLife
	 *            日常生活实体
	 * @return true 成功 false 失败
	 */
	public boolean update(TDailyLife TDailyLife);

	/**
	 * 根据id查询日常生活
	 * 
	 * @return 日常生活数据实体
	 */
	public TDailyLife select(int TDailyLifeid);

	/**
	 * 查询所有日常生活
	 * 
	 * @return 日常生活数据集
	 */
	public List<VDailyLife> select();

	/**
	 * 根据条件获取符合条件的日常生活的数量
	 * 
	 * @param wherecondition
	 *            如："userRole = '超级管理员' and userid = 'zhangjs'"
	 * @return
	 */
	public int getVMainSuitAmount(String wherecondition);

	/**
	 * 根据条件查询日常生活
	 * 
	 * @param likecondtion
	 *            条件
	 * @param currentPage
	 *            开始页数
	 * @param pageSize
	 *            每页数量
	 * @return 日常生活数据集
	 */
	public List<VDailyLife> getVMainSuitByLike(String likecondtion,
			int currentPage, int pageSize);

	/**
	 * 判断病人是否已有日常生活记录
	 * 
	 * @param dlId
	 * @return
	 */
	public TDailyLife isExit(int patId);
}
