package business.Impl;

import java.util.List;

import Basic.iHibBaseDAO;
import Basic.iHibBaseDAOImpl;
import Model.TDiagnosis;
import Model.VDiagnosis;
import business.DAO.DiagnosisDAO;

public class DiagnosisImpl implements DiagnosisDAO {

	private iHibBaseDAO bdao;

	public DiagnosisImpl() {
		this.bdao = new iHibBaseDAOImpl();
	}

	@Override
	public boolean Insert(TDiagnosis TDiagnosis) {
		Integer id = (Integer) bdao.insert(TDiagnosis);
		if (id != null && !id.equals("")) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int TDiagnosisid) {
		return bdao.delete(bdao.findById(TDiagnosis.class, TDiagnosisid));
	}

	@Override
	public boolean update(TDiagnosis TDiagnosis) {
		return bdao.update(TDiagnosis);
	}

	@Override
	public TDiagnosis select(int TDiagnosisid) {
		return (TDiagnosis) bdao.findById(TDiagnosis.class, TDiagnosisid);
	}

	@Override
	public List<VDiagnosis> select() {
		return bdao.select("from VDiagnosis");
	}

	@Override
	public int getVDiagnosisAmount(String wherecondition) {
		String hql = "from VDiagnosis ";
		if (wherecondition != null && wherecondition.equals("")) {
			hql += wherecondition;
		}

		return bdao.selectValue(hql);
	}

	@Override
	public List<VDiagnosis> getVDiagnosisByLike(String likecondtion,
			int currentPage, int pageSize) {
		String hql = "from VDiagnosis";
		if (likecondtion != null && !likecondtion.equals("")) {
			hql += likecondtion;
		}
		return bdao.selectByPage(hql, currentPage, pageSize);
	}

}
