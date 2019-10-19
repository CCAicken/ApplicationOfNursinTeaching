package business.Impl;

import java.util.List;

import Basic.iHibBaseDAO;
import Basic.iHibBaseDAOImpl;
import Model.TDailyLife;
import Model.VDailyLife;
import business.DAO.DailyLifeDAO;

public class DailyLifeImpl implements DailyLifeDAO {
	private iHibBaseDAO bdao;

	public DailyLifeImpl() {
		this.bdao = new iHibBaseDAOImpl();
	}

	@Override
	public boolean Insert(TDailyLife TDailyLife) {
		Integer id = (Integer) bdao.insert(TDailyLife);
		if (id != null && !id.equals("")) {
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
	public List<VDailyLife> select() {
		return bdao.select("from VDailyLife");
	}

	@Override
	public int getVMainSuitAmount(String wherecondition) {
		String hql = "select count(*) from VDailyLife ";
		if (wherecondition != null && wherecondition.equals("")) {
			hql += wherecondition;
		}
		return bdao.selectValue(hql);
	}

	@Override
	public List<VDailyLife> getVMainSuitByLike(String likecondtion,
			int currentPage, int pageSize) {
		String hql = "from VDailyLife";
		if (likecondtion != null && !likecondtion.equals("")) {
			hql += likecondtion;
		}
		return bdao.selectByPage(hql, currentPage, pageSize);
	}

	@Override
	public TDailyLife isExit(int patId) {
		// TODO Auto-generated method stub
		TDailyLife tdl = (TDailyLife) bdao.findById(TDailyLife.class, patId);
		return tdl;
	}

}
