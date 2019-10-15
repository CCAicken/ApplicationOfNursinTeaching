package business.Impl;

import java.util.List;

import Basic.iHibBaseDAO;
import Basic.iHibBaseDAOImpl;
import Model.TClass;
import Model.TDailyLife;
import Model.VClass;
import Model.VMainSuit;
import business.DAO.DailyLifeDAO;

public class DailyLifeImpl implements DailyLifeDAO {
	private iHibBaseDAO bdao;

	public DailyLifeImpl() {
		this.bdao = new iHibBaseDAOImpl();
	}

	@Override
	public boolean Insert(TDailyLife TDailyLife) {
		Integer id= (Integer) bdao.insert(TDailyLife);
		if (id!=null  && !id.equals("")) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int TDailyLifeid) {
		return bdao.delete(bdao.findById(TDailyLife.class, TDailyLifeid));
	}

	@Override
	public boolean update(TDailyLife TDailyLife) {
		return bdao.update(TDailyLife);
	}

	@Override
	public TDailyLife select(int TDailyLifeid) {
		return (TDailyLife) bdao.findById(TDailyLife.class, TDailyLifeid);
	}

	@Override
	public List<VMainSuit> select() {
		return 	bdao.select("from VMainSuit");
	}

	@Override
	public int getAchievementrAmount(String wherecondition) {
		String hql="from VMainSuit ";
		if (wherecondition!=null&&wherecondition.equals("")) {
			hql+=wherecondition;
		}
		
		return bdao.selectValue(hql);
	}

	@Override
	public List<VMainSuit> getAchievementByLike(String likecondtion,
			int currentPage, int pageSize) {
		String hql = "from VMainSuit";
		if (likecondtion != null && !likecondtion.equals("")) {
			hql += likecondtion;
		} 
		return	  bdao.selectByPage(hql, currentPage, pageSize);
	}

}
