package business.Impl;

import java.util.List;

import org.apache.log4j.chainsaw.Main;

import Basic.iHibBaseDAO;
import Basic.iHibBaseDAOImpl;
import Model.TAchievement;
import Model.VAchievement;
import business.DAO.AchievementDAO;
/**
 * 成绩接口实现类
 * @author Aicken
 *
 */
public class AchievementImpl implements AchievementDAO {
	private iHibBaseDAO bdao;

	public AchievementImpl() {
		this.bdao = new iHibBaseDAOImpl();
	}

	@Override
	public int Insert(TAchievement Achievement) {
		return 	(int) bdao.insert(Achievement);
		
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
	public TAchievement select(int TAchievementid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VAchievement selectVachievement(int Achievementid) {
		// TODO Auto-generated method stub
		return null;
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
	 
	public static void main(String[] args) {
		 

	}
 
}
