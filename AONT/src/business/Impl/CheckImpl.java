package business.Impl;

import java.util.List;

import Basic.iHibBaseDAO;
import Basic.iHibBaseDAOImpl;
import Model.TCheck;
import Model.VCheck;
import business.DAO.CheckDAO;

public class CheckImpl implements CheckDAO {
	private iHibBaseDAO bdao;

	public CheckImpl() {
		this.bdao = new iHibBaseDAOImpl();
	}

	@Override
	public boolean Insert(TCheck Check) {
		Integer id = (Integer) bdao.insert(Check);
		if (id != null && !id.equals("")) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int Checkid) {
		return bdao.delete(bdao.findById(TCheck.class, Checkid));
	}

	@Override
	public boolean update(TCheck Check) {
		return bdao.update(Check);
	}

	@Override
	public TCheck select(int TCheckid) {
		return (TCheck) bdao.findById(TCheck.class, TCheckid);
	}

	@Override
	public VCheck selectVcheck(int Checkid) {
		return (VCheck) bdao.findById(VCheck.class, Checkid);
	}

	@Override
	public List<VCheck> select() {
		return bdao.select("from VCheck");
	}

	@Override
	public int getVCheckAmount(String wherecondition) {
		String hql = "from VCheck ";
		if (wherecondition != null && wherecondition.equals("")) {
			hql += wherecondition;
		}

		return bdao.selectValue(hql);
	}

	@Override
	public List<VCheck> getVCheckByLike(String likecondtion, int currentPage,
			int pageSize) {
		String hql = "from VCheck";
		if (likecondtion != null && !likecondtion.equals("")) {
			hql += likecondtion;
		}
		return bdao.selectByPage(hql, currentPage, pageSize);
	}

	// public static void main(String[] args) {
	// // TODO Auto-generated method stub
	//
	// }

}
