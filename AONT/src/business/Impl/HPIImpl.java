package business.Impl;

import java.util.List;

import Basic.iHibBaseDAO;
import Basic.iHibBaseDAOImpl;
import Model.THPI;
import Model.VHPI;
import business.DAO.HPIDAO;

public class HPIImpl implements HPIDAO {
	private iHibBaseDAO bdao;

	// public void setBdao(iHibBaseDAOImpl bdao) {
	// this.bdao = bdao;
	// }

	public HPIImpl() {
		this.bdao = new iHibBaseDAOImpl();
	}

	@Override
	public int addHPI(THPI hpi) {
		// TODO Auto-generated method stub
		int count = (int) bdao.insert(hpi);
		return count;
	}

	@Override
	public boolean editHPI(THPI hpi) {
		// TODO Auto-generated method stub
		boolean result = bdao.update(hpi);
		return result;
	}

	@Override
	public boolean delHPI(int hpiId) {
		// TODO Auto-generated method stub
		THPI hpi = (THPI) bdao.findById(THPI.class, hpiId);
		boolean result = bdao.delete(hpi);
		return result;
	}

	@Override
	public THPI getByHPIId(int hpiId) {
		// TODO Auto-generated method stub
		THPI ms = (THPI) bdao.findById(THPI.class, hpiId);
		return ms;
	}

	@Override
	public List<THPI> getAllFromTHPI() {
		// TODO Auto-generated method stub
		return bdao.select("from THPI");
	}

	@Override
	public List<VHPI> getAllFromVMS() {
		// TODO Auto-generated method stub

		return bdao.select("from VHPI");
	}

	@Override
	public VHPI getHPIBYPatId(int pid) {
		// TODO Auto-generated method stub
		VHPI ms = (VHPI) bdao.findById(VHPI.class, pid);
		return ms;
	}

	@Override
	public int getMSCount(String strwhere) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from VHPI" + strwhere;
		return bdao.selectValue(hql);
	}

	@Override
	public List<VHPI> getMSByPage(String strwhere, int page, int limit) {
		// TODO Auto-generated method stub
		String hql = "from VHPI" + strwhere;
		return bdao.selectByPage(hql, page, limit);
	}

	@Override
	public THPI isExitByPatId(int patId) {
		// TODO Auto-generated method stub
		return (THPI) bdao.findById(THPI.class, patId);
	}

}
