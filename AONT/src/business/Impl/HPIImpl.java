package business.Impl;

import java.util.List;

import Basic.iHibBaseDAO;
import Basic.iHibBaseDAOImpl;
import Model.THPI;
import Model.VMainSuit;
import business.DAO.HPIDAO;

public class HPIImpl implements HPIDAO {
	private iHibBaseDAO bdao;

	public void setBdao(iHibBaseDAOImpl bdao) {
		this.bdao = bdao;
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
	public List<VMainSuit> getAllFromVMS() {
		// TODO Auto-generated method stub

		return bdao.select("from VMainSuit");
	}

	@Override
	public VMainSuit getHPIBYPatId(int pid) {
		// TODO Auto-generated method stub
		VMainSuit ms = (VMainSuit) bdao.findById(VMainSuit.class, pid);
		return ms;
	}

}
