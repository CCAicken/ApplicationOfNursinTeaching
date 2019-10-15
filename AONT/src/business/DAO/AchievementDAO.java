package business.DAO;
 
import java.util.List;

import Model.*;

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
	public int Insert(TAchievement Achievement);
	/**
	 * 删除成绩
	 * @param Achid 成绩id
	 * @return true 成功 false 失败
	 */
	public boolean delete(int Achid);
	
	/**
	 * 更改成绩
	 * @param Achievement 成绩实体
	 * @return true 成功 false 失败 
	 */
	public boolean update(TAchievement Achievement);
	/**
	 * 根据id查询 成绩
	 * @return  成绩数据实体
	 */
	public  TAchievement select(int TAchievementid);
	/**
	 * 根据id查询 成绩视图
	 * @return  成绩数据实体
	 */
	public  VAchievement selectVachievement(int Achievementid);
	/**
	 * 查询所有成绩
	 * @return 成绩数据集
	 */
	public List<VAchievement> select();
	
	/**
	 * 根据条件获取符合条件的成绩的数量
	 * 
	 * @param wherecondition
	 *            如："userRole = '超级管理员' and userid = 'zhangjs'"
	 * @return
	 */
	public int getAchievementrAmount(String wherecondition);
	
		
	 /**
	  * 根据条件查询成绩
	  * @param likecondtion 条件
	  * @param currentPage  开始页数
	  * @param pageSize 每页数量
	  * @return 成绩数据集
	  */
	public List<VAchievement> getAchievementByLike(String likecondtion,int currentPage, int pageSize);
	
}
