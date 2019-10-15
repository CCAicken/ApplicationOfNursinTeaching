package business.DAO;

import Model.TAchievement;

/***
 * 
 * @author Aicken
 *	成绩模块接口设计
 */
public interface AchievementDAO {
	/**
	 * 添加成绩
	 * @param Achievement 成绩实体
	 * @return 返回成绩主键
	 */
	public int InsertAch(TAchievement Achievement);
	/**
	 * 删除成绩
	 * @param Achid 成绩id
	 * @return true 成功 false 失败
	 */
	public boolean deleteAch(int Achid);
}
