package business.Impl;

import java.util.List;

import Model.TAchievement;
import Model.VAchievement;
import business.DAO.AchievementDAO;
/**
 * 成绩接口实现类
 * @author Aicken
 *
 */
public class AchievementImpl implements AchievementDAO {

 
	@Override
	public int Insert(TAchievement Achievement) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean delete(int Achid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(TAchievement Achievement) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<VAchievement> select() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getAchievementrAmount(String wherecondition) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<VAchievement> getAchievementByLike(String likecondtion,
			int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
