package business.Impl;

import java.util.List;

import Basic.iHibBaseDAO;
import Basic.iHibBaseDAOImpl;
import Model.TPatient;
import Model.VMainSuit;
import business.DAO.PatientDAO;

public class PatientImpl implements PatientDAO {
	private iHibBaseDAO bdao = null;

	public void setBdao(iHibBaseDAOImpl bdao) {
		this.bdao = bdao;
	}

	// public teacherImpl() {
	// bdao = new iHibBaseDAOImpl();
	// }

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
	public VMainSuit getPatByPId(int pId) {
		// TODO Auto-generated method stub
		String hql = "from VMainSuit where patId=?";
		Object[] para = { pId };
		VMainSuit ms = (VMainSuit) bdao.select(hql, para);

		return ms;
	}

	@Override
	public List<VMainSuit> getAllPat() {
		// TODO Auto-generated method stub
		String hql = "from VMainSuit";
		List<VMainSuit> ms = bdao.select(hql);
		return ms;
	}

}
