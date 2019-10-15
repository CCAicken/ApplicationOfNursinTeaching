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
		return bdao.delete(bdao.findById(TAchievement.class, Achid));
	}

	@Override
	public boolean update(TAchievement Achievement) {
		//TAchievement oldAchievement= (TAchievement) bdao.findById(TAchievement.class, Achievement.getAchId());
		 
		return bdao.update(Achievement);
	}

	@Override
	public TAchievement select(int TAchievementid) {
		// TODO Auto-generated method stub
		return  (TAchievement) bdao.findById(TAchievement.class, TAchievementid);
	}

	@Override
	public VAchievement selectVachievement(int Achievementid) {
		// TODO Auto-generated method stub
		return   (VAchievement) bdao.findById(VAchievement.class, Achievementid);
	}

	@Override
	public List<VAchievement> select() {
	
		return 	bdao.select("from VAchievement");
	}

	@Override
	public int getAchievementrAmount(String wherecondition) {
		String hql="from VAchievement ";
		if (wherecondition!=null&&wherecondition.equals("")) {
			hql+=wherecondition;
		}
		
		return bdao.selectValue(hql);
	}

	@Override
	public List<VAchievement> getAchievementByLike(String likecondtion,
			int currentPage, int pageSize) {
		String hql = "from VAchievement";
		if (likecondtion != null && !likecondtion.equals("")) {
			hql += likecondtion;
		}
		hql += " order by achId asc";
		return	  bdao.selectByPage(hql, currentPage, pageSize);
		 
	 
	}
	 
//	public static void main(String[] args) {
//		 
//
//	}
 
}
