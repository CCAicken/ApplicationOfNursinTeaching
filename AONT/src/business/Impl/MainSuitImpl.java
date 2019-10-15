package business.Impl;

import java.util.List;

import Basic.iHibBaseDAO;
import Basic.iHibBaseDAOImpl;
import Model.TMainSuit;
import Model.VMainSuit;
import business.DAO.MainSuitDAO;

public class MainSuitImpl implements MainSuitDAO {
	private iHibBaseDAO bdao;

	public void setBdao(iHibBaseDAOImpl bdao) {
		this.bdao = bdao;
	}

	@Override
	public int addMainSuit(TMainSuit ms) {
		// TODO Auto-generated method stub
		int count = (int) bdao.insert(ms);
		return count;
	}

	@Override
	public boolean editMainSuit(TMainSuit ms) {
		// TODO Auto-generated method stub
		boolean result = bdao.update(ms);
		return result;
	}

	@Override
	public boolean delMainSuit(int msId) {
		// TODO Auto-generated method stub
		TMainSuit ms = (TMainSuit) bdao.findById(TMainSuit.class, msId);
		boolean result = bdao.delete(ms);
		return result;
	}

	@Override
	public List<VMainSuit> getAllMs() {
		// TODO Auto-generated method stub
		String hql = "from VMainSuit";
		List<VMainSuit> list = bdao.select(hql);
		return list;
	}

	@Override
	public VMainSuit getMsByMsId(int msId) {
		// TODO Auto-generated method stub
		String hql = "from VMainSuit where mainSuitId=?";
		Object[] para = { msId };
		VMainSuit ms = (VMainSuit) bdao.select(hql, para);
		return ms;
	}

}