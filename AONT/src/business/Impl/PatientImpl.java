package business.Impl;

import java.util.List;

import Basic.iHibBaseDAO;
import Basic.iHibBaseDAOImpl;
import Model.TPatient;
import Model.VMainSuit;
import Model.VPatient;
import business.DAO.PatientDAO;

public class PatientImpl implements PatientDAO {
	private iHibBaseDAO bdao = null;

	// public void setBdao(iHibBaseDAOImpl bdao) {
	// this.bdao = bdao;
	// }

	public PatientImpl() {
		this.bdao = new iHibBaseDAOImpl();
	}

	@Override
	public int addPat(TPatient patient) {
		// TODO Auto-generated method stub
		int count = (int) bdao.insert(patient);
		return count;
	}

	@Override
	public boolean editPat(TPatient patient) {
		// TODO Auto-generated method stub
		boolean result = bdao.update(patient);
		return result;
	}

	@Override
	public boolean delPat(int patId) {
		// TODO Auto-generated method stub
		TPatient patient = (TPatient) bdao.findById(TPatient.class, patId);
		boolean result = bdao.delete(patient);
		return result;
	}

	@Override
	public VPatient getPatByPId(int pId) {
		// TODO Auto-generated method stub
		VPatient ms = (VPatient) bdao.findById(VMainSuit.class, pId);
		return ms;
	}

	@Override
	public List<VPatient> getAllPat() {
		// TODO Auto-generated method stub
		String hql = "from VPatient";
		List<VPatient> ms = bdao.select(hql);
		return ms;
	}

	@Override
	public int getPatCount(String strwhere) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from VMainStui";
		if (strwhere != null && !strwhere.equals("")) {
			hql += strwhere;
		}
		return bdao.selectValue(hql);
	}

	@Override
	public List<VMainSuit> getPatByPage(String strwhere, int page, int limit) {
		// TODO Auto-generated method stub
		String hql = "from MVainSuit" + strwhere;
		return bdao.selectByPage(hql, page, limit);
	}

	@Override
	public int getPatCountForV(String strwhere) {
		// TODO Auto-generated method stub
		String hql = "select count(*) from VPatient";
		if (strwhere != null && !strwhere.equals("")) {
			hql += strwhere;
		}
		return bdao.selectValue(hql);
	}

	@Override
	public List<VPatient> getPatByPageForV(String strwhere, int page, int limit) {
		String hql = "from MVainSuit" + strwhere;
		return bdao.selectByPage(hql, page, limit);
	}

}
