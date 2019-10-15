package business.Impl;

import java.util.List;

import Basic.iHibBaseDAO;
import Basic.iHibBaseDAOImpl;
import Model.TDiaRecord;
import Model.TDiagnosis;
import Model.VDiagnosis;
import business.DAO.DiaRecrdDAO;

public class DiaRecrdImpl implements DiaRecrdDAO {
	private iHibBaseDAO bdao;

	public DiaRecrdImpl() {
		this.bdao = new iHibBaseDAOImpl();
	}
	@Override
	public boolean Insert(TDiaRecord TDiaRecord) {
		Integer id= (Integer) bdao.insert(TDiaRecord);
		if (id!=null  && !id.equals("")) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int TDiaRecordid) {
		return bdao.delete(bdao.findById(TDiaRecord.class, TDiaRecordid));
	}

	@Override
	public boolean update(TDiaRecord TDiaRecord) {
		return bdao.update(TDiaRecord);
	}

	@Override
	public TDiaRecord select(int TDiaRecordid) {
		return (TDiaRecord) bdao.findById(TDiaRecord.class, TDiaRecordid);
	}

	@Override
	public List<VDiagnosis> select() {
		return 	bdao.select("from VDiagnosis");
	}

	@Override
	public int getAchievementrAmount(String wherecondition) {
		String hql="from VDiagnosis ";
		if (wherecondition!=null&&wherecondition.equals("")) {
			hql+=wherecondition;
		}
		
		return bdao.selectValue(hql);
	}

	@Override
	public List<VDiagnosis> getAchievementByLike(String likecondtion,
			int currentPage, int pageSize) {
		String hql = "from VDiagnosis";
		if (likecondtion != null && !likecondtion.equals("")) {
			hql += likecondtion;
		} 
		return	  bdao.selectByPage(hql, currentPage, pageSize);
	}

}
